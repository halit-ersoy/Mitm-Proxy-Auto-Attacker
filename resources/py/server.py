import os
import argparse
import ssl
from flask import Flask, send_from_directory

app = Flask(__name__)

@app.route('/')
def serve_html():
    directory = os.path.dirname(app.config['html_path'])
    filename = os.path.basename(app.config['html_path'])
    return send_from_directory(directory, filename)

def main():
    parser = argparse.ArgumentParser(description='Flask HTML server')
    parser.add_argument('-p', '--port', type=int, default=5000, help='Port number (default: 5000)')
    parser.add_argument('-ht', '--host', default='127.0.0.1', help='Host (default: 127.0.0.1)')
    parser.add_argument('-pt', '--path', required=True, help='Path to the HTML file')
    parser.add_argument('-ssl', '--ssl', help='Path to the SSL certificate (.pem) file')

    args = parser.parse_args()

    app.config['html_path'] = args.path

    # SSL sertifikası dosyasını ayarlama
    ssl_context = None
    if args.ssl:
        ssl_context = ssl.create_default_context(ssl.Purpose.CLIENT_AUTH)
        ssl_context.load_cert_chain(certfile=args.ssl)

    # Flask uygulamasını başlat
    app.run(host=args.host, port=args.port, ssl_context=ssl_context)

if __name__ == '__main__':
    main()
