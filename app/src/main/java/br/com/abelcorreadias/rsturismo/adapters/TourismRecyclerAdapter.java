package br.com.abelcorreadias.rsturismo.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.abelcorreadias.rsturismo.data.Tourism;
import br.com.abelcorreadias.rsturismo.R;

public class TourismRecyclerAdapter extends RecyclerView.Adapter<TourismRecyclerAdapter.ViewHolder> {

    private Tourism[] dataset;

    /**
     *  Subclass that provides a reference to the views for each data item.
     *  The access of all views in the layout must be provided.
     */
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // data items
        TextView tourismNameTextView;
        TextView tourismDescriptionTextView;
        ImageView tourismImageView;

        public ViewHolder(View itemView){
            super(itemView);
            this.tourismNameTextView = (TextView) itemView.findViewById(R.id.tourism_name_text_view);
            this.tourismDescriptionTextView = (TextView) itemView.findViewById(R.id.tourism_description_text_view);
            this.tourismImageView = (ImageView) itemView.findViewById(R.id.tourism_image_view);
        }
    }

    /**
     * constructor
     *
     * @param dataset
     */
    public TourismRecyclerAdapter(Tourism[] dataset){
        this.dataset = dataset;
    }

    /**
     * create new views (invoked by the layout manager)
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public TourismRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourism_item_list_view, parent, false);

        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    /**
     * replaces the contents of a view (invoked by the layout manager)
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        /**
         *  gets the elements from the dataset at this position
         *  replaces the contents of the views with those elements
         */
        holder.tourismNameTextView.setText(this.dataset[position].getName());
        holder.tourismDescriptionTextView.setText(this.dataset[position].getDescription());
        holder.tourismImageView.setImageResource(this.dataset[position].getResourceIdSite());
    }

    /**
     * Returns the size of the dataset
     *
     * @return
     */
    @Override
    public int getItemCount(){
        return dataset.length;
    }
}
