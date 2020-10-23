package com.example.streamingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;

    ImageView coverImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        media = MediaPlayer.create(getApplicationContext(), R.raw.musica);
        coverImage = findViewById(R.id.ivCover);

        Glide.with(this).load("https://img.youtube.com/vi/ziotSaBtqGk/0.jpg").into(coverImage);
    }

    public void onResume(View view) {

        media.start();
    }
}
