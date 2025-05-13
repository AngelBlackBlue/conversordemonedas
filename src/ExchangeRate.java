import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRate {

    public ConversionRate conversor (String moneda1, String moneda2, double monto){

        URI urlCreate =
                URI.create("https://v6.exchangerate-api.com/v6/8a494251f5c4cf938268006a/pair/"+moneda1+"/"+moneda2);

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(urlCreate)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), ConversionRate.class);



        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
