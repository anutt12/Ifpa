package com.pinball.ifpa.service;

import com.pinball.ifpa.model.Tournament;

import java.util.List;

public interface TournamentService {

    public Tournament saveTournment(Tournament tournament);

    public List<Tournament> listTournaments();

}
