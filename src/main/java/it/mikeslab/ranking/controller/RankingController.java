package it.mikeslab.ranking.controller;

import it.mikeslab.ranking.entity.Player;
import it.mikeslab.ranking.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankingController {

    private final PlayerRepository playerRepository;

    @Autowired
    public RankingController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @PostMapping("/ranking/{id}/{score}")
    public ResponseEntity<String> postRanking(@PathVariable String id, @PathVariable Long score) {

        Player thePlayer = new Player(id, score);
        playerRepository.save(thePlayer);

        if (playerRepository.getPlayerById(id) == null) {
            return ResponseEntity.internalServerError().body("Couldn't save to the database new player with id " + id);
        }

        return ResponseEntity.ok("OK");
    }

}
