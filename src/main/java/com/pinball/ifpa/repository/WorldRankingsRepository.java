package com.pinball.ifpa.repository;

import com.pinball.ifpa.model.WorldRankings;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WorldRankingsRepository extends MongoRepository<WorldRankings, String> {

    @Query("{'worldRankings.rank': 0?}")
    public WorldRankings findByRank (String rank);

}
