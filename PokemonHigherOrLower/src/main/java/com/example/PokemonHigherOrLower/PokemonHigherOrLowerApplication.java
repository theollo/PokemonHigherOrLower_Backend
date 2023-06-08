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
