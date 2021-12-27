package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Island;
import org.wecancodeit.com.project.repositories.IslandRepository;

import java.util.Optional;

@Controller
public class IslandController {

    private IslandRepository islandRepo;

    public IslandController(IslandRepository islandRepo) {
        this.islandRepo = islandRepo;
    }

    @RequestMapping("/islands/{id}")
    public String displaySingleIsland(@PathVariable Long id, Model model) {

        Optional<Island> foundIsland = islandRepo.findById(id);
        model.addAttribute("islandModel", foundIsland.get());
        return "islandView";
    }

    @RequestMapping("/islands")
    public String displayIslands(Model model) {
        model.addAttribute("islandsModel", islandRepo.findAll());
        return "islandsView";
    }
}
