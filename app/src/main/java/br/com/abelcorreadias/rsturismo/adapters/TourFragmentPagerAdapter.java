package br.com.abelcorreadias.rsturismo.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.abelcorreadias.rsturismo.data.Location;
import br.com.abelcorreadias.rsturismo.fragments.LocationFragment;
import br.com.abelcorreadias.rsturismo.fragments.NightlifeFragment;
import br.com.abelcorreadias.rsturismo.fragments.PartyFragment;
import br.com.abelcorreadias.rsturismo.fragments.PlaceFragment;
import br.com.abelcorreadias.rsturismo.fragments.TeamFragment;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private Location location;

    public TourFragmentPagerAdapter(FragmentManager fm, Location location){
        super(fm);
        this.location = location;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new LocationFragment();
            case 1:
                PlaceFragment placeFragment = new PlaceFragment();
                placeFragment.setPlaces(location.getPlaces());
                return placeFragment;
            case 2:
                TeamFragment teamFragment = new TeamFragment();
                teamFragment.setTeams(location.getTeams());
                return teamFragment;
            case 3:
                PartyFragment partyFragment = new PartyFragment();
                partyFragment.setParties(location.getParty());
                return partyFragment;
            case 4:
                NightlifeFragment nightFragment = new NightlifeFragment();
                nightFragment.setNight(location.getNightlife());
                return nightFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
