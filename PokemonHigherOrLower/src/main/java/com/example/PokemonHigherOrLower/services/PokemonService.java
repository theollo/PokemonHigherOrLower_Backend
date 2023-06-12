package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Pokemon;
import com.example.PokemonHigherOrLower.models.PokemonPair;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class PokemonService {
    private String apiUrl = "https://pokeapi.co/api/v2/pokemon/";
    Random r = new Random();
    int low = 1;
    int high = 1010;

    public Pokemon getRandomPokemonWithImage() throws JsonProcessingException {
        int result = r.nextInt(high - low) + low;

        String url = apiUrl + result;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode pokemonNode = objectMapper.readTree(responseEntity.getBody());

        String name = pokemonNode.get("name").asText();
        int totalBaseStat = 0;
        for (int i = 0; i < 6; i++) {
            totalBaseStat += pokemonNode.get("stats").get(i).get("base_stat").asInt();
        }

        String imageUrl = pokemonNode.get("sprites").get("other").get("official-artwork").get("front_default").asText();

        return new Pokemon(result, name, totalBaseStat, imageUrl);
    }

    public PokemonPair getRandomPokemonPair() throws JsonProcessingException {
        Pokemon pokemon1 = getRandomPokemonWithImage();
        Pokemon pokemon2 = getRandomPokemonWithImage();
        return new PokemonPair(pokemon1, pokemon2);
    }
}



