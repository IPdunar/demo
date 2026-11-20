import axios from "axios";
import { HttpsProxyAgent } from "https-proxy-agent";

const agent = new HttpsProxyAgent(
  "http://user:pass@gate.ipdunar.com:7777"
);

const r = await axios.get(
  "https://api.target.com/v1/data",
  { httpsAgent: agent, timeout: 30000 }
);
console.log(r.status);  // 200