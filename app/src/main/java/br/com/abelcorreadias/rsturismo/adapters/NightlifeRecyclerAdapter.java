package br.com.abelcorreadias.rsturismo.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import br.com.abelcorreadias.rsturismo.R;
import br.com.abelcorreadias.rsturismo.data.Nightlife;

public class NightlifeRecyclerAdapter extends RecyclerView.Adapter<NightlifeRecyclerAdapter.ViewHolder> {

    Nightlife[] dataset;

    public NightlifeRecyclerAdapter(Nightlife[] dataset){
        this.dataset = dataset;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView nightlifeNameTextView;
        TextView nightlifeDescriptionTextView;
        ImageView nightlifeImageView;

        public ViewHolder(View itemView){
            super(itemView);
            this.nightlifeNameTextView = (TextView) itemView.findViewById(R.id.nightlife_name_text_view);
            this.nightlifeDescriptionTextView = (TextView) itemView.findViewById(R.id.nightlife_description_text_view);
            this.nightlifeImageView = (ImageView) itemView.findViewById(R.id.nightlife_image_view);
        }

    }

    @NonNull
    @Override
    public NightlifeRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nightlife_item_list_view, parent, false);

        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull NightlifeRecyclerAdapter.ViewHolder holder, int position) {
        holder.nightlifeNameTextView.setText(this.dataset[position].getName());
        holder.nightlifeDescriptionTextView.setText(this.dataset[position].getDescription());
        holder.nightlifeImageView.setImageResource(this.dataset[position].getResourceId());
    }

    @Override
    public int getItemCount() {
        return this.dataset.length;
    }
}
