package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Music extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ImageButton nowPlayingButton = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowPlayingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent nowPlayIntent = new Intent(Music.this, NowPlaying.class);
                startActivity(nowPlayIntent);
            }
        });
        ImageButton musicButton = (ImageButton) findViewById(R.id.musicButton);
        musicButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                return;
            }
        });
        ImageButton playlistButton = (ImageButton) findViewById(R.id.playlistButton);
        playlistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent playlistIntent = new Intent(Music.this, Playlist.class);
                startActivity(playlistIntent);
            }
        });
        ImageButton storeButton = (ImageButton) findViewById(R.id.storeButton);
        storeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent shopIntent = new Intent(Music.this, Store.class);
                startActivity(shopIntent);
            }
        });

        Button songsButton = (Button) findViewById(R.id.librarySongs);
        songsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent songIntent = new Intent(Music.this, Songs.class);
                startActivity(songIntent);
            }
        });
        Button albumsButton = (Button) findViewById(R.id.libraryAlbums);
        albumsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent albumIntent = new Intent(Music.this, Albums.class);
                startActivity(albumIntent);
            }
        });
        Button artistButton = (Button) findViewById(R.id.libraryArtists);
        artistButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent artistIntent = new Intent(Music.this, Artists.class);
                startActivity(artistIntent);
            }
        });
    }
}
