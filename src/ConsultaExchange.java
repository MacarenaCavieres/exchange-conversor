import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaExchange {
    public Exchange conversor(String base_code, String target_code){

        URI direccion = URI.create(
                "https://v6.exchangerate-api.com/v6/5bdcd514b595b5ace9511db5/pair/"
                        + base_code + "/" + target_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try{
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Exchange.class);
        }catch(Exception e){
            throw new RuntimeException("Moneda no encontrada " + e);
        }

    }
}
