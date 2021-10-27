package com.pinball.ifpa.repository;

import com.pinball.ifpa.model.TournamentRanking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRankingsRepository extends MongoRepository<TournamentRanking, String> {
}
