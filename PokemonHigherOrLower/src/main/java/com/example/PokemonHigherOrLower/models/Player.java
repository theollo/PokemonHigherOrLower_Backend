package com.example.PokemonHigherOrLower.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="players")
public class Player {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column (name = "username")
    private String username;

    @Column (name = "password")
    private String password;

    @OneToMany(mappedBy = "player")
    @JsonIgnoreProperties({"player"})
    private List<Game> games;

    public Player (String username, String password){
        this.username = username;
        this.password = password;
        this.games = new ArrayList<>();
    }

//getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
