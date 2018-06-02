package br.com.abelcorreadias.rsturismo.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.adapters.TourFragmentPagerAdapter;
import br.com.abelcorreadias.rsturismo.data.Location;
import br.com.abelcorreadias.rsturismo.data.Nightlife;
import br.com.abelcorreadias.rsturismo.data.Party;
import br.com.abelcorreadias.rsturismo.data.Tourism;
import br.com.abelcorreadias.rsturismo.data.SoccerTeam;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = MainActivity.class.getSimpleName();

    private Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        location = new Location("Porto Alegre");
        location.setResourceIdLogo(R.drawable.poa_logo);
        location.setDescription("Porto Alegre, multicultural by nature.\n" +
                "A set of multiple expressions, of varied faces, ethnic and religious origins makes Porto Alegre a rare space where contrasts and difference are always welcome. The city was founded in 1772 by Portuguese Azorean couples. Over the following centuries, it welcomed immigrants from all over the world, particularly Germans, Italians, Spaniards, Africans, Poles and Lebanese, Catholics, Jews, Protestants and Muslims.\n" +
                "\n" +
                "This is Porto Alegre, multicultural by nature, land of great writers, intellectuals, artists and politicians who have marked the history of Brazil. The city, which is capable of producing and hosting large events, with national and international expression, is also the capital that projected from the State of Rio Grande do Sul to the world football players like Ronaldinho and Pato, Olympic champions like Daiane dos Santos and João Derly, and celebrities like the übermodel Gisele Bündchen.\n" +
                "\n" +
                "Tourist gateway in the State and just 120 kilometers from the pleasant Serra Gaúcha, Porto Alegre is a busy hub of services and quality infrastructure recognized, base of large national and international companies and one of the main destinations of international events in Brazil.");
        try{
            Date foundation = new SimpleDateFormat("dd/MM/yyyy").parse("26/03/1772");
            location.setFoundation(foundation);
            location.setTeams(loadTeams());
        }catch(ParseException ex){
            Log.e(TAG, ex.getMessage());
        }
        location.setSites(loadPlaceData());
        location.setParty(loadParties());
        location.setNightlife(loadNightlife());


        /** @TODO modificar o adaptador pra incluir os fragmentos na inicializacao */
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager(), this, this.location);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }

    private ArrayList<SoccerTeam> loadTeams() throws ParseException {
        ArrayList<SoccerTeam> teams = new ArrayList<>();

        SoccerTeam team = new SoccerTeam("Sport Club Internacional");
        team.setResourceIdLogo(R.drawable.internacional_logo);
        team.setStadiumName("Beira Rio");
        team.setResourceIdStadium(R.drawable.estadio_internacional);
        team.setFoundation(new SimpleDateFormat("dd/MM/yyyy").parse("04/04/1909"));
        team.setDescription("The Sport Club Internacional emerged as an option for non-Germans playing football in Porto Alegre. It was founded on April 4, 1909, by the brothers José, Henrique Poppe Leão and Luiz Madeira Poppe. The name Internacional, a homage to the namesake of São Paulo, indicates an opening of the association to people of all origins. The first cup came in 1913, at the Porto Alegre Metropolitan Championship. Since then, a Colorado team has titles. Among them, the World Cup, two Copa Libertadores, a Cup Winners Cup and a South American Cup - won in the 2000s - and three Brazilian Championships - in the 1970s, with the time led by Falcão.");
        teams.add(team);

        team = new SoccerTeam("Grêmio Foot-Ball Porto Alegrense");
        team.setResourceIdLogo(R.drawable.gremio_logo_grande);
        team.setStadiumName("Arena");
        team.setResourceIdStadium(R.drawable.estadio_gremio);
        team.setFoundation(new SimpleDateFormat("dd/MM/yyyy").parse("15/09/1903"));
        team.setDescription("Grêmio Foot-Ball Porto Alegrense was founded on September 15, 1903, in a restaurant in the central region of Porto Alegre. The team won their first championship, the Wanderpreiss Cup, in 1905 - which they would win again in seven other opportunities. Grêmio is, along with Cruzeiro, the greatest champion in the history of the Brazil Cup (four cups). The year 1983 was one of the most remarkable in the history of the team, with the victories of the Copa Libertadores and the World Cup, with then striker Renato Gaúcho having scored the goals of victory against Hamburg, Germany. In 2005, in the title of Series B, the team had historical game against Nautico, the \"Battle of the Afflicted\".");
        teams.add(team);

        return teams;
    }

    private ArrayList<Tourism> loadPlaceData(){
        ArrayList<Tourism> places = new ArrayList<Tourism>();

        Tourism place = new Tourism("Monument to the Expeditionary");
        place.setDescription("The monument honors the \"squares\" of the Brazilian Expeditionary Force (F.E.B), who fought in World War II. It is located in Largo General Yeddo J. Blauth, in the Farroupilha Park, in front of the Military College, and serves as a backdrop for civic ceremonies and Army presentations on commemorative dates.\n" +
                "\n" +
                "On Sundays, when the traditional Brique da Redenção takes place, the monument becomes a stage for shows performed by local and national artists.");
        place.setResourceIdSite(R.drawable.arco_redencao);

        places.add(place);

        place = new Tourism("Casa de Cultura Mário Quintana");
        place.setDescription("The Casa de Cultura Mario Quintana (CCMQ), originally Hotel Majestic, is a historic Brazilian building and cultural center of the city of Porto Alegre, one of the largest and best equipped in Brazil.\n" +
                "\n" +
                "The Hotel Majestic had its heyday in the 1930s, 1940s and 1950s. During this period it had as guests great names in politics, such as former presidents Getúlio Vargas and Jango Goulart, and the artistic world such as Vicente Celestino, Virginia Lane and Francisco Alves. The House was named in honor of one of the greatest Brazilian poets, Mário Quintana, born in the city of Alegrete in the state of Rio Grande do Sul, but who adopted Porto Alegre as his city of heart. The writer lived in the hotel between 1968 and 1980, in apartment 217.");
        place.setResourceIdSite(R.drawable.ccmq);

        places.add(place);

        place = new Tourism("Usina do Gasômetro");
        place.setDescription("Usina do Gasômetro, or simply Gasômetro, is an old Brazilian power generation plant located in Porto Alegre, capital of Rio Grande do Sul. Despite its name, it was actually a coal-fired power plant - the \"Gasômetro\" referred to to the area where today is the Plant, called Volta do Gasômetro.\n" +
                "\n" +
                "It is one of the most traditional points to see the famous sunset of the city, on the shores of Lake Guaíba. Today the Usina do Gasômetro is a great cultural center of the city, being the stage of the most diverse artistic manifestations like theater, dance, paintings, etc.");
        place.setResourceIdSite(R.drawable.gasometro_poa);

        places.add(place);

        place = new Tourism("Cisne Branco");
        place.setDescription("True icon of Porto Alegre, the Cisne Branco boat is a reference in river tourism, entertainment and floating leisure in the capital of Rio Grande do Sul.The Cisne Branco embarkation point is at the Central Gate of the Port of Porto Alegre, which has a special significance in the history of the city, since it was the arrival point of all the passenger ships, including our immigrants.In addition to the regular tours offered, the Cisne Branco is considered a Floating Cultural Space.The Cisne Branco has the capacity to carry 300 passengers and 20 crew, in total safety and comfort. The boat has a wastewater treatment tank, so it does not launch directly into the Guaíba and, in this way, does not pollute its waters.");
        place.setResourceIdSite(R.drawable.cisne_branco_poa);

        places.add(place);

        place = new Tourism("Iberê Camargo Foundation");
        place.setDescription("The Iberê Camargo Foundation, based in the Brazilian city of Porto Alegre, is a cultural entity whose objectives are the preservation, study and dissemination of the work of the Brazilian painter Iberê Camargo (1914-1994).\n" +
                "\n" +
                "The Foundation was created in 1995 by the widow of Iberê Camargo, Maria Coussirat Camargo, to whom he left his artistic collection, one year after the artist's death, in 1994.");
        place.setResourceIdSite(R.drawable.instituto_ibere_camargo);

        places.add(place);

        place = new Tourism("O Laçador");
        place.setDescription("It is a monument of the city of Porto Alegre. It is the representation of the gaucho. It was defined by municipal law as Official Symbol of Porto Alegre in 1992. Its authorship is by the Pelotan sculptor Antônio Caringi. The statue was registered as a historical patrimony of Porto Alegre in 2001. In 2007, the monument was transferred from its original site, the Largo of the Bombeiro, to the site of the Laçador, due to the construction of the Leonel Brizola viaduct.To use an authentic gaucho as a model for his work, Antônio Caringi counted on the folklorist Paixão Côrtes, then a young man who appreciated the customs of the culture of the Rio Grande do Sul, which he posed for the artist with his collection of gauchesque clothing.The monument is made of bronze, is 4.45 meters high and weighs 3.8 tons. The statue has a pedestal of trapezoidal granite of 2.10 meters of height.");
        place.setResourceIdSite(R.drawable.lacador);

        places.add(place);

        place = new Tourism("Public Market");
        place.setDescription("The Central Public Market of Porto Alegre is a historic building in the city of Porto Alegre, the capital of the state of Rio Grande do Sul. The Central Public Market has as boundaries Largo Glênio Peres, Borges de Medeiros Avenue, Júlio de Castilhos Avenue and the Pereira Parobé Square, in the historical center of the city. It is next to the building of the City Hall of Porto Alegre and facing the Chalet of Praça XV.");
        place.setResourceIdSite(R.drawable.mercado_publico_poa);

        places.add(place);

        place = new Tourism("Moinhos de Vento Park");
        place.setDescription("The name Moinhos de Vento Park originated in the eighteenth century, when Antonio Martins Barbosa, from Minas Gerais, settled down with his windmill on the spine where today is Independencia Avenue.\n" +
                "\n" +
                "Today, Moinhos de Vento Park offers leisure options such as jogging, skating, soccer, tennis, volleyball and gym equipment. For the children's audience, there are handmade recreation equipment, made of eucalyptus logs, and a children's library.\n" +
                "\n" +
                "The park also has an Azorean mill, in the style of those that existed in the neighborhood in the early days of the city, an element that constitutes a strong tourist attraction. In the park, the Maria Dinorah Ecological Children's Library also functions.");
        place.setResourceIdSite(R.drawable.parcao);

        places.add(place);

        place = new Tourism("Farroupilha Park");
        place.setDescription("Farroupilha Park, better known as Redenção Park or simply Redenção, is the most traditional and popular park in the Brazilian city of Porto Alegre, capital of the state of Rio Grande do Sul.\n" +
                "\n" +
                "It is a place visited by many seafarers in the hours of rest, whether for sports, sunbathing or fraternizing with friends and family. The perimeter of the park is defined by the streets Setembrina and Luis Englert and the avenues Oswaldo Aranha, João Pessoa and José Bonifácio.");
        place.setResourceIdSite(R.drawable.redencao);

        places.add(place);

        return places;
    }

    private ArrayList<Party> loadParties(){

        ArrayList<Party> parties = new ArrayList<>();

        Party party = new Party("Wood's Porto Alegre");
        party.setPhone("+55 51 3085-4201");
        party.setAddress("Casemiro de Abreu St., 1233 - Boa Vista");
        party.setDescription("Wood's Group specializes in evening entertainment, with branches throughout Brazil. The nightclub of sertaneja music has as partners the singers Fernando and Sorocaba.\n" +
                "\n" +
                "All branches of the nightclub work with live music. Wood's Group performs concerts with national and international artists as well as revealing local singers.");
        party.setResourceIdImage(R.drawable.woods);

        parties.add(party);

        party = new Party("Mulligan Irish Pub");
        party.setPhone("+55 51 3029-3725");
        party.setAddress("Padre Chagas St., 25 - Moinhos de Vento");
        party.setDescription("");
        party.setResourceIdImage(R.drawable.mulligan);

        parties.add(party);

        party = new Party("Complex Skate");
        party.setPhone("+55 51 3062-1869");
        party.setAddress("Protásio Alves Ave, 3839 - Três Figueiras");
        party.setDescription("Two skating rinks, boardshop with the best brands, Mexican restaurant / pub and now also a renowned beauty salon.\n" +
                "\n" +
                "This is Complex Skatepark: a complex that brings together different activities that have everything to do with your lifestyle.");
        party.setResourceIdImage(R.drawable.complex);

        parties.add(party);

        return parties;

    }

    private ArrayList<Nightlife> loadNightlife(){

        ArrayList<Nightlife> places = new ArrayList<>();

        Nightlife night = new Nightlife("Cidade Baixa");
        night.setResourceId(R.drawable.cidade_baixa_poa);
        night.setDescription("The neighborhood is characterized by the large number of bars and is known for being the favorite place of the young and bohemians of the city, mainly in the streets General Lima e Silva, República and João Alfredo.\n" +
                "\n" +
                "It is located near the Farroupilha Park (also known as \"Redenção\"), one of the most wooded areas of the capital. In addition, the proximity of the central campus of the Federal University of Rio Grande do Sul (UFRGS) favors the concentration of students, intellectuals and artists.");

        places.add(night);

        night = new Nightlife("Padre Chagas");
        night.setResourceId(R.drawable.padre_chagas);
        night.setDescription("Located in the heart of the neighborhood Moinhos de Vento, the street is those places reserved for those who like to enjoy and savor the best in everything. From the shops, restaurants, cafes, to the regulars, everything is reminiscent of an exquisite climate, more charming than anywhere else in Porto Alegre. In winter, then, among the looks and boots of the gaucho women, coolers take over the sidewalks to reduce the cold of the fans of the late afternoon cafes, leaving the street with a special touch.");

        places.add(night);

        return places;

    }
}
