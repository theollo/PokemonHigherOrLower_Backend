package com.example.PokemonHigherOrLower.repositories;

import com.example.PokemonHigherOrLower.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
