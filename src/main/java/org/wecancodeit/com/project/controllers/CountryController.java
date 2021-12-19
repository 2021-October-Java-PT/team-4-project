package org.wecancodeit.com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.com.project.models.Country;
import org.wecancodeit.com.project.repositories.CountryRepository;


import java.util.Optional;

@Controller
public class CountryController {

    private CountryRepository countryRepo;

    public CountryController(CountryRepository countryRepo) {
        this.countryRepo = countryRepo;
    }

    @RequestMapping("/continent/{id}")
    public String displaySingleCountry(@PathVariable Long id, Model model){

        Optional<Country> foundCountry = countryRepo.findById(id);
        model.addAttribute("singleCountry",foundCountry.get());
        return "country.html";
    }
}