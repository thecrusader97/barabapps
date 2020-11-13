package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class peng3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng3);
    }
    public void home(View view) {
        Intent intent = new Intent(peng3.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(peng3.this, peng4.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(peng3.this, peng2.class);
        startActivity(intent);
    }
}
