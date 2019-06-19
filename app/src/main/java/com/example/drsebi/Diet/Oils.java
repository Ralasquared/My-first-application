
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

public class Oils extends AppCompatActivity {

    private CardView avocado_oil, coconut_oil, grapeseed_oil, olive_oil, hemp_oil;

    ImageView herbsimageView;
    TextView herbname;
    TextView herbdetails;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oils);

        myDialog = new Dialog(Oils.this);
        avocado_oil = (CardView) findViewById(R.id.avocado_oilID);
        coconut_oil = (CardView) findViewById(R.id.coconut_oilID);
        grapeseed_oil = (CardView)  findViewById(R.id.grapeseed_oilID);
        olive_oil = (CardView) findViewById(R.id.olive_oilID);
        hemp_oil = (CardView) findViewById(R.id.hemp_oilID);

        avocado_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.avocado_oilImageView);
                TextView name = (TextView) findViewById(R.id.avocado_oilTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.avocado_oil_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        coconut_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.coconut_oilImageView);
                TextView name = (TextView) findViewById(R.id.coconut_oilTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.coconut_oil_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        grapeseed_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.grapeseed_oilImageView);
                TextView name = (TextView) findViewById(R.id.grapeseed_oilTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.grapeseed_oil_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        olive_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.olive_oilImageView);
                TextView name = (TextView) findViewById(R.id.olive_oilTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.olive_oil_details);

                ShowPopup(v, name2, image2, details);
            }
        });

        hemp_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.hemp_oilImageView);
                TextView name = (TextView) findViewById(R.id.hemp_oilTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.hemp_oil_details);

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
