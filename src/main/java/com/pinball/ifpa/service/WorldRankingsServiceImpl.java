package com.pinball.ifpa.service;

import com.pinball.ifpa.model.WorldRankings;
import com.pinball.ifpa.repository.WorldRankingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorldRankingsServiceImpl implements WorldRankingsService {

    @Autowired
    WorldRankingsRepository worldRankingsRepository;

    @Override
    public WorldRankings saveWorldRankings(WorldRankings worldRankings) {
        return worldRankingsRepository.save(worldRankings);
    }

    @Override
    public List<WorldRankings> listWorldRankings() {
        return worldRankingsRepository.findAll();
    }

    @Override
    public WorldRankings findByRank(String rank) {
        return worldRankingsRepository.findByRank(rank);
    }

    @Override
    public WorldRankings getAllByRankOrderByRank(WorldRankings worldRankings) {
        return worldRankingsRepository.getAllByRankOrderByRank(worldRankings);
    }
}
