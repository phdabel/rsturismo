package br.com.abelcorreadias.rsturismo.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.data.Location;
import br.com.abelcorreadias.rsturismo.fragments.LocationFragment;
import br.com.abelcorreadias.rsturismo.fragments.NightlifeFragment;
import br.com.abelcorreadias.rsturismo.fragments.PartyFragment;
import br.com.abelcorreadias.rsturismo.fragments.TourismFragment;
import br.com.abelcorreadias.rsturismo.fragments.TeamFragment;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private Location location;
    private Context context;

    public TourFragmentPagerAdapter(FragmentManager fm, Context context, Location location){
        super(fm);
        this.context = context;
        this.location = location;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                LocationFragment locationFragment = new LocationFragment();
                locationFragment.setLocation(location);
                return locationFragment;
            case 1:
                TourismFragment tourismFragment = new TourismFragment();
                tourismFragment.setSites(location.getSites());
                return tourismFragment;
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return context.getString(R.string.Tab_POA);
            case 1:
                return context.getString(R.string.Tab_Tourism);
            case 2:
                return context.getString(R.string.Tab_Soccer);
            case 3:
                return context.getString(R.string.Tab_Parties);
            case 4:
                return context.getString(R.string.Tab_Night);
        }
        return null;
    }
}
