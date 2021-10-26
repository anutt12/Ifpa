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

    @PostMapping
    public WorldRankings saveWorldRankings(@RequestBody WorldRankings worldRankings){
        return worldRankingsService.saveWorldRankings(worldRankings);
    }

}
