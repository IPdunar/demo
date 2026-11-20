import requests

proxies = {
  "http":  "http://user:pass@gate.ipdunar.com:7777",
  "https": "http://user:pass@gate.ipdunar.com:7777",
}

r = requests.get(
  "https://api.target.com/v1/data",
  proxies=proxies,
  timeout=30,
)
print(r.status_code)  # 200