package com.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.viewholder> {

ArrayList<Audio> songsList;
Context context;

    public MusicListAdapter(ArrayList<Audio> songsList, Context context) {
        this.songsList = songsList;
        this.context = context;
    }

    @Override
    public viewholder onCreateViewHolder( ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);
        return new MusicListAdapter.viewholder(view);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {

        return songsList.size();
    }

    public class viewholder extends RecyclerView.ViewHolder{

        TextView titleTextView;
        ImageView iconImageView;

        public viewholder(View itemView) {
            super(itemView);

            titleTextView=itemView.findViewById(R.id.music_title_text);
            iconImageView=itemView.findViewById(R.id.icon_view);

        }
    }
}
