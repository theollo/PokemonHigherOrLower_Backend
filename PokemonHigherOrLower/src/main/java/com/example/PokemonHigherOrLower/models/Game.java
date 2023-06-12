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
    private int highScore;

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
        this.highScore = 0;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }
}
