package com.pinball.ifpa.service;

import com.pinball.ifpa.model.Tournament;

import java.util.List;

public interface TournamentService {

    Tournament saveTournament(Tournament tournament);

    List<Tournament> listTournaments();

    Tournament findByTournamentById(String tournamentId);

}
