package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Pokemon;
import com.example.PokemonHigherOrLower.models.PokemonResponse;
import com.example.PokemonHigherOrLower.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        return null;
    }

//    private static final String POKEMON_API_URL = "https://pokeapi.co/api/v2/pokemon/";
//
//    private final RestTemplate restTemplate;
//    private final PokemonRepository pokemonRepository;
//
//    @Autowired
//    public PokemonService(RestTemplate restTemplate, PokemonRepository pokemonRepository) {
//        this.restTemplate = restTemplate;
//        this.pokemonRepository = pokemonRepository;
//    }
//
//    public Pokemon getPokemonStats(String pokemonName) {
//        String apiUrl = POKEMON_API_URL + pokemonName;
//
//        PokemonResponse pokemonResponse = restTemplate.getForObject(apiUrl, PokemonResponse.class);
//        if (pokemonResponse != null) {
//            String name = pokemonResponse.getName();
//            int totalBaseStats = calculateTotalBaseStats(pokemonResponse.getStats());
//
//            Pokemon pokemon = new Pokemon();
//            pokemon.setName(name);
//            pokemon.setTotalBaseStats(totalBaseStats);
//
//            return pokemon;
//        } else {
//            throw new RuntimeException("Failed to fetch Pokémon data from the API.");
//        }
//    }
//
//    private int calculateTotalBaseStats(List<Stat> stats) {
//        int total = 0;
//        for (Stat stat : stats) {
//            total += stat.getBaseStat();
//        }
//        return total;
//    }

}
