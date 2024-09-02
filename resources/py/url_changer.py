import json
import os
from mitmproxy import http

# iptables komutları
os.system("iptables -t nat -A PREROUTING -p tcp --destination-port 80 -j REDIRECT --to-port 8080")
os.system("iptables -t nat -A PREROUTING -p tcp --destination-port 443 -j REDIRECT --to-port 8080")

# JSON dosyasını okuyup ayarları almak için fonksiyon
def load_config(config_file):
    with open(config_file, 'r') as file:
        return json.load(file)

# Config dosyasını yükle
config = load_config('resources/urls/url_args.json')

# İstekleri işleyen fonksiyon
def request(flow: http.HTTPFlow) -> None:
    # Tüm istekleri tek bir hedef URL'ye yönlendirme modu
    if config["all"].startswith("true"):
        _, target_url = config["all"].split(",,")
        flow.request.url = target_url
    else:
        # Her bir kaynak-hedef çifti için yönlendirme işlemi
        url_mappings = [config.get(f"url{i}") for i in range(1, 7)]
        
        for mapping in url_mappings:
            if mapping and mapping != "disable":
                source, target = mapping.split(",,")
                if flow.request.pretty_url.startswith(source):
                    flow.request.url = target
                    break  # Yönlendirme gerçekleştiyse döngüden çık

