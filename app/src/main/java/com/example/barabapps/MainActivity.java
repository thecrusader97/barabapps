package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void formbab1(View view) {
        Intent intent = new Intent(MainActivity.this, materi.class);
        startActivity(intent);
    }
    public void formbab2(View view) {
        Intent intent = new Intent(MainActivity.this, kisi.class);
        startActivity(intent);
    }
    public void formbab3(View view) {
        Intent intent = new Intent(MainActivity.this, tugas.class);
        startActivity(intent);
    }
    public void about(View view) {
        Intent intent = new Intent(MainActivity.this, about.class);
        startActivity(intent);
    }

    public void formbab4(View view) {
        Intent intent = new Intent(MainActivity.this, eva.class);
        startActivity(intent);
    }
}
