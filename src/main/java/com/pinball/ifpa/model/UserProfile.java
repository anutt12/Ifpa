package com.pinball.ifpa.model;

import org.springframework.data.mongodb.core.index.Indexed;

public class UserProfile {

//    private String firstName;
//    private String lastName;
    private String name;

    @Indexed(unique = true)
    private String email;
    private String mobile;
    private String tournamentId;
    private Long rank;
    private String city;
    private String state;
    private String country;
    private Long bestTournamentRank;
    private String bestTournamentName;

    public UserProfile() {
    }

//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Long getRank() {
        return rank;
    }

    public void setRank(Long rank) {
        this.rank = rank;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getBestTournamentRank() {
        return bestTournamentRank;
    }

    public void setBestTournamentRank(Long bestTournamentRank) {
        this.bestTournamentRank = bestTournamentRank;
    }

    public String getBestTournamentName() {
        return bestTournamentName;
    }

    public void setBestTournamentName(String bestTournamentName) {
        this.bestTournamentName = bestTournamentName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
