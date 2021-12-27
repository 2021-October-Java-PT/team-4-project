package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Waterway;
import org.wecancodeit.com.project.repositories.WaterwayRepository;

import java.util.Optional;

@Controller
public class WaterwayController {

    private WaterwayRepository waterwayRepo;

    public WaterwayController(WaterwayRepository waterwayRepo){this.waterwayRepo=waterwayRepo;}

    @RequestMapping("/waterway/{id}")
    public String displaySingleWaterway(@PathVariable Long id, Model model){
        Optional<Waterway> foundWaterway = waterwayRepo.findById(id);
        model.addAttribute("singleWaterway",foundWaterway.get());
        return "waterway.html";
    }
}
