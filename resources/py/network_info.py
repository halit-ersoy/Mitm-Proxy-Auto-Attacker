import subprocess
import re

def get_default_gateway():
    try:
        result = subprocess.check_output(['ip', 'route', 'show', 'default'], text=True)
        gateway_match = re.search(r'default via (\S+)', result)
        if gateway_match:
            return gateway_match.group(1)
    except subprocess.CalledProcessError:
        return None

def get_interface():
    try:
        result = subprocess.check_output(['ip', 'route', 'show'], text=True)
        interface_match = re.search(r'dev (\S+)', result)
        if interface_match:
            return interface_match.group(1)
    except subprocess.CalledProcessError:
        return None

def get_ip_address_and_subnet_mask(interface):
    try:
        result = subprocess.check_output(['ip', 'addr', 'show', interface], text=True)
        ip_match = re.search(r'inet (\d+\.\d+\.\d+\.\d+)/(\d+)', result)
        if ip_match:
            ip_address = ip_match.group(1)
            subnet_prefix = int(ip_match.group(2))
            subnet_mask = '.'.join([str((0xffffffff << (32 - subnet_prefix) >> i) & 0xff) 
                                    for i in [24, 16, 8, 0]])
            return ip_address, subnet_mask
    except subprocess.CalledProcessError:
        return None, None

def main():
    default_gateway = get_default_gateway()
    interface = get_interface()
    if interface:
        ip_address, subnet_mask = get_ip_address_and_subnet_mask(interface)
        print(f"{default_gateway},{ip_address},{subnet_mask},{interface}")
    else:
        print("Could not determine network interface.")

if __name__ == "__main__":
    main()
