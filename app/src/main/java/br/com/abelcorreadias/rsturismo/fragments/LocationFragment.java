package br.com.abelcorreadias.rsturismo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.data.Location;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocationFragment extends Fragment {

    private Location location;

    public LocationFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_location, container, false);

        LinearLayout layout = (LinearLayout) rootView.findViewById(R.id.location_linear_layout);

        ImageView locationLogoImageView = (ImageView) layout.findViewById(R.id.location_logo_image_view);
        locationLogoImageView.setImageResource(location.getResourceIdLogo());

        TextView locationNameTextView = (TextView) layout.findViewById(R.id.location_name_text_view);
        locationNameTextView.setText(location.getName());

        TextView locationFoundationTextView = (TextView) layout.findViewById(R.id.location_foundation_text_view);
        locationFoundationTextView.setText((new SimpleDateFormat("yyyy-MM-dd").format(location.getFoundation())).toString());

        TextView locationDescriptionTextView = (TextView) layout.findViewById(R.id.location_description_text_view);
        locationDescriptionTextView.setText(location.getDescription());

        return rootView;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
