package br.com.abelcorreadias.rsturismo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.data.Nightlife;

public class NightlifeAdapter extends ArrayAdapter<Nightlife> {

    public NightlifeAdapter(Context context, ArrayList<Nightlife> night){
        super(context, 0, night);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.nightlife_item_list_view,
                    parent,
                    false);
        }

        Nightlife currentNight = getItem(position);

        TextView nightlifeNameTextView = (TextView) listItemView.findViewById(R.id.nightlife_name_text_view);
        nightlifeNameTextView.setText(currentNight.getName());

        TextView nightlifeDescriptionTextView = (TextView) listItemView.findViewById(R.id.nightlife_description_text_view);
        nightlifeDescriptionTextView.setText(currentNight.getDescription());

        ImageView nightlifeImageView = (ImageView) listItemView.findViewById(R.id.nightlife_image_view);
        nightlifeImageView.setImageResource(currentNight.getResourceId());

        return listItemView;
    }
}
