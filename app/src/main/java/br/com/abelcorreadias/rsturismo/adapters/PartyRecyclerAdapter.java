package br.com.abelcorreadias.rsturismo.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.data.Party;

public class PartyRecyclerAdapter extends RecyclerView.Adapter<PartyRecyclerAdapter.ViewHolder> {

    Party[] dataset;


    public PartyRecyclerAdapter(Party[] dataset){
        this.dataset = dataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView partyNameTextView;
        TextView partyPhoneTextView;
        TextView partyAddressTextView;
        TextView partyDescriptionTextView;
        ImageView partyImageView;

        public ViewHolder(View itemView){
            super(itemView);
            this.partyNameTextView = (TextView) itemView.findViewById(R.id.party_name_text_view);
            this.partyDescriptionTextView = (TextView) itemView.findViewById(R.id.party_description_text_view);
            this.partyAddressTextView = (TextView) itemView.findViewById(R.id.party_address_text_view);
            this.partyPhoneTextView = (TextView) itemView.findViewById(R.id.party_phone_text_view);
            this.partyImageView = (ImageView) itemView.findViewById(R.id.party_image_view);
        }
    }

    @NonNull
    @Override
    public PartyRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.party_item_list_view, parent, false);

        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(PartyRecyclerAdapter.ViewHolder holder, int position) {
        holder.partyNameTextView.setText(this.dataset[position].getName());
        holder.partyPhoneTextView.setText(this.dataset[position].getPhone());
        holder.partyAddressTextView.setText(this.dataset[position].getAddress());
        holder.partyDescriptionTextView.setText(this.dataset[position].getDescription());
        holder.partyImageView.setImageResource(this.dataset[position].getResourceIdImage());
    }

    @Override
    public int getItemCount() {
        return this.dataset.length;
    }
}
