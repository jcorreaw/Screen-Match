package application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Title;
import model.TitleOmdb;

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

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(address)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(response.body());

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
            System.out.println(myTitleOmdb);


            Title myTitle = new Title(myTitleOmdb);
            System.out.println("Título já convertido: " + myTitle);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereco.");
        }

        sc.close();
    }
}
