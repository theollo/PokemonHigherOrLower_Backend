package com.example.PokemonHigherOrLower.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.beans.ConstructorProperties;

@Entity(name="games")
public class Game {
    @Id
    private Long id;

    @Column
    private int score;

    @Column
    private boolean isComplete;

//    @ManyToOne
//    @JoinColumn(name="player")
//    private Player player;

    @JsonIgnoreProperties({"games"})
    @ManyToOne
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;

    // Constructor
    public Game(Player player) {
        this.score = 0;
        this.isComplete = false;
        this.player = player;
    }

    // empty constructor
    public Game(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
