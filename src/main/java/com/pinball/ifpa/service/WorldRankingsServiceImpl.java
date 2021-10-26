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
        return null;
    }

    @Override
    public List<WorldRankings> listWorldRankings() {
        return null;
    }
}
