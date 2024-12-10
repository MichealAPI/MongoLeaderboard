package it.mikeslab.ranking.repository;

import it.mikeslab.ranking.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, String> {

    @Query(value = "{}", sort = "{ 'score': 1 }")
    List<Player> getLeaderboard(int limit);

    Player getPlayerById(String id);

}
