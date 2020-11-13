package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prak2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prak2);
    }
    public void home(View view) {
        Intent intent = new Intent(prak2.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(prak2.this, prak3.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(prak2.this, prak1.class);
        startActivity(intent);
    }
}
