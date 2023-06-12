package com.example.PokemonHigherOrLower.services;

import com.example.PokemonHigherOrLower.models.Game;
import com.example.PokemonHigherOrLower.models.Player;
import com.example.PokemonHigherOrLower.models.Reply;
import com.example.PokemonHigherOrLower.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    PlayerService playerService;

    @Autowired
    GameRepository gameRepository;

    public Reply createNewGame(long playerId) {
        Game game = new Game(playerService.getPlayerById(playerId).get());
        gameRepository.save(game);
        return new Reply(game.getScore());
    }

    public Reply terminateGame(Long id){
        Game game = gameRepository.findById(id).get();
        game.setComplete(true);
        gameRepository.save(game);
        return new Reply(game.getScore());
    }
}
