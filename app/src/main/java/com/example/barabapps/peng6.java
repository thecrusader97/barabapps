package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class peng6 extends Activity {
    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;

    /*Variabel untuk ToggleButton kita beri nama dengan myToggle*/
    ToggleButton myToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng4);

        //Memberi definisi di onCreate untuk toggle
        myToggle = (ToggleButton) findViewById(R.id.toggleSound);

        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.bab4);
        //Set looping ke true untuk mengulang audio jika telah selesai

    }

	/*Mendefinisikan fungsi onToggleClicked dengan
	pengkondisian standar if/else*/

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();

        if (on) {
            /*Mematikan suara audio*/
            audioBackground.setVolume(0, 0);
        } else {
            /*Menghidupkan kembali audio background*/
            audioBackground.setVolume(1, 1);
        }
    }

    public void home(View view) {
        Intent intent = new Intent(peng6.this, materi.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(peng6.this, peng5.class);
        startActivity(intent);
    }
}
