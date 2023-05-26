package com.example.testemock;

import java.net.http.HttpRequest;

public abstract class RequestFactory {
    public abstract HttpRequest getRequest(String endpoint, String body);
}
