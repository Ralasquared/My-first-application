package com.example.drsebi;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drsebi.Game.Game;

public class Home extends AppCompatActivity {

    private Button dietplan, cellfood, herbs, game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        dietplan = (Button) findViewById(R.id.dietplanID);
        dietplan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showDietplan = new Intent(getApplicationContext(), Dietplan.class);
                startActivity(showDietplan);
            }
        });

        cellfood = (Button) findViewById(R.id.cellfoodID);
        cellfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://drsebiscellfood.com");
                Intent showCellfood = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(showCellfood);
            }
        });

        herbs = (Button) findViewById(R.id.herbID);
        herbs.setOnClickListener(new View.OnClickListener() {
            @Override 
            public void onClick(View v) {
                Intent showHerbs = new Intent(getApplicationContext(), Herbs.class);
                startActivity(showHerbs);
            }
        });

        game = (Button) findViewById(R.id.gameID);
        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showGame = new Intent(Home.this, Game.class);
                startActivity(showGame);
            }
        });






    }
}
