package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.android.musicplayer.R.id.playBtn1;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ImageButton nowPlayingButton = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent nowPlayIntent = new Intent(Songs.this, NowPlaying.class);
                startActivity(nowPlayIntent);
            }
        });
        ImageButton musicButton = (ImageButton) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent musicIntent = new Intent(Songs.this, Music.class);
                startActivity(musicIntent);
            }
        });
        ImageButton playlistButton = (ImageButton) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playlistIntent = new Intent(Songs.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        ImageButton storeButton = (ImageButton) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shopIntent = new Intent(Songs.this, Store.class);
                startActivity(shopIntent);
            }
        });

        ImageButton songsPlayBtn1 = (ImageButton) findViewById(R.id.songsPlayBtn1);
        ImageButton songsPlayBtn2 = (ImageButton) findViewById(R.id.songsPlayBtn2);
        ImageButton songsPlayBtn3 = (ImageButton) findViewById(R.id.songsPlayBtn3);

        songsPlayBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Songs.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
        songsPlayBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Songs.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
        songsPlayBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Songs.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
    }
}
