package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prak4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prak4);
    }
    public void home(View view) {
        Intent intent = new Intent(prak4.this, materi.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(prak4.this, prak3.class);
        startActivity(intent);
    }
}
