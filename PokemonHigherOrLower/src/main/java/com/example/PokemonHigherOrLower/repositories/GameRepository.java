package com.example.PokemonHigherOrLower.repositories;

import com.example.PokemonHigherOrLower.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
