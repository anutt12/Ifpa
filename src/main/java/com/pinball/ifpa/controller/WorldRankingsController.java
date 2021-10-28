package com.pinball.ifpa.controller;

import com.pinball.ifpa.model.WorldRankings;
import com.pinball.ifpa.service.WorldRankingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorldRankingsController {

    @Autowired
    WorldRankingsService worldRankingsService;

//    @GetMapping("/world_rankings")
//    public List<WorldRankings> worldRankingsList(){
//        return worldRankingsService.listWorldRankings();
//    }

    @GetMapping("/world_rankings/{rank}")
    public WorldRankings getByRank(@PathVariable String rank) {return worldRankingsService.findByRank(rank);}

    @GetMapping("/world_rankings")
    public WorldRankings getAllByRankOrderByRank(@RequestBody WorldRankings worldRankings){
        return worldRankingsService.getAllByRankOrderByRank(worldRankings);
    }

    @PutMapping("/world_rankings")
    public WorldRankings saveWorldRankings(@RequestBody WorldRankings worldRankings){
        return worldRankingsService.getAllByRankOrderByRank(worldRankings);
    }

}
