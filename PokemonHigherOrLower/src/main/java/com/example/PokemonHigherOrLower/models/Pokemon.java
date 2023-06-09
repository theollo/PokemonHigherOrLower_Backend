package com.example.PokemonHigherOrLower.models;

public class Pokemon {
    private int id;
    private String name;
    private int totalBaseStat;

    public Pokemon(int id, String name, int totalBaseStat) {
        this.id = id;
        this.name = name;
        this.totalBaseStat = totalBaseStat;
    }
    public Pokemon(){

    }

    // getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalBaseStat() {
        return totalBaseStat;
    }

    public void setTotalBaseStat(int totalBaseStat) {
        this.totalBaseStat = totalBaseStat;
    }
}
