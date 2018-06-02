package br.com.abelcorreadias.rsturismo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import br.com.abelcorreadias.rsturismo.data.SoccerTeam;
import br.com.abelcorreadias.rsturismo.R;

public class TeamRecyclerAdapter extends RecyclerView.Adapter<TeamRecyclerAdapter.ViewHolder> {

    private SoccerTeam[] dataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView teamNameTextView;
        ImageView teamLogoImageView;
        TextView teamFoundationTextView;
        TextView teamDescriptionTextView;
        TextView stadiumTextView;
        ImageView stadiumImageView;

        public ViewHolder(View itemView){
            super(itemView);
            this.teamNameTextView = (TextView) itemView.findViewById(R.id.team_name_text_view);
            this.teamLogoImageView = (ImageView) itemView.findViewById(R.id.team_logo_image_view);
            this.teamFoundationTextView = (TextView) itemView.findViewById(R.id.team_foundation_text_view);
            this.teamDescriptionTextView = (TextView) itemView.findViewById(R.id.team_description_text_view);
            this.stadiumTextView = (TextView) itemView.findViewById(R.id.stadium_text_view);
            this.stadiumImageView = (ImageView) itemView.findViewById(R.id.stadium_image_view);
        }
    }

    public TeamRecyclerAdapter(SoccerTeam[] dataset){
        this.dataset = dataset;
    }

    @Override
    public TeamRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.soccer_team_item_list_view, parent, false);

        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(TeamRecyclerAdapter.ViewHolder holder, int position){
        holder.teamNameTextView.setText(this.dataset[position].getName());
        holder.teamDescriptionTextView.setText(this.dataset[position].getDescription());
        holder.teamLogoImageView.setImageResource(this.dataset[position].getResourceIdLogo());
        holder.teamFoundationTextView.setText((new SimpleDateFormat("yyyy-MM-dd").format(this.dataset[position].getFoundation())));
        holder.stadiumTextView.setText(this.dataset[position].getStadiumName());
        holder.stadiumImageView.setImageResource(this.dataset[position].getResourceIdStadium());
    }

    @Override
    public int getItemCount(){
        return dataset.length;
    }
}
