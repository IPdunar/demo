import java.net.http.*;
import java.net.URI;

HttpClient client = HttpClient.newBuilder()
  .proxy( Proxy.of( Type.SOCKS, InetSocketAddress.createUnresolved("gate.ipdunar.com",7777) ) )
  .build();

HttpRequest req = HttpRequest.newBuilder()
  .uri(URI.create("https://api.target.com/v1/data"))
  .build();

HttpResponse<String> r = client.send(req, BodyHandlers.ofString());