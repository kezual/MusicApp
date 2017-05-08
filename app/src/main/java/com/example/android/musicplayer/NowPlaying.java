package com.example.android.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


        ImageButton nowPlayingButton = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                return;
            }
        });
        ImageButton musicButton = (ImageButton) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent musicIntent = new Intent(NowPlaying.this, Music.class);
                startActivity(musicIntent);
            }
        });
        ImageButton playlistButton = (ImageButton) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playlistIntent = new Intent(NowPlaying.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        ImageButton storeButton = (ImageButton) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shopIntent = new Intent(NowPlaying.this, Store.class);
                startActivity(shopIntent);
            }
        });

        //MediaPlayer mp = new MediaPlayer(); --> for implementation of music player

    }
}
