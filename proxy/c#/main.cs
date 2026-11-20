using System.Net;

var handler = new HttpClientHandler()
  Proxy = new WebProxy("http://user:pass@gate.ipdunar.com:7777")
};

var client = new HttpClient(handler);
var r = client.GetAsync("https://api.target.com/v1/data").Result;