import java.net.http.HttpClient;

public class ExchangeRate {

    public rate (){

        HttpClient client = HttpClient.newBuilder()
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();


    }

}
