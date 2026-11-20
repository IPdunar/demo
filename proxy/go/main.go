package main

import (
	"net/http"
	"net/url"
)

func main() {
	proxyURL, _ := url.Parse("http://user:pass@gate.ipdunar.com:7777")
	client := &http.Client{
		Transport: &http.Transport{Proxy: http.ProxyURL(proxyURL)},
	}
	r, _ := client.Get("https://api.target.com/v1/data")
	defer r.Body.Close()
}
