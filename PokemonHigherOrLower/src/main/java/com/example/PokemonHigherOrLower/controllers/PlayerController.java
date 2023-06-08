package com.example.PokemonHigherOrLower.controllers;

import com.example.PokemonHigherOrLower.models.Player;
import com.example.PokemonHigherOrLower.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {
    @Autowired
    PlayerService playerService;


    // GET ALL PLAYER AND GET A PLAYER BY ID
    @GetMapping
    public ResponseEntity<List<Player>> getAllPlayers() {
        List<Player> players = playerService.getAllPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
        Optional<Player> player = playerService.getPlayerById(id);
        if (player.isPresent()) {
            return new ResponseEntity<>(player.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    // CREATE A NEW PLAYER
    @PostMapping
    public ResponseEntity<Player> addNewPlayer(@RequestBody Player player) {
        Player addedPlayer = playerService.addNewPlayer(player);
        return new ResponseEntity<>(addedPlayer, HttpStatus.CREATED);
    }

    // UPDATE PLAYER INFO
    @PutMapping(value = "/{id}")
    public ResponseEntity<Player> updatePlayer(@PathVariable Long id, @RequestBody Player player) {
        player.setId(id);
        playerService.updatePlayer(player);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    // DELETE A PLAYER
    @DeleteMapping(value = "/{id}")
    public ResponseEntity deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return new ResponseEntity(null, HttpStatus.NO_CONTENT);
    }
}
