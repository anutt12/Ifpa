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
    public Tournament saveTournment(Tournament tournament) {
        return null;
    }

    @Override
    public List<Tournament> listTournaments() {
        return null;
    }
}
