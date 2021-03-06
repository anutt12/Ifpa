package com.pinball.ifpa.service;

import com.pinball.ifpa.model.WorldRankings;

import java.util.List;

public interface WorldRankingsService {

    public WorldRankings saveWorldRankings(WorldRankings worldRankings);

    public List<WorldRankings> listWorldRankings();

    public WorldRankings findByRank(String rank);

    public WorldRankings getAllByRankOrderByRank(WorldRankings worldRankings);
}
