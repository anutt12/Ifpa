package com.pinball.ifpa.controller;

import com.pinball.ifpa.model.TournamentRanking;
import com.pinball.ifpa.service.TournamentRankingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tournaments/{tournament_id}/tournament_rankings")
public class TournamentRankingsController {

    TournamentRankingsService tournamentRankingsService;

    @GetMapping
    List<TournamentRanking> tournamentRankingList() {return tournamentRankingsService.tournamentRankingList();}

}
