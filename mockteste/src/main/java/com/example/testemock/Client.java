package com.example.testemock;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client implements IClient{

    public static final String BASE_URL = "https://pokeapi.co/api/v2/";

    HttpClient client = HttpClient.newHttpClient();

    public HttpResponse<String> sendRequest(String endpoint, String body, String method){

        HttpRequest request = createRequest(BASE_URL + endpoint, body, method);        

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public HttpRequest createRequest(String endpoint, String body, String method) {

        HttpRequest req = null;
        IRequest creator = null;
        
        switch(method){
            case "POST":
                creator = new PostRequest();
                req = creator.generateRequest(endpoint, body);
                break;
            case "GET":
                creator = new GetRequest();
                req = creator.generateRequest(endpoint, body);
                break;
        }

        return req;
    }

}
