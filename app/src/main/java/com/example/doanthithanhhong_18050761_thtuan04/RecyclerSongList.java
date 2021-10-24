package com.example.doanthithanhhong_18050761_thtuan04;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class RecyclerSongList extends RecyclerView.Adapter<RecyclerSongList.ViewHolder> {
    List<Song> songList;
    Context ctx;

    public RecyclerSongList(List<Song> songList, Context ctx) {
        this.songList = songList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Song song = songList.get(position);
        holder.asong = song;
        holder.imageView.setImageResource(song.getImageSong());
        holder.songSinger.setText(song.getSingle());
        holder.songTitle.setText(song.getTitle());
        holder.imgMenu.setImageResource(song.getImgMenu());
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView,imgHeart,imgMenu;
        TextView songTitle, songSinger;
        Song asong;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgPlayList);
            songTitle = itemView.findViewById(R.id.txtNamMusic);
            songSinger = itemView.findViewById(R.id.txtAuthor);
            imgMenu = itemView.findViewById(R.id.imageView2);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent(ctx,ItemSong.class);
                    intent.putExtra("song", (Serializable) asong);
                    intent.putExtra("listMusic", (Serializable) songList);
                    intent.putExtra("index",songList.indexOf(asong));
                    ctx.startActivity(intent);

                }
            });
        }
    }
}
