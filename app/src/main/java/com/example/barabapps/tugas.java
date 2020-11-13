package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tugas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }
    public void home(View view) {
        Intent intent = new Intent(tugas.this, MainActivity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(tugas.this, tugas2.class);
        startActivity(intent);
    }
}
