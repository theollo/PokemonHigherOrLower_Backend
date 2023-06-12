package com.example.PokemonHigherOrLower.controllers;

import com.example.PokemonHigherOrLower.models.Reply;
import com.example.PokemonHigherOrLower.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/games"})
public class GameController {

    @Autowired
    GameService gameService;

    // POST to create game
    @PostMapping
    public ResponseEntity<Reply> createNewGame(@RequestParam long playerId) {
        Reply reply = gameService.createNewGame(playerId);
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<Reply> endGame(@PathVariable Long id) {
        Reply reply = gameService.terminateGame(id);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }

}
