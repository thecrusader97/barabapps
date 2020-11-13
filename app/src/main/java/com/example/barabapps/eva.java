package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.barabapps.pengenalan;

public class eva extends AppCompatActivity {
    CheckBox mat;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eva);
        mat =  (CheckBox)findViewById(R.id.mat1);


    }
    public void onClick(View v) {
        if (mat.isChecked()) {
            img =   (ImageView) findViewById(R.id.img1);
            img.setVisibility(View.VISIBLE);
        }

    }
}
