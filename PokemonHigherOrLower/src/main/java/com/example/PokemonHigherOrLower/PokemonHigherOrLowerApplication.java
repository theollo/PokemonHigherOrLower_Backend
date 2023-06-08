package com.example.PokemonHigherOrLower;

import com.example.PokemonHigherOrLower.services.PokemonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokemonHigherOrLowerApplication {
	static PokemonService pokemonService = new PokemonService();
	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(PokemonHigherOrLowerApplication.class, args);
		pokemonService.getPokemonStatsById(1);
	}

}
