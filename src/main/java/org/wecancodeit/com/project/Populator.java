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
        Island seaIslandsChain = new Island("Sea Islands Chain", "The Sea Islands are a chain" +
                " of tidal and barrier islands on the Atlantic Ocean coast of the Southeastern United" +
                " States. Numbering over 100, they are located between the mouths of the Santee and St." +
                " Johns Rivers along the coast of South Carolina, Georgia, and Florida", "image url");
        Island caymanIslands = new Island("Cayman Islands", " territory comprises the three islands of " +
                "Grand Cayman, Cayman Brac and Little Cayman, which are located to the south of Cuba and" +
                " northeast of Honduras, between Jamaica and Mexico's Yucatán Peninsula.","image url");
        Island pribilofIslands = new Island("Pribilof Islands", "are a group of four volcanic islands off the " +
                "coast of mainland Alaska, in the Bering Sea, about 200 miles (320 km) north of Unalaska and 200" +
                " miles (320 km) southwest of Cape Newenham.","image url");
        Island archIslands = new Island("Archipielago de Chiloe","are a group of small islands, off Port Albemarle" +
                " on West Falkland in the Falkland Islands. They are uninhabited, and accessible only by" +
                " boat. They are so called because the largest of the group has a natural" +
                " arch in it, large enough to allow a fair sized boat through.The islands include Big Arch" +
                " Island Clump Island Tussac Island Pyramid Rock Last Rock Albemarle Rock ","image of");
        Island archJuan = new Island("Archipielago Jaun Fernandez", "is a group of islands located in the " +
                "South Pacific, more than 670 km west of the coasts of South America . It is made up of the" +
                " Robinson Crusoe islands (known until 1966 as Más a Tierra ), Alejandro Selkirk " +
                "(known until 1966 as Más Afuera ), the Santa Clara islet and smaller islets.","image of");
        Island rosarioIslands = new Island("Rosario Islands","also referred to as Corales Islas del Rosario" +
                " (Coral Islands of Rosario),is an archipelago located off the coast of Colombia, " +
                "approximately 100 kilometres (62 miles) from Cartagena.It is one of the 46 Natural National" +
                " Parks of Colombia. ","image url");
        Island balearicIslands = new Island("Balearic Islands","are a Spanish archipelago in the Balearic Sea," +
                " near the eastern coast of the Iberian Peninsula. Its four largest islands are Mallorca," +
                " Menorca, Ibiza, and Formentera. ","image url");
        Island bornholm = new Island("Bornholm Falster Lolland", "description","image url");
        Island frisianIslands = new Island("Frisian Islands","The Frisian Islands, also known as the Wadden " +
                "Islands or the Wadden Sea Islands, form an archipelago at the eastern edge of the North Sea in " +
                "northwestern Europe, stretching from the northwest of the Netherlands through Germany" +
                " to the west of Denmark.","image url");
        Island losIslands = new Island("Los Islands","are an island group lying off Conakry in Guinea, on the" +
                " west coast of Africa.There are three main islands: Tamara (Fortoba), Kassa and Roume. ", "image url");
        Island quirimbasIslands = new Island("Quirimbas Islands", "The Quirimbas Islands lie in the Indian" +
                " Ocean off northeastern Mozambique. The archipelago consists of about 32 islands, including Ibo, " +
                "Matemo, Medjumbe, Quirimba, Metundo, Quisiva, Vamizi Island and Rolas Island all going up to the " +
                "Tanzanian border.","image url");
        Island bananaIslands = new Island("Banana Islands","The Banana Islands are a group of islands that " +
                "lie off the coast of Yawri Bay. Three islands make up the Banana Islands: Dublin and Ricketts are " +
                "linked by a stone causeway. The third Mes-Meheux is a privately owned island.","image");
        Island westcoast = new Island("West Coast Islands","description","image");
        Island southernIslands = new Island("Southern Islands","description","image");
        Island bacuitGroup = new Island("Bacuit Group of Islands","description","image");
        Island hawaii = new Island("Hawaii", "Hawaiian Islands are an archipelago of eight major islands, several atolls, numerous" +
                " smaller islets, and seamounts in the North Pacific Ocean. The main islands include: " +
                "The Big Islands, The Valley Ise, The Gathering Place, The Garden Isle, The Friendly Isle," +
                " The Pineapple Isle, The Forbidden Isle, The Target Isle", "image");
        Island aucklandIslands = new Island("Auckland Islands","The main Auckland Island, is surrounded by smaller " +
                "Adams Island, Enderby Island, Disappointment Island, Ewing Island, Rose Island, Dundas Island, " +
                "and Green Island","image");
        Island australIslands = new Island("AustralIslands","are the southernmost group of islands in French " +
                "Polynesia, an overseas country of the French Republic in the South Pacific. Many small islands " +
                "populate this chain","image");
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

        Waterway atlanticOcean = new Waterway("Atlantic Ocean","The Atlantic Ocean is the" +
                " second-largest of the world's five oceans and covers approximately 20% " +
                " of Earth's surface ","image");
        Waterway carribeanSea = new Waterway("Carribean Sea","Carribean Sea is a sea of the Atlantic Ocean in " +
                "the tropics of the Western Hemisphere.  It is bounded by Mexico and Central America to the west and" +
                " south west, to the north by the Greater Antilles starting with Cuba, to the east by the Lesser " +
                "Antilles, and to the south by the north coast of South Americad","image");
        Waterway beringSea = new Waterway("BeringSea"," is a marginal sea of the Northern Pacific Ocean." +
                " It forms, along with the Bering Strait, the divide between the two largest landmasses" +
                " on Earth: Eurasia and The Americas","image");
        Waterway pacificOcean = new Waterway("PacificOcean","The Pacific Ocean is the largest" +
                " and deepest of Earth's five oceanic divisions. It extends from the Arctic Ocean" +
                " in the north to the Southern Ocean in the south and is bounded by the continents" +
                " of Asia and Australia in the west and the Americas in the east.","image");
        Waterway balearicSea = new Waterway("balearicSea","Balearic Sea is a body of water in the" +
                " Mediterranean Sea near the Balearic Islands.The Ebro River flows into this small sea.","image");
        Waterway balticSea = new Waterway("Baltic Sea","The Baltic Sea is an arm of the Atlantic" +
                " Ocean, enclosed by Denmark, Estonia, Finland, Germany, Latvia, Lithuania, Poland, Russia," +
                " Sweden and the North and Central European Plain.","image");
        Waterway northSea = new Waterway("North Sea","The North Sea is a sea of the Atlantic Ocean between" +
                " Great Britain. It is an epeiric sea on the European continental shelf, it connects to the ocean" +
                " through the English Channel in the south and the Norwegian Sea in the north.","image");
        Waterway indianOcean = new Waterway("Indian Ocean","The Indian Ocean is the third-largest of the world's five" +
                " oceanic divisions. It is bounded by Asia to the north, Africa to the west and Australia to the east." +
                " To the south it is bounded by the Southern Ocean","image");
        Waterway yawriBay = new Waterway("Yawri bay","Yawri Bayis a bay in the coast of Sierra Leone on the Atlantic " +
                "Ocean.","image");
        Waterway gulfOfThailand = new Waterway("Gulf of Thailand","The Gulf of Thailand, also known as the Gulf of Siam, " +
                "is a shallow inlet in the southwestern South China Sea, bounded between the southwestern shores" +
                " of the Indochinese Peninsula and the northern half of the Malay Peninsula","image");
        Waterway bacuitBay = new Waterway("Bacuit Bay","description","image");
        Waterway southernPacificOcean = new Waterway("Southern Pacific Ocean","The Pacific Ocean is divided into " +
                "two laregely different bodies of water by the equator. On the southern part of this divide is " +
                "the southern Pacific Ocean.","image");
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
