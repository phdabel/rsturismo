package br.com.abelcorreadias.rsturismo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.adapters.TeamAdapter;
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

        TeamAdapter adapter = new TeamAdapter(getActivity(), this.getTeams());

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return rootView;
    }

    public void setTeams(ArrayList<SoccerTeam> teams){
        this.teams = teams;
    }

    public ArrayList<SoccerTeam> getTeams(){
        return this.teams;
    }



}
