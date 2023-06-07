package com.example.PokemonHigherOrLower.controllers;

import com.example.PokemonHigherOrLower.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pokemon")
public class PokemonController {

    @Autowired
    PokemonService pokemonService;
}
