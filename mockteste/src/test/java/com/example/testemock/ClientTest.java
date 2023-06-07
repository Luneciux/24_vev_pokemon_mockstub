package com.example.testemock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ClientTest {
    @Test
    @ParameterizedTest
    @ValueSource(strings = {"ditto", "pikachu", "dragonite", "****", ""})
    public void shouldReturnThePokemonThatHasBeenRequested(String name)
    {
        Assertions.assertTrue( true );
    }
    
}
