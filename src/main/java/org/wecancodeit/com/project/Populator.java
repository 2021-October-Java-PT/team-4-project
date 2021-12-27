package org.wecancodeit.com.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.com.project.models.Continent;
import org.wecancodeit.com.project.models.Country;
import org.wecancodeit.com.project.models.Island;
import org.wecancodeit.com.project.models.Waterway;
import org.wecancodeit.com.project.repositories.ContinentRepository;
import org.wecancodeit.com.project.repositories.CountryRepository;
import org.wecancodeit.com.project.repositories.IslandRepository;
import org.wecancodeit.com.project.repositories.WaterwayRepository;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private IslandRepository islandRepo;
    @Resource
    WaterwayRepository waterwayRepo;

    @Override
    public void run(String... args) throws Exception {

        Continent northAmerica = new Continent("North America","description","image url");
        Continent southAmerica = new Continent("South America", "Like North America But south..haha","imageurl");
        Continent europe = new Continent("Europe", "description","image url");
        Continent africa = new Continent("Africa", "description", "image url");
        Continent asia = new Continent("Asia","Cool Place", "image url");
        Continent oceania = new Continent("Oceania","description","image url");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(europe);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(oceania);

        Country unitedStates = new Country("United States", "description", "image url");
        Country britain = new Country("Britain","description","image url");
        Country chile = new Country("Chile", "description", "image url");
        Country columbia = new Country("Columbia","description","image url");
        Country spain = new Country("Spain", "description", "image url");
        Country denmark = new Country("Denmark","description","image url");
        Country netherlands = new Country("Netherlands", "description", "image url");
        Country germany = new Country("Germany","description","image url");
        Country guinea = new Country("Guinea", "description", "image url");
        Country mozambique = new Country("Mozambique","description","image url");
        Country sierraLeone = new Country("Sierra Leone", "description", "image url");
        Country thailand = new Country("Thailand","description","image url");
        Country philippines = new Country("Philippines", "description", "image url");
        Country newZealand = new Country("New Zealand","description","image url");
        Country france = new Country("France","description","image url");
        countryRepo.save(unitedStates);
        countryRepo.save(britain);
        countryRepo.save(chile);
        countryRepo.save(columbia);
        countryRepo.save(spain);
        countryRepo.save(denmark);
        countryRepo.save(netherlands);
        countryRepo.save(germany);
        countryRepo.save(guinea);
        countryRepo.save(mozambique);
        countryRepo.save(sierraLeone);
        countryRepo.save(thailand);
        countryRepo.save(philippines);
        countryRepo.save(netherlands);
        countryRepo.save(newZealand);
        countryRepo.save(france);

        //Islands are actually island chains and specific islands would need to go in description
        Island seaIslandsChain = new Island("Sea Islands Chain", "description", "image url");
        Island caymanIslands = new Island("Cayman Islands", "description","image url");
        Island pribilofIslands = new Island("Pribilof Islands", "description","image url");
        Island archIslands = new Island("Archipielago de Chiloe","description","image of");
        Island archJuan = new Island("Archipielago Jaun Fernandez", "description","image of");
        Island rosarioIslands = new Island("Rosario Islands","description","image url");
        Island balearicIslands = new Island("Balearic Islands","description","image url");
        Island bornholm = new Island("Bornholm Falster Lolland", "description","image url");
        Island frisianIslands = new Island("Frisian Islands","descrition","image url");
        Island losIslands = new Island("Los Islands","description", "image url");
        Island quirimbasIslands = new Island("Quirimbas Islands", "description","image url");
        Island bananaIslands = new Island("Banana Islands","description","image");
        Island westcoast = new Island("West Coast Islands","description","image");
        Island southernIslands = new Island("Southern Islands","description","image");
        Island bacuitGroup = new Island("Bacuit Group of Islands","description","image");
        Island hawaii = new Island("Hawaii", "description", "image");
        Island aucklandIslands = new Island("Auckland Islands","descriptions","image");
        Island australIslands = new Island("AustralIslands","descriptions","image");
        islandRepo.save(seaIslandsChain);
        islandRepo.save(caymanIslands);
        islandRepo.save(pribilofIslands);
        islandRepo.save(archIslands);
        islandRepo.save(archJuan);
        islandRepo.save(rosarioIslands);
        islandRepo.save(balearicIslands);
        islandRepo.save(bornholm);
        islandRepo.save(frisianIslands);
        islandRepo.save(losIslands);
        islandRepo.save(quirimbasIslands);
        islandRepo.save(bananaIslands);
        islandRepo.save(westcoast);
        islandRepo.save(southernIslands);
        islandRepo.save(bacuitGroup);
        islandRepo.save(hawaii);
        islandRepo.save(aucklandIslands);
        islandRepo.save(australIslands);

        Waterway atlanticOcean = new Waterway("Atlantic Ocean","description","image");
        Waterway carribeanSea = new Waterway("Carribean Sea","description","image");
        Waterway beringSea = new Waterway("BeringSea","description","image");
        Waterway pacificOcean = new Waterway("PacificOcean","description","image");
        Waterway balearicSea = new Waterway("balearicSea","description","image");
        Waterway balticSea = new Waterway("Baltic Sea","description","image");
        Waterway northSea = new Waterway("North Sea","description","image");
        Waterway indianOcean = new Waterway("Indian Ocean","description","image");
        Waterway yawriBay = new Waterway("Yawri bay","description","image");
        Waterway gulfOfThailand = new Waterway("Gulf of Thailand","description","image");
        Waterway bacuitBay = new Waterway("Bacuit Bay","description","image");
        Waterway southernPacificOcean = new Waterway("Southern Pacific Ocean","description","image");
        waterwayRepo.save(atlanticOcean);
        waterwayRepo.save(carribeanSea);
        waterwayRepo.save(beringSea);
        waterwayRepo.save(pacificOcean);
        waterwayRepo.save(balearicSea);
        waterwayRepo.save(balticSea);
        waterwayRepo.save(northSea);
        waterwayRepo.save(indianOcean);
        waterwayRepo.save(yawriBay);
        waterwayRepo.save(gulfOfThailand);
        waterwayRepo.save(bacuitBay);
        waterwayRepo.save(southernPacificOcean);


    }
}
