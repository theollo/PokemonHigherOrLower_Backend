//package com.example.PokemonHigherOrLower.controllers;
//
//import com.example.PokemonHigherOrLower.services.PlayerService;
//import com.example.PokemonHigherOrLower.services.PokemonService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/game")
//public class GameController {
//    private final PlayerService playerService;
//    private final PokemonService pokemonService;
//
//    public GameController(PlayerService playerService, PokemonService pokemonService) {
//        this.playerService = playerService;
//        this.pokemonService = pokemonService;
//    }
//
//    // constructor, inject services
//
//    @PostMapping("/start")
//    public void startGame(@RequestBody String name) {
//        playerService.createPlayer(name);
//    }
//
//    @PostMapping("/guess/{pokemonId}")
//    public void makeGuess(@PathVariable int pokemonId) {
//        // similar to previous makeGuess, you should compare pokemonId with the one with the highest total power
//    }
//
//    @PostMapping("/reset")
//    public void resetGame() {
//        playerService.resetPlayer();
//    }
//}