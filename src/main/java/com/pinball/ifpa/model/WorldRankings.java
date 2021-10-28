package com.pinball.ifpa.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Annotation;

@Document
public class WorldRankings  {

    private String rank;
    private String name;
    private String location;
    // World Pinball Player Rankings
    private String wppr;
    private String rating;
    // Efficiency Percentage
    private String effPct;
    private String bestTournament;

    public WorldRankings() {
    }

    public WorldRankings(String rank, String name, String location, String wppr, String rating, String effPct, String bestTournament) {
        this.name = name;
        this.location = location;
        this.wppr = wppr;
        this.rating = rating;
        this.effPct = effPct;
        this.rank = rank;
        this.bestTournament = bestTournament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWppr() {
        return wppr;
    }

    public void setWppr(String wppr) {
        this.wppr = wppr;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getEffPct() {
        return effPct;
    }

    public void setEffPct(String effPct) {
        this.effPct = effPct;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBestTournament() {
        return bestTournament;
    }

    public void setBestTournament(String bestTournament) {
        this.bestTournament = bestTournament;
    }
}