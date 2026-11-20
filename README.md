# Ipdunar Proxy Demo

Ipdunar proxy service demo project, demonstrating how to configure and use Ipdunar proxy gateway in various programming languages.

## Project Structure

```
ipdunar-demo/
├── api/           # API related code
└── proxy/         # Proxy configuration examples
    ├── c#/        # C# example
    ├── c++/       # C++ example
    ├── curl/      # curl command line example
    ├── go/        # Go example
    ├── java/      # Java example
    ├── nodejs/    # Node.js example
    ├── php/       # PHP example
    ├── python/    # Python example
    └── rust/      # Rust example
```

## Proxy Configuration

Ipdunar Proxy Gateway Address:
- **Address**: `gate.ipdunar.com`
- **Port**: `7777`
- **Protocol**: HTTP

Proxy Format: `http://user:pass@gate.ipdunar.com:7777`

## Usage Examples

### Python

```python
import requests

proxies = {
  "http":  "http://user:pass@gate.ipdunar.com:7777",
  "https": "http://user:pass@gate.ipdunar.com:7777",
}

r = requests.get("https://api.target.com/v1/data", proxies=proxies)
```

### Node.js

```javascript
import axios from "axios";
import { HttpsProxyAgent } from "https-proxy-agent";

const agent = new HttpsProxyAgent("http://user:pass@gate.ipdunar.com:7777");
const r = await axios.get("https://api.target.com/v1/data", { httpsAgent: agent });
```

### Go

```go
proxyURL, _ := url.Parse("http://user:pass@gate.ipdunar.com:7777")
client := &http.Client{
    Transport: &http.Transport{Proxy: http.ProxyURL(proxyURL)},
}
r, _ := client.Get("https://api.target.com/v1/data")
```

## Supported Languages

- Python
- Node.js
- Go
- Java
- C#
- C++
- PHP
- Rust
- curl (Command Line)

## Notes

1. Replace `user:pass` with your Ipdunar account credentials
2. Set a reasonable timeout (recommended 30 seconds or more)
3. Configure both HTTP and HTTPS proxies for complete proxy coverage