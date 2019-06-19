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

public class Spices_and_seasonings extends AppCompatActivity {

    private CardView sage, habanero, sea_salt, basil, cayenne_pepper, cloves, dill, onions, oregano, thyme;

    ImageView herbsimageView;
    TextView herbname;
    TextView herbdetails;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spices_and_seasonings);

        myDialog = new Dialog(Spices_and_seasonings.this);
        sage = (CardView) findViewById(R.id.sageID);
        habanero = (CardView) findViewById(R.id.habaneroID);
        sea_salt = (CardView)  findViewById(R.id.sea_saltID);
        basil = (CardView) findViewById(R.id.basilID);
        cayenne_pepper = (CardView) findViewById(R.id.cayenne_pepperID);
        cloves = (CardView) findViewById(R.id.clovesID);
        dill = (CardView) findViewById(R.id.dillID);
        onions = (CardView) findViewById(R.id.onionsID);
        oregano = (CardView) findViewById(R.id.oreganoID);
        thyme = (CardView) findViewById(R.id.thymeID);

        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.sageImageView);
                TextView name = (TextView) findViewById(R.id.sageTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.sage_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        habanero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.habaneroImageView);
                TextView name = (TextView) findViewById(R.id.habaneroTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.habanero_details);

                ShowPopup(v, name2, image2,details);;
            }
        });

        sea_salt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.sea_saltImageView);
                TextView name = (TextView) findViewById(R.id.sea_saltTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.sea_salt_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        basil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.basilImageView);
                TextView name = (TextView) findViewById(R.id.basilTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.basil_details);

                ShowPopup(v, name2, image2,details);;
            }
        });

        cayenne_pepper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.cayenne_pepperImageView);
                TextView name = (TextView) findViewById(R.id.cayenne_pepperTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.cayenne_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        cloves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.clovesImageView);
                TextView name = (TextView) findViewById(R.id.clovesTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.cloves_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        dill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.dillImageView);
                TextView name = (TextView) findViewById(R.id.dillTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.dill_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        onions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.onionsImageView);
                TextView name = (TextView) findViewById(R.id.onionsTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.onions_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        oregano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.oreganoImageView);
                TextView name = (TextView) findViewById(R.id.oreganoTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.oregano_details);

                ShowPopup(v, name2, image2,details);
            }
        });

        thyme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView image = (ImageView) findViewById(R.id.thymeImageView);
                TextView name = (TextView) findViewById(R.id.thymeTextView);
                String name2= name.getText().toString();
                Drawable image2 = image.getDrawable();
                String details = getString(R.string.thyme_details);

                ShowPopup(v, name2, image2,details);
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
