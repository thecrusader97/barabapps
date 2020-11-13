package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class materi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
    }
    public void peng(View view) {
        Intent intent = new Intent(materi.this, pengenalan.class);
        startActivity(intent);
    }
    public void kos(View view) {
        Intent intent = new Intent(materi.this, kosa.class);
        startActivity(intent);
    }
    public void prak(View view) {
        Intent intent = new Intent(materi.this, prak1.class);
        startActivity(intent);
    }
    public void tb(View view) {
        Intent intent = new Intent(materi.this, tb.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(materi.this, MainActivity.class);
        startActivity(intent);
    }
}
