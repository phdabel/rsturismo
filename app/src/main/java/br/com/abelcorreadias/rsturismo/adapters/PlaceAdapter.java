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
import br.com.abelcorreadias.rsturismo.data.Place;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, ArrayList<Place> places){
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item_list_view,
                    parent,
                    false);
        }

        Place currentPlace = getItem(position);

        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.place_name_text_view);
        placeNameTextView.setText(currentPlace.getName());

        TextView placeDescriptionTextView = (TextView) listItemView.findViewById(R.id.place_description_text_view);
        placeDescriptionTextView.setText(currentPlace.getDescription());

        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.place_image_view);
        placeImageView.setImageResource(currentPlace.getResourceIdPlace());

        return listItemView;
    }
}
