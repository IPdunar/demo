#include <curl/curl.h>

int main() {
  CURL *curl = curl_easy_init();

curl_easy_setopt(curl, CURLOPT_URL, "https://api.target.com/v1/data");
curl_easy_setopt(curl, CURLOPT_PROXY, "http://user:pass@gate.ipdunar.com:7777");
curl_easy_perform(curl);
curl_easy_cleanup(curl);
}