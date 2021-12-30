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

        Continent northAmerica = new Continent("North America","North America is a continent in the Northern" +
                " Hemisphere and almost entirely within the Western Hemisphere. It can also be described as the" +
                " northern subcontinent of a single continent, America. It is bordered to the north by the " +
                "Arctic Ocean, to the east by the Atlantic Ocean, to the southeast by South America and the " +
                "Caribbean Sea, and to the west and south by the Pacific Ocean","image url");
        Continent southAmerica = new Continent("South America", "South America is a continent entirely in the" +
                " Western Hemisphere and mostly in the Southern Hemisphere, with a relatively small portion" +
                " in the Northern Hemisphere. ","imageurl");
        Continent europe = new Continent("Europe", "Europe is a landmass variously recognised as part of " +
                "Eurasia or a continent in its own right, located entirely in the Northern Hemisphere and mostly" +
                " in the Eastern Hemisphere. It comprises the westernmost peninsulas of the continental landmass","image url");
        Continent africa = new Continent("Africa", "Africa is the world's second-largest and second-most " +
                "populous continent, after Asia in both cases The continent is surrounded by the Mediterranean Sea" +
                " to the north, the Isthmus of Suez and the Red Sea to the northeast, the Indian Ocean to the " +
                "southeast and the Atlantic Ocean to the west. ", "image url");
        Continent asia = new Continent("Asia","Earth's largest and most populous continent located primarily in the " +
                "Eastern and Northern Hemispheres. In general terms, Asia is bounded on the east by the Pacific Ocean," +
                " on the south by the Indian Ocean, and on the north by the Arctic Ocean. ", "image url");
        Continent oceania = new Continent("Oceania","Oceania is the smallest in land area and the second smallest " +
                "in population after Antarctica.It also spans the eastern and western Hemispheres","image url");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(europe);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(oceania);

        Country unitedStates = new Country("United States", "The United States of America is the world's" +
                " third largest country in size and nearly the third largest in terms of" +
                " population. Located in North America, the country is bordered on the west by " +
                "the Pacific Ocean and to the east by the Atlantic Ocean. ", "image url");
        Country britain = new Country("Britain","Great Britain is an island in the North" +
                " Atlantic Ocean off the northwest coast of continental Europe.The island is dominated by" +
                " a maritime climate with narrow temperature differences between seasons. ","image url");
        Country chile = new Country("Chile", "Chile, officially the Republic of Chile,[b] is a country " +
                "in the western part of South America. It occupies a long, narrow strip of land between " +
                "the Andes to the east and the Pacific Ocean to the west.", "image url");
        Country columbia = new Country("Columbia","Colombia, is a transcontinental country spanning " +
                "South America and an insular region in North America. It is bordered by the Caribbean " +
                "Sea to the north, Venezuela to the east, Brazil to the southeast, Ecuador and Peru to the " +
                "south, the Pacific Ocean to the west, and Panama to the northwest.","image url");
        Country spain = new Country("Spain", "Spain is a country in southwestern Europe with some pockets of " +
                "territory in the Mediterranean Sea, offshore in the Atlantic Ocean and across the Strait" +
                " of Gibraltar.Its continental European territory is situated on the Iberian Peninsula, " +
                "and its insular territory includes the Balearic Islands in the Mediterranean Sea, several small" +
                " islands in the Alboran Sea and the Canary Islands in the Atlantic Ocean.", "image url");
        Country denmark = new Country("Denmark","Denmark is a Nordic country in Northern Europe. " +
                "Includes the autonomous territories of the Faroe Islands and Greenland in the North Atlantic Ocean","image url");
        Country netherlands = new Country("Netherlands", "is a country located in Northwestern " +
                "Europe with territories in the Caribbean.", "image url");
        Country germany = new Country("Germany","Germainy is a country in central Europe and is between the Baltic" +
                " and North seas to the north, and the Alps to the south","image url");
        Country guinea = new Country("Guinea", "is a coastal country in West Africa. Guinea borders the Atlantic Ocean" +
                " to the west, Guinea-Bissau to the northwest, Senegal to the north, Mali to the northeast, Cote d'Ivoire " +
                "to the southeast, and Sierra Leone and Liberia to the south", "image url");
        Country mozambique = new Country("Mozambique","Muzambhiki), is a country located in Southeastern Africa bordered" +
                " by the Indian Ocean to the east, Tanzania to the north, Malawi and Zambia to the northwest, " +
                "Zimbabwe to the west","image url");
        Country sierraLeone = new Country("Sierra Leone", "Salone, is a country on the southwest coast of" +
                " West Africa. It is bordered by Liberia to the southeast and Guinea to the northeast. Sierra " +
                "Leone has a tropical climate with a diverse environment ranging from savanna to rainforests", "image url");
        Country thailand = new Country("Thailand","Thailand, is a country in Southeast Asia and is in the center" +
                " of the Indochinese Peninsula,t is bordered to the north by Myanmar and Laos, to the east by" +
                " Laos and Cambodia, to the south by the Gulf of Thailand and Malaysia, and to the west by" +
                " the Andaman Sea ","image url");
        Country philippines = new Country("Philippines", " in Southeast Asia. It is situated in the western Pacific" +
                " Ocean, and consists of about 7,640 islands, that are broadly categorized under three main" +
                " geographical divisions from north to south: Luzon, Visayas, and Mindanao.", "image url");
        Country newZealand = new Country("New Zealand","New Zealand is an island country in the southwestern" +
                " Pacific Ocean. It consists of two main landmasses—the North Island and the South Island. In additon" +
                " there are over 700 smaller islands","image url");
        Country france = new Country("France","France is a transcontinental country spanning Western Europe and " +
                "overseas regions and territories in the Americas and the Atlantic, Pacific and Indian Oceans.","image url");
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
