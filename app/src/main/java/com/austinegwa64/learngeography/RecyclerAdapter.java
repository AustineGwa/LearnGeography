package com.austinegwa64.learngeography;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gwaza on 3/5/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter< RecyclerAdapter.RecyclerViewHolder> {

    String [] titles;
    int [] images;
    String [] description;
    private  static ItemClickListener itemClickListener;

    public interface ItemClickListener {
        void onItemClick(View view , int position);
    }


    public RecyclerAdapter(String[] titles, int[] images, String [] description, ItemClickListener itemClickListener ) {
        this.titles = titles;
        this.images = images;
        this.description = description;
        this.itemClickListener = itemClickListener;

    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu, parent, false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);

        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.pic.setImageResource(images[position]);
        holder.title.setText(titles[position]);
        holder.description.setText(description[position]);

    }


    @Override
    public int getItemCount() {
        return titles.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title, description;
        ImageView pic;




        public RecyclerViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            pic = itemView.findViewById(R.id.image);
            description = itemView.findViewById(R.id.Description);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            itemClickListener.onItemClick(view ,clickedPosition);
        }
    }
}
