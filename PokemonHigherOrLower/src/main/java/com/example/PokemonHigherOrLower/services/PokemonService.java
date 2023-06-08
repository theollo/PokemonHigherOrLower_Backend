package com.example.PokemonHigherOrLower.services;

//import com.example.PokemonHigherOrLower.models.PokemonResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Random;

@Service
public class PokemonService {
    private String apiUrl = "https://pokeapi.co/api/v2/pokemon/";

//    int id1= getRandomPokemonId();
//    int id2= getRandomPokemonId();
//
//    private int getRandomPokemonId(){
//        return ThreadLocalRandom.current().nextInt(1,1010);
//    }
    Random r = new Random();
    int low = 10;
    int high = 1010;
    int result = r.nextInt(high-low) + low;

    public Integer getPokemonStatsById(int id) throws JsonProcessingException {
        String url = apiUrl + id;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class, Map.of("id","1"));
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode pokemon = objectMapper.readTree(responseEntity.getBody());

        System.out.println(pokemon.get("stats").get(0).get("base_stat"));

        return null;
    }

}
