package com.example.testemock;

import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

public class PokedexTest {
    @Test
    public void shouldReturnThePokemonInfo()
    {
        //PEGAR O CLIENTE E MOCKAR
        //COLOCAR PRA DEVOLVER O JSON NO STUB
        // TESTAR SE QUANDO A FUNÇÃO É CHAMADA O RETORNO CONDIZ, DENTRO DO STUB
        Client cliente = Mockito.mock(Client.class);
        Mockito.when(cliente).sendRequest()
        Assertions.assertTrue( true );
    }
    
}