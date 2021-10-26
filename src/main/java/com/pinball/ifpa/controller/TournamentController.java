package com.pinball.ifpa.controller;

import com.pinball.ifpa.model.Tournament;
import com.pinball.ifpa.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {

    @Autowired
    TournamentService tournamentService;

    @GetMapping
    public List<Tournament> listTournaments(){
        return tournamentService.listTournaments();
    }

    @PostMapping
    public Tournament saveTournament(@RequestBody Tournament tournament){
        return tournamentService.saveTournment(tournament);
    }

}
