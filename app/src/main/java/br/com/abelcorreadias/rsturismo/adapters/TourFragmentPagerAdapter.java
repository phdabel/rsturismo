package br.com.abelcorreadias.rsturismo.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.abelcorreadias.rsturismo.fragments.LocationFragment;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    public TourFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new LocationFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
