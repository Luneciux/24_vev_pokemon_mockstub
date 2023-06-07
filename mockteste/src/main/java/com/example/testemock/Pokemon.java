package com.example.testemock;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Pokemon{

    String name = "";
    String order = "";

    final ObjectMapper mapper = new ObjectMapper();
    Map<String, Object> map = new HashMap<String, Object>();
    
    public Pokemon createPokemon (HttpResponse<String> pokemonResponse) {
        try {
            map = mapper.readValue(pokemonResponse.body().toString(), new TypeReference<HashMap<String,Object>>(){});
        } catch (Exception e) {
            System.out.println(e);
        }

        Pokemon created = new Pokemon();

        created.name = map.get("name").toString();
        created.order = map.get("order").toString();

        return created;
    }
}
