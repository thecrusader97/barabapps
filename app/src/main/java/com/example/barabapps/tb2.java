package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class tb2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tb2);

    }

    public void home(View view) {
        Intent intent = new Intent(tb2.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(tb2.this, tb3.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(tb2.this, tb.class);
        startActivity(intent);
    }

}
