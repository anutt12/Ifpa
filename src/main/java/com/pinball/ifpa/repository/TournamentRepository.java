package com.pinball.ifpa.repository;

import com.pinball.ifpa.model.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends MongoRepository<Tournament, String> {

    @Query("{'tournament.id':?0}")
    public Tournament findByTournamentById(String id);

}
