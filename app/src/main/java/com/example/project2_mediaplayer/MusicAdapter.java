package com.example.project2_mediaplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Music> mListmusic;

    public  void setData(List<Music> list){
        this.mListmusic =list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_feature_song,parent,false);
        return new MusicViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Music music = mListmusic.get(position);
        if(music == null){
            return;
        }
        MusicViewHolder musicViewHolder = (MusicViewHolder) holder;
        musicViewHolder.imgMusicImage.setImageResource(music.getMusicId());
        musicViewHolder.tvMusicAuthor.setText(music.getMusicAuthor());
        musicViewHolder.tvMusicName.setText(music.getMusicName());

    }

    @Override
    public int getItemCount() {
        if (mListmusic!=null){
            return mListmusic.size();
        }
        return 0;
    }



    class MusicViewHolder extends RecyclerView.ViewHolder{

    private TextView tvMusicName;
    private TextView tvMusicAuthor;
    private ImageView imgMusicImage;

        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMusicAuthor = itemView.findViewById(R.id.music_author);
            tvMusicName = itemView.findViewById(R.id.music_name);
            imgMusicImage = itemView.findViewById(R.id.music_image);


        }
    }
}
