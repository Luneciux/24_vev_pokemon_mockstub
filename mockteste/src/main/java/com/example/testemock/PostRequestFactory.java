package com.example.testemock;

import java.net.http.HttpRequest;

public class PostRequestFactory extends RequestFactory{
    public HttpRequest getRequest(String endpoint, String body){
        PostRequest creator = new PostRequest();
        return creator.generateRequest(endpoint, body);
    }
}
