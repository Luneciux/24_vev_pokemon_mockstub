package com.example.testemock;

import java.net.http.HttpRequest;

public interface IRequest {
    public HttpRequest generateRequest(String endpoint, String FILE_JSON);
}
