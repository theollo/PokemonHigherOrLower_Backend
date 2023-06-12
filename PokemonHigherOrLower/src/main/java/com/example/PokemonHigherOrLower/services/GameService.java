package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Game;
import com.example.PokemonHigherOrLower.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    PlayerService playerService;

    public Reply createNewGame(long playerId) {
        Game game = new Game(playerService.getPlayerById(playerId).get());
        gameRepository.save(game);
        return new Reply(game.getScore());
    }
}
