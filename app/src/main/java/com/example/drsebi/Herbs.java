package com.example.drsebi;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Herbs extends AppCompatActivity {
    private CardView bladderwrack, blessed_thistle, blue_vervain, burdock_root,cascara_sagrada,chaparral_leaf,contribo,damiana,eyebright,hydrangea;
    private CardView lavander, lilly_of_the_valley, nettles, prodijiosa, purslane, red_clover, rhubarb,sage_leaves,santa_maria,sarsaparilla,sea_moss;
    private CardView valeriana;

    ImageView herbsimageView;
    TextView herbname;
    TextView herbdetails;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbs);
        myDialog = new Dialog(Herbs.this);
        bladderwrack = (CardView) findViewById(R.id.bladderwrackID);
        blessed_thistle = (CardView) findViewById(R.id.blessed_thistleID);
        blue_vervain = (CardView) findViewById(R.id.blue_vervainID);
        burdock_root  = (CardView) findViewById(R.id.burdock_rootID);
        cascara_sagrada = (CardView) findViewById(R.id.cascaraID);
        chaparral_leaf = (CardView) findViewById(R.id.chaparral_LeafID);
        contribo = (CardView) findViewById(R.id.contriboID);
        damiana = (CardView) findViewById(R.id.damianaID);
        eyebright = (CardView) findViewById(R.id.eyebrightID);
        hydrangea = (CardView) findViewById(R.id.hydrangeaID);
        lavander = (CardView) findViewById(R.id.lavendarID);
        lilly_of_the_valley = (CardView) findViewById(R.id.lilly_of_the_valleyID);
        nettles = (CardView) findViewById(R.id.nettlesID);
        prodijiosa = (CardView) findViewById(R.id.prodijiosaID);
        purslane = (CardView) findViewById(R.id.purslaneID);
        red_clover = (CardView) findViewById(R.id.red_cloverID);
        rhubarb = (CardView) findViewById(R.id.rhubarbID);
        sage_leaves = (CardView) findViewById(R.id.sage_leavesID);
        santa_maria = (CardView) findViewById(R.id.santa_mariaID);
        sarsaparilla = (CardView) findViewById(R.id.sarsaparillaID);
        sea_moss = (CardView) findViewById(R.id.sea_mossID);
        valeriana = (CardView) findViewById(R.id.valerianaID);

        bladderwrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               ImageView image = (ImageView)  findViewById(R.id.bladderwrackImageView);
               TextView name  = (TextView) findViewById(R.id.bladderwrackTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.bladderwrack_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        blessed_thistle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.blessed_thistleImageView);
                TextView name  = (TextView) findViewById(R.id.blessed_thistleTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.blessed_thistle_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        blue_vervain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.blue_vervainImageView);
                TextView name  = (TextView) findViewById(R.id.blue_vervainTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.blue_vervain_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        burdock_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.burdock_rootImageView);
                TextView name  = (TextView) findViewById(R.id.burdock_rootTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.burdock_root_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        cascara_sagrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.cascara_sagradaImageView);
                TextView name  = (TextView) findViewById(R.id.cascara_sagradaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.cascara_sagrada_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        chaparral_leaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.chaparral_leafImageView);
                TextView name  = (TextView) findViewById(R.id.chaparral_leafTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.chaparral_leaf);

                ShowPopup(v,name2, image2, details);
            }
        });

        contribo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.contriboImageView);
                TextView name  = (TextView) findViewById(R.id.contriboTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.contribo_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        damiana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.damianaImageView);
                TextView name  = (TextView) findViewById(R.id.damianaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.damiana_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        eyebright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.eyebrightImageView);
                TextView name  = (TextView) findViewById(R.id.eyebrightTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.eyebright_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        hydrangea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.hydrangeaImageView);
                TextView name  = (TextView) findViewById(R.id.hydrangeaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.hydrangea_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        lavander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.lavendarImageView);
                TextView name  = (TextView) findViewById(R.id.lavendarTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.lavendar_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        lilly_of_the_valley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.lilly_of_the_valleyImageView);
                TextView name  = (TextView) findViewById(R.id.lilly_of_the_valleyTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.lilly_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        nettles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.nettlesImageView);
                TextView name  = (TextView) findViewById(R.id.nettlesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.nettles_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        prodijiosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.prodijiosaImageView);
                TextView name  = (TextView) findViewById(R.id.prodijiosaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.prodijiosa_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        purslane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.purslaneImageView);
                TextView name  = (TextView) findViewById(R.id.purslaneTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.purslane_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        red_clover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.red_cloverImageView);
                TextView name  = (TextView) findViewById(R.id.red_cloverTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.red_clover_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        rhubarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.rhubarbImageView);
                TextView name  = (TextView) findViewById(R.id.rhubarbTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.rhurbarb_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        sage_leaves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.sage_leavesImageView);
                TextView name  = (TextView) findViewById(R.id.sage_leavesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.sage_leaves_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        santa_maria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.santa_mariaImageView);
                TextView name  = (TextView) findViewById(R.id.santa_mariaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.santa_maria_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        sarsaparilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.sarsaparillaImageView);
                TextView name  = (TextView) findViewById(R.id.sarsaparillaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.sarsaparilla_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        sea_moss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.sea_mossImageView);
                TextView name  = (TextView) findViewById(R.id.sea_mossTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.sea_moss_details);

                ShowPopup(v,name2, image2, details);
            }
        });

        valeriana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ImageView image = (ImageView)  findViewById(R.id.valerianaImageView);
                TextView name  = (TextView) findViewById(R.id.valerianaTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.valerian_details);

                ShowPopup(v,name2, image2, details);
            }
        });
    }



    public void ShowPopup(View V,String name, Drawable image, String details){
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
