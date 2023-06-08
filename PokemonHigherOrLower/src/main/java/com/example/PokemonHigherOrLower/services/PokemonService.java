package com.example.PokemonHigherOrLower.services;

//import com.example.PokemonHigherOrLower.models.PokemonResponse;
import com.example.PokemonHigherOrLower.models.Pokemon;
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
    Random r = new Random();
    int low = 10;
    int high = 1010;

    public Pokemon getRandomPokemon() throws JsonProcessingException {
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

        return new Pokemon(result, name, totalBaseStat);
    }
}

//@Service
//public class PokemonService {
//    private String apiUrl = "https://pokeapi.co/api/v2/pokemon/";
//    Random r = new Random();
//    int low = 10;
//    int high = 1010;
//    int result = r.nextInt(high-low) + low;
//
//    public Integer getPokemonTotalBaseStatById(int id) throws JsonProcessingException {
//        String url = apiUrl + id;
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode pokemon = objectMapper.readTree(responseEntity.getBody());
//
//        int totalBaseStat = 0;
//        for (int i = 0; i < 6; i++) {
//            totalBaseStat += pokemon.get("stats").get(i).get("base_stat").asInt();
//        }
//
//        System.out.println(totalBaseStat);
//        return totalBaseStat;
//    }
//}


//@Service
//public class PokemonService {
//    private String apiUrl = "https://pokeapi.co/api/v2/pokemon/";
//
////    int id1= getRandomPokemonId();
////    int id2= getRandomPokemonId();
////
////    private int getRandomPokemonId(){
////        return ThreadLocalRandom.current().nextInt(1,1010);
////    }
//    Random r = new Random();
//    int low = 10;
//    int high = 1010;
//    int result = r.nextInt(high-low) + low;
//
//    public Integer getPokemonStatsById(int id) throws JsonProcessingException {
//        String url = apiUrl + id;
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class, Map.of("id","1"));
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode pokemon = objectMapper.readTree(responseEntity.getBody());
//
//        System.out.println(pokemon.get("stats").get(0).get("base_stat"));
//
//        return null;
//    }
//
//}
