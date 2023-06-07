package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class PokemonService {
    private String apiUrl = "https://pokeapi.co/api/v2/pokemon/";
    private RestTemplate restTemplate;

    public PokemonService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    int id1= getRandomPokemonId();
    int id2= getRandomPokemonId();

    public List<Pokemon> getTwoRandomPokemon() {
        List<Pokemon> pokemonList = new ArrayList<>();

        Pokemon pokemon1 = getPokemonById(id1);
        Pokemon pokemon2 = getPokemonById(id2);

        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        return pokemonList;
    }

    private int getRandomPokemonId(){
        return ThreadLocalRandom.current().nextInt(1,1010);
    }
//    Random randomId = new Random(){
//    int low = 1;
//    int high = 1010;
//    int result = randomId.nextInt(high - low) + low;


    private Pokemon getPokemonById(int id){
        String url = apiUrl + id;
        Pokemon pokemon = restTemplate.getForObject(url, Pokemon.class);
    if (pokemon != null){
        int totalPower = calculateTotalPower(pokemon);
        pokemon.setTotalPower(totalPower);
    }
    return pokemon;
    }

    private int calculateTotalPower(Pokemon pokemon){
        int totalPower = 0;
        int
    }
}
