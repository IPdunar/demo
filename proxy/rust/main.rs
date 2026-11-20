use reqwest::blocking::Client;

fn main() {
  let client = Client::builder()
  .proxy( reqwest::Proxy::https("http://user:pass@gate.ipdunar.com:7777").unwrap() )
  .build().unwrap();


  let r = client.get("https://api.target.com/v1/data") .send().unwrap();
}