package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tb7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb7);
    }
    public void home(View view) {
        Intent intent = new Intent(tb7.this, materi.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(tb7.this, tb6.class);
        startActivity(intent);
    }
}
