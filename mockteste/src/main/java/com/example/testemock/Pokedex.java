package com.example.testemock;

import java.net.http.HttpResponse;

public class Pokedex implements IPokedex{
    Client client = new Client();
    Pokemon pokemon = new Pokemon();

    public void showPokemonInfo(String name) {
        try {
            HttpResponse<String> response = client.sendRequest("pokemon/" + name + "/", "", "GET");
            pokemon = pokemon.createPokemon(response);
            System.out.println("NOME: " + pokemon.name + "\n" +  "POKEDEX NUMBER" + pokemon.order + "\n");
        } catch (Exception e) {
            System.out.println(e);   
        }
    }
}
