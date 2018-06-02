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
import br.com.abelcorreadias.rsturismo.adapters.PartyRecyclerAdapter;
import br.com.abelcorreadias.rsturismo.data.Party;

/**
 * A simple {@link Fragment} subclass.
 */
public class PartyFragment extends Fragment {

    private ArrayList<Party> parties;

    public PartyFragment() {
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

        PartyRecyclerAdapter adapter = new PartyRecyclerAdapter(this.getPartiesAsArray());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    public ArrayList<Party> getParties() {
        return parties;
    }

    public void setParties(ArrayList<Party> parties) {
        this.parties = parties;
    }

    public Party[] getPartiesAsArray(){
        return this.parties.toArray(new Party[this.parties.size()]);
    }
}
