package com.example.testemock;

public class App 
{
    public static void main( String[] args )
    {        
        Pokedex pokedex = new Pokedex();

        try {
            pokedex.showPokemonInfo("ditto");
        } catch (Exception e) {
            System.out.println(e);   
        }
    }
}
