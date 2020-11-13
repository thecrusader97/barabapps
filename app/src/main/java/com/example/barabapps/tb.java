package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class tb extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb);

    }


    public void home(View view) {
        Intent intent = new Intent(tb.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(tb.this, tb2.class);
        startActivity(intent);
    }

}
