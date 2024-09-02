import argparse
from scapy.all import *
from mac_vendor_lookup import MacLookup
import ipaddress

def get_vendor(mac):
    try:
        return MacLookup().lookup(mac)
    except:
        return "Unknown vendor"

def scan_network(interface, count, network_range):
    # Initialize the MacLookup cache
    MacLookup().update_vendors()

    arp = ARP(pdst=network_range)
    ether = Ether(dst="ff:ff:ff:ff:ff:ff")
    packet = ether/arp

    result = srp(packet, iface=interface, timeout=3, verbose=0)[0]
    clients = []

    for sent, received in result:
        clients.append({'ip': received.psrc, 'mac': received.hwsrc})

    # Count packets for each host
    mac_count = {}
    for client in clients:
        mac = client['mac']
        if mac in mac_count:
            mac_count[mac]['count'] += 1
            mac_count[mac]['len'] += len(client)
        else:
            mac_count[mac] = {'ip': client['ip'], 'count': 1, 'len': len(client)}

    # Sort clients by IP
    sorted_clients = sorted(mac_count.items(), key=lambda x: ipaddress.IPv4Address(x[1]['ip']))

    # Print the results
    print(f"\n {count} Captured ARP Req/Rep packets, from {len(sorted_clients)} hosts.   Total size: {count * 60}             ")
    print(" _____________________________________________________________________________")
    print("   IP            At MAC Address     Count     Len  MAC Vendor / Hostname      ")
    print(" -----------------------------------------------------------------------------")

    for mac, info in sorted_clients:
        vendor = get_vendor(mac)
        print(f" {info['ip']: <15} {mac: <17} {info['count']: <7} {info['len']: <5}  {vendor: <30}")

    print(f" Currently scanning: {network_range}   |   Screen View: Unique Hosts")

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description="ARP Network Scanner")
    parser.add_argument("-i", "--interface", required=True, help="Network interface to use for scanning")
    parser.add_argument("-c", "--count", type=int, default=30, help="Number of packets to capture")
    parser.add_argument("-r", "--range", required=True, help="IP range to scan (e.g., 192.168.1.1/24)")

    args = parser.parse_args()

    scan_network(args.interface, args.count, args.range)
