'''
    Get External Ip address and Internal IP address of a host
    1. External IP: The Ip which your router uses to connect to public internet.
    2. Internal IP: The IP used by your device assigned by the network you are connected to.
    *Currently provides IPv4 addresses only*
'''
import re
import requests
import socket

iplookupwebsite = "http://checkip.dyndns.org"
request = requests.get(iplookupwebsite)
clean = request.text.split(': ', 1)[1]
external_ip = clean.split('</body></html>', 1)[0]
pcname = socket.gethostname()
ip_address = socket.gethostbyname(pcname)
print("Host's Name: " + pcname)
print("Internal IP: " + ip_address)
print("External IP: " + external_ip)

'''
    Published By @yuvrajverma01
'''