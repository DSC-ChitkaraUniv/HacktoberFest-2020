# Author Yatin Jain
# Data from api using requests module

import requests

url = "https://icanhazdadjoke.com/"
# grab the url which supports api requests

res = requests.get(url, headers={'accept':'application/json'})
# return required JSON file with data

data = res.json()
# return the JSON object with data

print(f"Joke : {data['joke']}")
# grabbing the specific value form data object

print(f"Status: {data['status']}")
# requests status like 200 for success, 404 for failed