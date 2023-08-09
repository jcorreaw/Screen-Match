package application;

import com.google.gson.Gson;
import model.Title;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ProgramSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um filme para buscar: ");
        var search = sc.nextLine();

        String address = "https://www.omdbapi.com/?t=" + search + "&apikey=269d7262";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(address)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(response.body());

        Gson gson = new Gson();
        Title myTitle = gson.fromJson(json, Title.class);
        System.out.println(myTitle);

        sc.close();
    }
}
