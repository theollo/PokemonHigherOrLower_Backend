package com.example.PokemonHigherOrLower.controllers;

import com.example.PokemonHigherOrLower.models.PokemonPair;
import com.example.PokemonHigherOrLower.services.PokemonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/randomPair")
    public ResponseEntity<PokemonPair> getRandomPokemonPair() {
        try {
            PokemonPair randomPokemonPair = pokemonService.getRandomPokemonPair();
            return ResponseEntity.ok(randomPokemonPair);
        } catch (JsonProcessingException e) {
            return ResponseEntity.status(500).build();
        }
    }
}






