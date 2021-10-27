package com.pinball.ifpa.service;

import com.pinball.ifpa.model.Tournament;
import com.pinball.ifpa.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;

    @Override
    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    @Override
    public List<Tournament> listTournaments() {
        return tournamentRepository.findAll();
    }

    @Override
    public Tournament findByTournamentById(String tournamentId) {
        return tournamentRepository.findByTournamentById(tournamentId);
    }

}
