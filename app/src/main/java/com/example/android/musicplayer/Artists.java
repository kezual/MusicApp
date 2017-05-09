package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ImageButton nowPlayingButton = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent nowPlayIntent = new Intent(Artists.this, NowPlaying.class);
                startActivity(nowPlayIntent);
            }
        });
        ImageButton musicButton = (ImageButton) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent musicIntent = new Intent(Artists.this, Music.class);
                startActivity(musicIntent);
            }
        });
        ImageButton playlistButton = (ImageButton) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playlistIntent = new Intent(Artists.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        ImageButton storeButton = (ImageButton) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shopIntent = new Intent(Artists.this, Store.class);
                startActivity(shopIntent);
            }
        });

        ImageButton artistPlayBtn1 = (ImageButton) findViewById(R.id.artistPlayBtn1);
        ImageButton artistPlayBtn2 = (ImageButton) findViewById(R.id.artistPlayBtn2);
        ImageButton artistPlayBtn3 = (ImageButton) findViewById(R.id.artistPlayBtn3);

        artistPlayBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Artists.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
        artistPlayBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Artists.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
        artistPlayBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Artists.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
    }
}
