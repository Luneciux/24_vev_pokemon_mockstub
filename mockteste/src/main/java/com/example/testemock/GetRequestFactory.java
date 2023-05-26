package com.example.testemock;

import java.net.http.HttpRequest;

public class GetRequestFactory extends RequestFactory{
    public HttpRequest getRequest(String endpoint, String body){
        GetRequest creator = new GetRequest();
        return creator.generateRequest(endpoint, body);
    }
}
