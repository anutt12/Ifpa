package com.pinball.ifpa.service;

import com.pinball.ifpa.model.TournamentRanking;
import com.pinball.ifpa.repository.TournamentRankingsRepository;

import java.util.List;

public interface TournamentRankingsService {

    TournamentRanking saveTournamentRanking(TournamentRanking tournamentRanking);

    List<TournamentRanking> tournamentRankingList();

}
