package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Pokemon;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class PokemonService {
    private String apiUrl = "https://pokeapi.co/api/v2/pokemon/";

    int id1= getRandomPokemonId();
    int id2= getRandomPokemonId();

    private int getRandomPokemonId(){
        return ThreadLocalRandom.current().nextInt(1,1010);
    }
    Random r = new Random();
    int low = 10;
    int high = 1010;
    int result = r.nextInt(high-low) + low;

    private Pokemon getPokemonById(int id){
        String url = apiUrl + id;
    }
}
