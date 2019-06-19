package com.example.drsebi;

import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drsebi.Diet.Fruits;
import com.example.drsebi.Diet.Nuts_and_seeds;
import com.example.drsebi.Diet.Oils;
import com.example.drsebi.Diet.Spices_and_seasonings;
import com.example.drsebi.Diet.Vegetables;

public class Dietplan extends AppCompatActivity {
    private CardView fruits, nuts, vegetables, oils, spices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan);

        fruits = (CardView) findViewById(R.id.fruitsID);
        nuts = (CardView) findViewById(R.id.nutsID);
        vegetables = (CardView) findViewById(R.id.vegetablesID);
        oils = (CardView) findViewById(R.id.oilsID);
        spices =(CardView) findViewById(R.id.spicesID);

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruitsIntent = new Intent(Dietplan.this, Fruits.class);
                startActivity(fruitsIntent);
            }
        });

        nuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nutsIntent = new Intent(Dietplan.this, Nuts_and_seeds.class);
                startActivity(nutsIntent);
            }
        });

        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vegetablesIntent = new Intent(Dietplan.this, Vegetables.class);
                startActivity(vegetablesIntent);
            }
        });

        oils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oilsIntent = new Intent(Dietplan.this, Oils.class);
                startActivity(oilsIntent);
            }
        });

        spices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spicesIntent = new Intent(Dietplan.this, Spices_and_seasonings.class);
                startActivity(spicesIntent);
            }
        });


    }
}
