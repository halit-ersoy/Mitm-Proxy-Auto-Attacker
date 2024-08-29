import json
from mitmproxy import http
import os


os.system("iptables -t nat -A PREROUTING -p tcp --destination-port 80 -j REDIRECT --to-port 8080")
os.system("iptables -t nat -A PREROUTING -p tcp --destination-port 443 -j REDIRECT --to-port 8080")

def request(flow: http.HTTPFlow) -> None:
    request_data = {
        "url": flow.request.url,
        "method": flow.request.method,
        "headers": dict(flow.request.headers),
        "content": flow.request.content.decode('utf-8', errors='replace')  # decode content to string
    }
    print(json.dumps({"request": request_data}, indent=4))


def response(flow: http.HTTPFlow) -> None:
    response_data = {
        "status_code": flow.response.status_code,
        "headers": dict(flow.response.headers),
        "content": flow.response.content.decode('utf-8', errors='replace')  # decode content to string
    }
    print(json.dumps({"response": response_data}, indent=4))
