package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prak1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prak1);
    } public void home(View view) {
        Intent intent = new Intent(prak1.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(prak1.this, prak2.class);
        startActivity(intent);
    }

}
