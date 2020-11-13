package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tb5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb5);
    }
    public void home(View view) {
        Intent intent = new Intent(tb5.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(tb5.this, tb6.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(tb5.this, tb4.class);
        startActivity(intent);
    }
}
