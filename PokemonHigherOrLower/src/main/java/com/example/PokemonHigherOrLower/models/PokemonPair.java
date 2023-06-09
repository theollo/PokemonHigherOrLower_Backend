package com.example.PokemonHigherOrLower.models;


public class PokemonPair {
    private int id1;
    private String name1;
    private int totalBaseStat1;

    private int id2;
    private String name2;
    private int totalBaseStat2;

    public PokemonPair(Pokemon pokemon1, Pokemon pokemon2) {
        this.id1 = pokemon1.getId();
        this.name1 = pokemon1.getName();
        this.totalBaseStat1 = pokemon1.getTotalBaseStat();

        this.id2 = pokemon2.getId();
        this.name2 = pokemon2.getName();
        this.totalBaseStat2 = pokemon2.getTotalBaseStat();
    }
    public PokemonPair(){

    }


    // getters and setters

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public int getTotalBaseStat1() {
        return totalBaseStat1;
    }

    public void setTotalBaseStat1(int totalBaseStat1) {
        this.totalBaseStat1 = totalBaseStat1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getTotalBaseStat2() {
        return totalBaseStat2;
    }

    public void setTotalBaseStat2(int totalBaseStat2) {
        this.totalBaseStat2 = totalBaseStat2;
    }
}



