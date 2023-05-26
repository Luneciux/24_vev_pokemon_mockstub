package com.example.testemock;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface IClient {
    public HttpResponse<String> sendRequest(String endpoint, String body, String method);
    public HttpRequest createRequest(String endpoint, String body, String method);
}
