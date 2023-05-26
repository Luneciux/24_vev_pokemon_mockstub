package com.example.testemock;

import java.net.URI;
import java.net.http.HttpRequest;
import java.time.Duration;

public class GetRequest implements IRequest{

    public HttpRequest generateRequest(String endpoint, String FILE_JSON){
        
        HttpRequest request = HttpRequest.newBuilder()
            .GET()
            .timeout(Duration.ofSeconds(10))
            .uri(URI.create(endpoint))
            .build();
        
        return request;
    }
    
}
