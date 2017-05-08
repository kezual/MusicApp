package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Playlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageButton nowPlayingButton = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent nowPlayIntent = new Intent(Playlist.this, NowPlaying.class);
                startActivity(nowPlayIntent);
            }
        });
        ImageButton musicButton = (ImageButton) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent musicIntent = new Intent(Playlist.this, Music.class);
                startActivity(musicIntent);
            }
        });
        ImageButton playlistButton = (ImageButton) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                return;
            }
        });
        ImageButton storeButton = (ImageButton) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shopIntent = new Intent(Playlist.this, Store.class);
                startActivity(shopIntent);
            }
        });
    }
}
