package com.example.PokemonHigherOrLower.controllers;

import com.example.PokemonHigherOrLower.models.Pokemon;
import com.example.PokemonHigherOrLower.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pokemon")
public class PokemonController {
    @Autowired
    PokemonService pokemonService;


}

//@RestController
//public class PokemonController {
//    private final PokemonService pokemonService;
//
//    @Autowired
//    public PokemonController(PokemonService pokemonService) {
//        this.pokemonService = pokemonService;
//    }
//
//    @GetMapping("/pokemon/{pokemonName}")
//    public Pokemon getPokemonStats(@PathVariable String pokemonName)





