package com.example.testemock;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Client implements IClient{

    public static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";

    HttpClient client = HttpClient.newHttpClient();

    public HttpResponse<String> sendRequest(String endpoint, String method){

        //String newURL = BASE_URL + pokemon;

        //usar create request para pegar uma requisição

        //passar a requisição no try catch abaixo

        

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public HttpRequest createRequest() {
        //public enum String {}

        //criar um enum de metodos

        //receber esse metodo pelo parametro 

        //fazer um switch e instaciar uma requisição que será usada, baseada no metodo
    }

}
