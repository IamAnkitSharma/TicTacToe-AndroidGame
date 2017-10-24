package com.example.admin.tictactoe;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView logo = (ImageView)findViewById(R.id.logo);
       TextView tic = (TextView) findViewById(R.id.tic);
        TextView name= (TextView) findViewById(R.id.name);
        logo.animate().rotation(360).setDuration(2000);
        tic.animate().rotation(360).setDuration(2000);
        name.animate().rotation(360).setDuration(2000);
        MediaPlayer mymusic  = MediaPlayer.create(this,R.raw.winner);
        mymusic.start();

    }
}
