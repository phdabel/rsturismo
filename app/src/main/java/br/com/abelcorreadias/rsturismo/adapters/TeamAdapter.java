package br.com.abelcorreadias.rsturismo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.CDATASection;

import br.com.abelcorreadias.rsturismo.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import br.com.abelcorreadias.rsturismo.data.SoccerTeam;

public class TeamAdapter extends ArrayAdapter<SoccerTeam> {

    public TeamAdapter(Context context, ArrayList<SoccerTeam> teams){
        super(context, 0, teams);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.soccer_team_item_list_view,
                    parent,
                    false);
        }

        SoccerTeam currentTeam = getItem(position);

        TextView teamNameTextView = (TextView) listItemView.findViewById(R.id.team_name_text_view);
        teamNameTextView.setText(currentTeam.getName());

        ImageView teamLogoImageView = (ImageView) listItemView.findViewById(R.id.team_logo_image_view);
        teamLogoImageView.setImageResource(currentTeam.getResourceIdLogo());

        TextView teamFoundationTextView = (TextView) listItemView.findViewById(R.id.team_foundation_text_view);
        teamFoundationTextView.setText((new SimpleDateFormat("yyyy-MM-dd").format(currentTeam.getFoundation())));

        TextView teamDescriptionTextView = (TextView) listItemView.findViewById(R.id.team_description_text_view);
        teamDescriptionTextView.setText(currentTeam.getDescription());

        TextView stadiumTextView = (TextView) listItemView.findViewById(R.id.stadium_text_view);
        stadiumTextView.setText(currentTeam.getStadiumName());

        ImageView stadiumImageView = (ImageView) listItemView.findViewById(R.id.stadium_image_view);
        stadiumImageView.setImageResource(currentTeam.getResourceIdStadium());

        return listItemView;
    }

}
