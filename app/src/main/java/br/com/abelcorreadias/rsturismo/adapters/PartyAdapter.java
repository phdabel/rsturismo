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
import br.com.abelcorreadias.rsturismo.data.Party;

public class PartyAdapter extends ArrayAdapter<Party> {

    public PartyAdapter(Context context, ArrayList<Party> parties){
        super(context,0,parties);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.party_item_list_view,
                    parent,
                    false);
        }

        /**
         *  Get the {@link Party} object located at this position in the list.
         */
        Party currentParty = getItem(position);

        /**
         *  Get the TextViews and ImageView of the party_item_list_view and fill them
         *  with the information of the current instance.
         */
        TextView partyNameTextView = (TextView) listItemView.findViewById(R.id.party_name_text_view);
        partyNameTextView.setText(currentParty.getName());

        TextView partyPhoneTextView = (TextView) listItemView.findViewById(R.id.party_phone_text_view);
        partyPhoneTextView.setText(currentParty.getPhone());

        TextView partyAddressTextView = (TextView) listItemView.findViewById(R.id.party_address_text_view);
        partyAddressTextView.setText(currentParty.getAddress());

        TextView partyDescriptionTextView = (TextView) listItemView.findViewById(R.id.party_description_text_view);
        partyDescriptionTextView.setText(currentParty.getDescription());

        ImageView partyImageView = (ImageView) listItemView.findViewById(R.id.party_image_view);
        partyImageView.setImageResource(currentParty.getResourceIdImage());

        return listItemView;
    }

}
