package com.pinball.ifpa.repository;

import com.pinball.ifpa.model.WorldRankings;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorldRankingsRepository extends MongoRepository<WorldRankings, String> {
}
