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

    /**
     *  Location object and Context object passed during the instantiation of the class.
     */
    private Location location;
    private Context context;

    /**
     * Create a new {@link TourFragmentPagerAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     * @param context is the context of the app
     * @param location is the object containing all the information about the location
     */
    public TourFragmentPagerAdapter(FragmentManager fm, Context context, Location location){
        super(fm);
        this.context = context;
        this.location = location;
    }

    /**
     * Returns the {@link Fragment} that should be displayed for the given page number.
     *
     * @param position
     * @return
     */
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

    /**
     * Total of pages.
     *
     * @return
     */
    @Override
    public int getCount() {
        return 5;
    }

    /**
     * Returns the labels of the tabs.
     *
     * @param position
     * @return
     */
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
