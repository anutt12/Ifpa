package com.pinball.ifpa.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Annotation;

@Document
public class WorldRankings {

    private String name;
    // World Pinball Player Rankings
    private Double wppr;
    private Double rating;
    // Efficiency Percentage
    private Double effPct;
    private String rank;

    public WorldRankings() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWppr() {
        return wppr;
    }

    public void setWppr(Double wppr) {
        this.wppr = wppr;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getEffPct() {
        return effPct;
    }

    public void setEffPct(Double effPct) {
        this.effPct = effPct;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}