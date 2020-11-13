package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class peng2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng2);
    }
    public void home(View view) {
        Intent intent = new Intent(peng2.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(peng2.this, peng3.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(peng2.this, pengenalan.class);
        startActivity(intent);
    }
}
