package com.example.drsebi.Diet;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drsebi.R;

public class Nuts_and_seeds extends AppCompatActivity {

    private CardView hemp_seeds, sesame_seeds, brazil_nuts, walnuts;
    ImageView herbsimageView;
    TextView herbname;
    TextView herbdetails;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuts_and_seeds);

        myDialog = new Dialog(Nuts_and_seeds.this);
        hemp_seeds = (CardView) findViewById(R.id.hemp_seedsID);
        sesame_seeds = (CardView) findViewById(R.id.sesame_seedsID);
        brazil_nuts = (CardView)  findViewById(R.id.brazil_nutsID);
        walnuts = (CardView) findViewById(R.id.walnutsID);

        hemp_seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.hemp_seedsImageView);
                TextView name = (TextView) findViewById(R.id.hemp_seedsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.hemp_seeds_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        sesame_seeds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.sesame_seedsImageView);
                TextView name = (TextView) findViewById(R.id.sesame_seedsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.sesame_seeds_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        brazil_nuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.brazil_nutsImageView);
                TextView name = (TextView) findViewById(R.id.brazil_nutsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.brazil_nuts_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        walnuts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.walnutsImageView);
                TextView name = (TextView) findViewById(R.id.walnutsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.walnuts_details);

                ShowPopup(v, name2, image2, details);
            }
        });
    }

    public void ShowPopup(View V, String name, Drawable image, String details){
        TextView txtclose;
        myDialog.setContentView(R.layout.custompopup);
        herbsimageView = (ImageView) myDialog.findViewById(R.id.herbsimageviewID);
        herbname = (TextView) myDialog.findViewById(R.id.herbnameID);
         herbdetails = (TextView) myDialog.findViewById(R.id.herbdetailsID);

         herbdetails.setText(details);
        herbname.setText(name);
        herbsimageView.setImageDrawable(image);
        txtclose = (TextView) myDialog.findViewById(R.id.cancelID);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        myDialog.show();
    }
}
