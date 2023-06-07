package com.example.PokemonHigherOrLower.repositories;

import com.example.PokemonHigherOrLower.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
