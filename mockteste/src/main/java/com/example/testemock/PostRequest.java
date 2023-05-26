package com.example.testemock;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;

import java.nio.file.*;

public class PostRequest implements IRequest{

    public HttpRequest generateRequest(String endpoint, String FILE_JSON){

        //EXAMPLE
        //public static final String FILE_JSON = "/home/jm/IdeaProjects/HttpExample/pedido.json";

        try {
            HttpRequest request = HttpRequest.newBuilder()
            .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
            .timeout(Duration.ofSeconds(10))
            .uri(URI.create(endpoint))
            .build();

            return request;

        } catch (Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
}
