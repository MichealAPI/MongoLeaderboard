package it.mikeslab.ranking.controller;

import it.mikeslab.ranking.entity.Player;
import it.mikeslab.ranking.repository.PlayerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebController {

    private final PlayerRepository playerRepository;

    public WebController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @GetMapping("/leaderboard")
    public String getLeaderboard(Model model) {

        List<Player> players = playerRepository.findAll();
        model.addAttribute("players", players);

        return "index";
    }

}
