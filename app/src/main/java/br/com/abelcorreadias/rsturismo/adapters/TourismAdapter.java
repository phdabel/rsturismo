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
import br.com.abelcorreadias.rsturismo.data.Tourism;

public class TourismAdapter extends ArrayAdapter<Tourism> {

    public TourismAdapter(Context context, ArrayList<Tourism> seesighting){
        super(context, 0, seesighting);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tourism_item_list_view,
                    parent,
                    false);
        }

        /**
         *  Get the {@link Tourism} object located at this position in the list
         */
        Tourism currentSite = getItem(position);

        /**
         *  Get the TextViews and ImageView of the tourism_item_list_view and fill them
         *  with the information of the current instance.
         */
        TextView siteNameTextView = (TextView) listItemView.findViewById(R.id.tourism_name_text_view);
        siteNameTextView.setText(currentSite.getName());

        TextView siteDescriptionTextView = (TextView) listItemView.findViewById(R.id.tourism_description_text_view);
        siteDescriptionTextView.setText(currentSite.getDescription());

        ImageView siteImageView = (ImageView) listItemView.findViewById(R.id.tourism_image_view);
        siteImageView.setImageResource(currentSite.getResourceIdSite());

        return listItemView;
    }
}
