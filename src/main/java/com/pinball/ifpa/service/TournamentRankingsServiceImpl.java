package com.pinball.ifpa.service;

import com.pinball.ifpa.model.TournamentRanking;
import com.pinball.ifpa.repository.TournamentRankingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentRankingsServiceImpl implements TournamentRankingsService{

    @Autowired
    TournamentRankingsRepository tournamentRankingsRepository;

    @Override
    public TournamentRanking saveTournamentRanking(TournamentRanking tournamentRanking) {
        return tournamentRankingsRepository.save(tournamentRanking);
    }

    @Override
    public List<TournamentRanking> tournamentRankingList() {
        return tournamentRankingsRepository.findAll();
    }

}
