package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Player;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void createPlayer(String name) {
        player = new Player(name);
    }

    public void resetPlayer() {
        player = null;
    }
}