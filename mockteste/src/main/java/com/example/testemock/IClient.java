package com.example.testemock;

import java.net.http.HttpResponse;

public interface IClient {
    public HttpResponse<String> getPokemon(String pokemon);
}
