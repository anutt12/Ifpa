package com.pinball.ifpa.controller;

import com.pinball.ifpa.model.WorldRankings;
import com.pinball.ifpa.service.WorldRankingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/world_rankings")
public class WorldRankingsController {

    @Autowired
    WorldRankingsService worldRankingsService;

    @GetMapping
    public List<WorldRankings> worldRankingsList(){
        return worldRankingsService.listWorldRankings();
    }

    @GetMapping("/world_rankings/{rank}")
    public WorldRankings getByRank(@PathVariable String rank) {return worldRankingsService.findByRank(rank);}

    @PostMapping
    public WorldRankings saveWorldRankings(@RequestBody WorldRankings worldRankings){
        return worldRankingsService.saveWorldRankings(worldRankings);
    }

}
