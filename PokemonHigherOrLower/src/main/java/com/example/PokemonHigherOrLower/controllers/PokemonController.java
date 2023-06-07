package com.example.PokemonHigherOrLower.controllers;

import com.example.PokemonHigherOrLower.models.Pokemon;
import com.example.PokemonHigherOrLower.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pokemon")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;

    @GetMapping(value ="/{id}")
    public ResponseEntity<List<Pokemon>> comparePokemon(){
        List<Pokemon>pokemonList = pokemonService.getTwoRandomPokemon();
        return ResponseEntity.ok(pokemonList);
    }
}
