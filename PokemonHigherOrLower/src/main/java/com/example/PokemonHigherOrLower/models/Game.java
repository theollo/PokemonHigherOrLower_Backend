package com.example.PokemonHigherOrLower.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="games")
public class Game {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="player")
    private Player player;

    public Game(Player player) {
    }
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
