package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tb4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb4);
    }
    public void home(View view) {
        Intent intent = new Intent(tb4.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(tb4.this, tb5.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(tb4.this, tb3.class);
        startActivity(intent);
    }
}
