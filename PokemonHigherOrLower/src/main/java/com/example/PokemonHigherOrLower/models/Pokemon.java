package com.example.PokemonHigherOrLower.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Pokemon {
    private String name;

    private int Id;

    private int totalPower;


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getTotalPower() {
        return totalPower;
    }

    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }

}

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private int totalBaseStats;
//
//    // Constructors, getters, and setters
//    public Pokemon() {
//    }
//
//    public Pokemon(String name, int totalBaseStats) {
//        this.name = name;
//        this.totalBaseStats = totalBaseStats;
//    }
//
//    // Getters and setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getTotalBaseStats() {
//        return totalBaseStats;
//    }
//
//    public void setTotalBaseStats(int totalBaseStats) {
//        this.totalBaseStats = totalBaseStats;
//    }
//}
