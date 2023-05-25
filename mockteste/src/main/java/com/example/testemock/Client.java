package com.example.testemock;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Client implements IClient{

    public static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    HttpClient client = HttpClient.newHttpClient();

    public HttpResponse<String> getPokemon(String pokemon){

        String newURL = BASE_URL + pokemon;

        HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .timeout(Duration.ofSeconds(10))
            .uri(URI.create(newURL))
            .build();

        

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
        

    }

}
