package br.com.abelcorreadias.rsturismo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.adapters.TourismRecyclerAdapter;
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

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);

        /**
         *  This setting improves the performance if you know that changes
         *  in content do not change the layout size of the RecyclerView.
         */
        recyclerView.setHasFixedSize(true);

        // uses a linear layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        TourismRecyclerAdapter adapter = new TourismRecyclerAdapter(this.getSitesAsArray());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    public ArrayList<Tourism> getSites() {
        return sites;
    }

    public Tourism[] getSitesAsArray(){
        return this.sites.toArray(new Tourism[this.sites.size()]);
    }

    public void setSites(ArrayList<Tourism> sites) {
        this.sites = sites;
    }
}
