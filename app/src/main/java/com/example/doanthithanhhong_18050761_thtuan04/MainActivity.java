package com.example.doanthithanhhong_18050761_thtuan04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    RecyclerSongList adt;
    List<Song> mSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.rcv);
        mSongs = new ArrayList<Song>();

        mSongs.add(new Song("gia_nhu_ngay_dau","Justin Biber",R.drawable.image_1,R.drawable.group_3,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("danongkhongkhoc","Phan Manh Quynh",R.drawable.download,R.drawable.group_3,R.raw.danongkhongkhoc));
        mSongs.add(new Song("lonely_love_acoustic_version","The Sheep",R.drawable._c7601840050226d296be5bac1f74db5_1,R.drawable.group_3,R.raw.lonely_love_acoustic_version_the_sheep));
        mSongs.add(new Song("Love yourseft","Justin Biber",R.drawable.image_1,R.drawable.group_3,R.raw.yeulaitudau));
        mSongs.add(new Song("Love yourseft","Justin Biber",R.drawable.image_1,R.drawable.group_3,R.raw.gia_nhu_ngay_dau));
        mSongs.add(new Song("Love yourseft","Justin Biber",R.drawable._c7601840050226d296be5bac1f74db5_1,R.drawable.group_3,R.raw.lonely_love_acoustic_version_the_sheep));
        adt = new RecyclerSongList(mSongs, this);
        rcv.setHasFixedSize(true);
        rcv.setAdapter(adt);
        rcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }
}