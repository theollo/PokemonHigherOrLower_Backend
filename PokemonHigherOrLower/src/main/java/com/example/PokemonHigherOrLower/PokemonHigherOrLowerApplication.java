package com.example.PokemonHigherOrLower;

import com.example.PokemonHigherOrLower.services.PokemonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class PokemonHigherOrLowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonHigherOrLowerApplication.class, args);
	}
}
//@SpringBootApplication
//public class PokemonHigherOrLowerApplication {
//
//	private static PokemonService pokemonService;
//
//	@Autowired
//	public PokemonHigherOrLowerApplication(PokemonService pokemonService) {
//		PokemonHigherOrLowerApplication.pokemonService = pokemonService;
//	}
//
//	public static void main(String[] args) throws JsonProcessingException {
//		SpringApplication.run(PokemonHigherOrLowerApplication.class, args);
//			pokemonService.getPokemonTotalBaseStatById(1);
//	}
//
//}
//@SpringBootApplication
//public class PokemonHigherOrLowerApplication {
//	static PokemonService pokemonService = new PokemonService();
//	public static void main(String[] args) throws JsonProcessingException {
//		SpringApplication.run(PokemonHigherOrLowerApplication.class, args);
//		pokemonService.getPokemonStatsById(1);
//	}
//
//}
