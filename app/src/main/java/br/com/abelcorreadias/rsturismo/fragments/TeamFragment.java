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
import br.com.abelcorreadias.rsturismo.adapters.TeamRecyclerAdapter;
import br.com.abelcorreadias.rsturismo.data.SoccerTeam;

/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment {

    private ArrayList<SoccerTeam> teams;

    public TeamFragment(){}

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

        TeamRecyclerAdapter adapter = new TeamRecyclerAdapter(this.getTeamsAsArray());
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    public void setTeams(ArrayList<SoccerTeam> teams){
        this.teams = teams;
    }

    public ArrayList<SoccerTeam> getTeams(){
        return this.teams;
    }

    public SoccerTeam[] getTeamsAsArray(){
        return this.teams.toArray(new SoccerTeam[this.teams.size()]);
    }



}
