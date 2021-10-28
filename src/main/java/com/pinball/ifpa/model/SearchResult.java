package com.pinball.ifpa.model;

import java.util.Objects;

public class SearchResult {

    private final String rank;
    private final String name;
    private final String location;
    private final String wppr;
    private final String rating;
    private final String effPct;
    private final String bestTournamentName;

    public SearchResult(String rank, String name, String location, String wppr, String rating, String effPct, String bestTournamentName) {
        this.rank = rank;
        this.name = name;
        this.location = location;
        this.wppr = wppr;
        this.rating = rating;
        this.effPct = effPct;
        this.bestTournamentName = bestTournamentName;
    }

    public String getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getWppr() {
        return wppr;
    }

    public String getRating() {
        return rating;
    }

    public String getEffPct() {
        return effPct;
    }

    public String getBestTournamentName() {
        return bestTournamentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SearchResult)) return false;
        SearchResult that = (SearchResult) o;
        return rank.equals(that.rank) && name.equals(that.name) && location.equals(that.location) && wppr.equals(that.wppr) && rating.equals(that.rating) && effPct.equals(that.effPct) && bestTournamentName.equals(that.bestTournamentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, name, location, wppr, rating, effPct, bestTournamentName);
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", wppr='" + wppr + '\'' +
                ", rating='" + rating + '\'' +
                ", effPct='" + effPct + '\'' +
                ", bestTournamentName='" + bestTournamentName + '\'' +
                '}';
    }
}
