package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        ImageButton nowPlayingButton = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent nowPlayIntent = new Intent(Albums.this, NowPlaying.class);
                startActivity(nowPlayIntent);
            }
        });
        ImageButton musicButton = (ImageButton) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent musicIntent = new Intent(Albums.this, Music.class);
                startActivity(musicIntent);
            }
        });
        ImageButton playlistButton = (ImageButton) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playlistIntent = new Intent(Albums.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        ImageButton storeButton = (ImageButton) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shopIntent = new Intent(Albums.this, Store.class);
                startActivity(shopIntent);
            }
        });

        ImageButton albumPlayBtn1 = (ImageButton) findViewById(R.id.albumPlayBtn1);
        ImageButton albumPlayBtn2 = (ImageButton) findViewById(R.id.albumPlayBtn2);
        ImageButton albumPlayBtn3 = (ImageButton) findViewById(R.id.albumPlayBtn3);

        albumPlayBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Albums.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
        albumPlayBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Albums.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
        albumPlayBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playIntent = new Intent(Albums.this,NowPlaying.class);
                startActivity(playIntent);
            }
        });
    }
}
