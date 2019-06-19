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

public class Vegetables extends AppCompatActivity {

    private CardView squash, zucchini, amaranth_greens, asparagus, bell_peppers, chayote, chickpea, tomatoes, kale, lettuce, okra, mushroom, wild_arugula, peaches, pears, prune;
    private CardView tamarind, berries, cherries;

    ImageView herbsimageView;
    TextView herbname;
    TextView herbdetails;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        myDialog = new Dialog(Vegetables.this);
        squash = (CardView) findViewById(R.id.squashID);
        zucchini = (CardView) findViewById(R.id.zucchiniID);
        amaranth_greens = (CardView)  findViewById(R.id.amaranth_greensID);
        asparagus = (CardView) findViewById(R.id.asparagusID);
        bell_peppers = (CardView) findViewById(R.id.bell_peppersID);
        chayote = (CardView) findViewById(R.id.chayoteID);
        chickpea = (CardView) findViewById(R.id.chickpeaID);
        tomatoes = (CardView) findViewById(R.id.tomatoesID);
        kale = (CardView) findViewById(R.id.kaleID);
        lettuce = (CardView) findViewById(R.id.lettuceID);
        okra = (CardView) findViewById(R.id.okraID);
        mushroom = (CardView) findViewById(R.id.mushroomID);
        wild_arugula = (CardView) findViewById(R.id.wild_arugulaID);
        peaches = (CardView) findViewById(R.id.peachesID);
        pears = (CardView) findViewById(R.id.pearsID);
        prune = (CardView) findViewById(R.id.pruneID);
        tamarind = (CardView) findViewById(R.id.tamarindID);
        berries = (CardView) findViewById(R.id.berriesID);
        cherries = (CardView) findViewById(R.id.cherriesID);

        squash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.squashImageView);
                TextView name = (TextView) findViewById(R.id.squashTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.squash_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        zucchini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.zucchiniImageView);
                TextView name = (TextView) findViewById(R.id.zucchiniTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.zucchini_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        amaranth_greens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.amaranth_greensImageView);
                TextView name = (TextView) findViewById(R.id.amaranth_greensTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.amaranth_greens_details);

                ShowPopup(v, name2, image2, details);;
            }
        });

        asparagus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.asparagusImageView);
                TextView name = (TextView) findViewById(R.id.asparagusTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.asparagus_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        bell_peppers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.bell_peppersImageView);
                TextView name = (TextView) findViewById(R.id.bell_peppersTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.bell_peppers_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        chayote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.chayoteImageView);
                TextView name = (TextView) findViewById(R.id.chayoteTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.chayote_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        chickpea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.chickpeaImageView);
                TextView name = (TextView) findViewById(R.id.chickpeaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.chickpea_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        tomatoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.tomatoesImageView);
                TextView name = (TextView) findViewById(R.id.tomatoesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.tomatoes_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        kale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.kaleImageView);
                TextView name = (TextView) findViewById(R.id.kaleTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.kale_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        lettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.lettuceImageView);
                TextView name = (TextView) findViewById(R.id.lettuceTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.lettuce_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        okra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.okraImageView);
                TextView name = (TextView) findViewById(R.id.okraTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.okra_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        mushroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.mushroomImageView);
                TextView name = (TextView) findViewById(R.id.mushroomTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.mushroom_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        wild_arugula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.wild_arugulaImageView);
                TextView name = (TextView) findViewById(R.id.wild_arugulaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.wild_arugula_details);

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
