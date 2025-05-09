import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ExchangeRate {

    public rate (){


        URI urlCreate = URI.create("https://v6.exchangerate-api.com/v6/8a494251f5c4cf938268006a/latest/USD")

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

         HttpRequest request = HttpRequest.newBuilder()
                .uri(urlCreate)
                .build();




    }

}
