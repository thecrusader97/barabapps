package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tugas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas3);
    }
    public void home(View view) {
        Intent intent = new Intent(tugas3.this, MainActivity.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(tugas3.this, tugas2.class);
        startActivity(intent);
    }
}
