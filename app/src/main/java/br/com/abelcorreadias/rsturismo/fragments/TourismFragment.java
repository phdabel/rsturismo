package br.com.abelcorreadias.rsturismo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.adapters.TourismAdapter;
import br.com.abelcorreadias.rsturismo.data.Tourism;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourismFragment extends Fragment {

    private ArrayList<Tourism> sites;

    public TourismFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_listview, container, false);

        TourismAdapter adapter = new TourismAdapter(getActivity(), this.getSites());

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

    public ArrayList<Tourism> getSites() {
        return sites;
    }

    public void setSites(ArrayList<Tourism> sites) {
        this.sites = sites;
    }
}
