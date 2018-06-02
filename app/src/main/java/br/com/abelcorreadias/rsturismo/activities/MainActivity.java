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

    /**
     *  The Location class contains all information about a given city.
     */
    private Location location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        /**
         *  Instantiates a new Location and sets the:
         *  - basic information
         *  - soccer teams information
         *  - historical sites
         *  - parties
         *  - night life information
         */
        location = new Location(getString(R.string.location_name));
        location.setResourceIdLogo(R.drawable.poa_logo);
        location.setDescription(getString(R.string.location_description));
        try{
            Date foundation = new SimpleDateFormat("dd/MM/yyyy").parse(getString(R.string.location_foundation));
            location.setFoundation(foundation);
            location.setTeams(loadTeams());
        }catch(ParseException ex){
            Log.e(TAG, ex.getMessage());
        }
        location.setHistoricalSites(loadHistoricalSitesData());
        location.setParty(loadParties());
        location.setNightlife(loadNightlife());

        /**
         *  The TourFragmentPagerAdapter loads the fragment of each piece of information in the
         *  correct tab of the ViewPager in the app.
         */
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager(), this, this.location);

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);
    }

    /**
     * Returns a list of the soccer teams of the location.
     *
     * @return
     * @throws ParseException
     */
    private ArrayList<SoccerTeam> loadTeams() throws ParseException {
        ArrayList<SoccerTeam> teams = new ArrayList<>();

        SoccerTeam team = new SoccerTeam(getString(R.string.team_1_name));
        team.setResourceIdLogo(R.drawable.internacional_logo);
        team.setStadiumName(getString(R.string.team_1_stadium));
        team.setResourceIdStadium(R.drawable.estadio_internacional);
        team.setFoundation(new SimpleDateFormat("dd/MM/yyyy").parse(getString(R.string.team_1_foundation)));
        team.setDescription(getString(R.string.team_1_description));
        teams.add(team);

        team = new SoccerTeam(getString(R.string.team_2_name));
        team.setResourceIdLogo(R.drawable.gremio_logo_grande);
        team.setStadiumName(getString(R.string.team_2_stadium));
        team.setResourceIdStadium(R.drawable.estadio_gremio);
        team.setFoundation(new SimpleDateFormat("dd/MM/yyyy").parse(getString(R.string.team_2_foundation)));
        team.setDescription(getString(R.string.team_2_description));
        teams.add(team);

        return teams;
    }

    /**
     * Returns the list of the historical sites of the location.
     *
     * @return
     */
    private ArrayList<Tourism> loadHistoricalSitesData(){
        ArrayList<Tourism> places = new ArrayList<Tourism>();

        Tourism place = new Tourism(getString(R.string.tourism_1_name));
        place.setDescription(getString(R.string.tourism_1_description));
        place.setResourceIdSite(R.drawable.arco_redencao);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_2_name));
        place.setDescription(getString(R.string.tourism_2_description));
        place.setResourceIdSite(R.drawable.ccmq);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_3_name));
        place.setDescription(getString(R.string.tourism_3_description));
        place.setResourceIdSite(R.drawable.gasometro_poa);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_4_name));
        place.setDescription(getString(R.string.tourism_4_description));
        place.setResourceIdSite(R.drawable.cisne_branco_poa);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_5_name));
        place.setDescription(getString(R.string.tourism_5_description));
        place.setResourceIdSite(R.drawable.instituto_ibere_camargo);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_6_name));
        place.setDescription(getString(R.string.tourism_6_description));
        place.setResourceIdSite(R.drawable.lacador);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_7_name));
        place.setDescription(getString(R.string.tourism_7_description));
        place.setResourceIdSite(R.drawable.mercado_publico_poa);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_8_name));
        place.setDescription(getString(R.string.tourism_8_description));
        place.setResourceIdSite(R.drawable.parcao);

        places.add(place);

        place = new Tourism(getString(R.string.tourism_9_name));
        place.setDescription(getString(R.string.tourism_9_description));
        place.setResourceIdSite(R.drawable.redencao);

        places.add(place);

        return places;
    }

    /**
     * Returns the parties of the location.
     *
     * @return
     */
    private ArrayList<Party> loadParties(){

        ArrayList<Party> parties = new ArrayList<>();

        Party party = new Party(getString(R.string.party_1_name));
        party.setPhone(getString(R.string.party_1_phone));
        party.setAddress(getString(R.string.party_1_address));
        party.setDescription(getString(R.string.party_1_description));
        party.setResourceIdImage(R.drawable.woods);

        parties.add(party);

        party = new Party(getString(R.string.party_2_name));
        party.setPhone(getString(R.string.party_2_phone));
        party.setAddress(getString(R.string.party_2_address));
        party.setDescription(getString(R.string.party_2_description));
        party.setResourceIdImage(R.drawable.mulligan);

        parties.add(party);

        party = new Party(getString(R.string.party_3_name));
        party.setPhone(getString(R.string.party_3_phone));
        party.setAddress(getString(R.string.party_3_address));
        party.setDescription(getString(R.string.party_3_description));
        party.setResourceIdImage(R.drawable.complex);

        parties.add(party);

        return parties;

    }

    /**
     * Returns information about the night life.
     * @return
     */
    private ArrayList<Nightlife> loadNightlife(){

        ArrayList<Nightlife> places = new ArrayList<>();

        Nightlife night = new Nightlife(getString(R.string.night_1_name));
        night.setResourceId(R.drawable.cidade_baixa_poa);
        night.setDescription(getString(R.string.night_1_description));

        places.add(night);

        night = new Nightlife(getString(R.string.night_2_name));
        night.setResourceId(R.drawable.padre_chagas);
        night.setDescription(getString(R.string.night_2_description));

        places.add(night);

        return places;

    }

}
