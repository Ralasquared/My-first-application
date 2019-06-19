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

public class Fruits extends AppCompatActivity {

    private CardView apple, banana, cantaloupes, figs, grapes, limes, mangoes, melons, nopal, plums, raisins, oranges, papaya, peaches, pears, prune;
    private CardView tamarind, berries, cherries;

    ImageView herbsimageView;
    TextView herbname;
    TextView herbdetails;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruits);

        myDialog = new Dialog(Fruits.this);
        apple = (CardView) findViewById(R.id.appleID);
        banana = (CardView) findViewById(R.id.bananaID);
        cantaloupes = (CardView)  findViewById(R.id.cantaloupesID);
        figs = (CardView) findViewById(R.id.figsID);
        grapes = (CardView) findViewById(R.id.grapesID);
        limes = (CardView) findViewById(R.id.limesID);
        mangoes = (CardView) findViewById(R.id.mangoesID);
        melons = (CardView) findViewById(R.id.melonsID);
        nopal = (CardView) findViewById(R.id.nopalID);
        plums = (CardView) findViewById(R.id.plumsID);
        raisins = (CardView) findViewById(R.id.raisinsID);
        oranges = (CardView) findViewById(R.id.orangesID);
        papaya = (CardView) findViewById(R.id.papayaID);
        peaches = (CardView) findViewById(R.id.peachesID);
        pears = (CardView) findViewById(R.id.pearsID);
        prune = (CardView) findViewById(R.id.pruneID);
        tamarind = (CardView) findViewById(R.id.tamarindID);
        berries = (CardView) findViewById(R.id.berriesID);
        cherries = (CardView) findViewById(R.id.cherriesID);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.appleImageView);
                TextView name = (TextView) findViewById(R.id.appleTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.apple_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.bananaImageView);
                TextView name = (TextView) findViewById(R.id.bananaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.banana_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        cantaloupes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.cantaloupesImageView);
                TextView name = (TextView) findViewById(R.id.cantaloupesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.cantaloupe_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        figs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.figsImageView);
                TextView name = (TextView) findViewById(R.id.figsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.figs_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        grapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.grapesImageView);
                TextView name = (TextView) findViewById(R.id.grapesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.grape_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        limes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.limesImageView);
                TextView name = (TextView) findViewById(R.id.limesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.limes_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        mangoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.mangoesImageView);
                TextView name = (TextView) findViewById(R.id.mangoesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.mangoes_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        melons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.melonsImageView);
                TextView name = (TextView) findViewById(R.id.melonsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.melons_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        nopal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.nopalImageView);
                TextView name = (TextView) findViewById(R.id.nopalTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.nopal_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        plums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.plumsImageView);
                TextView name = (TextView) findViewById(R.id.plumsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.plum_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        raisins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.raisinsImageView);
                TextView name = (TextView) findViewById(R.id.raisinsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.raisins_details);

                ShowPopup(v, name2, image2, details);;
            }
        });

        oranges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.orangesImageView);
                TextView name = (TextView) findViewById(R.id.orangesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.oranges_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        papaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.papayaImageView);
                TextView name = (TextView) findViewById(R.id.papayaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.papaya_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        peaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.peachesImageView);
                TextView name = (TextView) findViewById(R.id.peachesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.peaches_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        pears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.pearsImageView);
                TextView name = (TextView) findViewById(R.id.pearsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.pears_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        prune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.pruneImageView);
                TextView name = (TextView) findViewById(R.id.pruneTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.prune_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        tamarind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.tamarindImageView);
                TextView name = (TextView) findViewById(R.id.tamarindTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.tamarind_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        berries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.berriesImageView);
                TextView name = (TextView) findViewById(R.id.berriesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.berries_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        cherries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.cherriesImageView);
                TextView name = (TextView) findViewById(R.id.cherriesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.cherries_details);

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
