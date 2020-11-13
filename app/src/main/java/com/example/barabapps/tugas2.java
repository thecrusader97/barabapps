package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tugas2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas2);
    }
    public void home(View view) {
        Intent intent = new Intent(tugas2.this, MainActivity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(tugas2.this, tugas3.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(tugas2.this, tugas.class);
        startActivity(intent);
    }
}
