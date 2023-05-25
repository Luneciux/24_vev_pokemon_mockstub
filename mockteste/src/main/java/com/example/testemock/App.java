package com.example.testemock;

import java.net.http.HttpResponse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client client = new Client();
        HttpResponse<String> response = client.getPokemon("ditto");

        System.out.println(response.body());
    }
}
