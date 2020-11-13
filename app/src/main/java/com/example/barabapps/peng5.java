package com.example.barabapps;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class peng5 extends Activity {


    //Mendefinisikan MediaPlayer sebagai audioBackground
    MediaPlayer audioBackground;
    MediaPlayer audioBackground2;
    MediaPlayer audioBackground3;

    /*Variabel untuk ToggleButton kita beri nama dengan myToggle*/
    ToggleButton myToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peng5);

        //Memberi definisi di onCreate untuk toggle
        myToggle = (ToggleButton) findViewById(R.id.toggleSound);

        //Memanggil file my_sound pada folder raw
        audioBackground = MediaPlayer.create(this, R.raw.bab31);
        audioBackground2 = MediaPlayer.create(this, R.raw.bab32);
        audioBackground3 = MediaPlayer.create(this, R.raw.bab33);
        //Set looping ke true untuk mengulang audio jika telah selesai

    }

	/*Mendefinisikan fungsi onToggleClicked dengan
	pengkondisian standar if/else*/

    public void onToggleClicked(View view) {
        audioBackground.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            /*Mematikan suara audio*/
            audioBackground.setVolume(0, 0);
        } else {
            /*Menghidupkan kembali audio background*/
            audioBackground.setVolume(1, 1);
        }
    }
    public void onToggleClicked2(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        audioBackground2.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground2.setVolume(1,1);
        //Memulai audio
        audioBackground2.start();
        if (on) {
            /*Mematikan suara audio*/
            audioBackground2.setVolume(0, 0);
        } else {
            /*Menghidupkan kembali audio background*/
            audioBackground2.setVolume(1, 1);
        }
    }
    public void onToggleClicked3(View view) {
        boolean on = ((ToggleButton) view).isChecked();
        audioBackground3.setLooping(true);
        //Set volume audio agar berbunyi
        audioBackground3.setVolume(1,1);
        //Memulai audio
        audioBackground3.start();

        if (on) {
            /*Mematikan suara audio*/
            audioBackground3.setVolume(0, 0);
        } else {
            /*Menghidupkan kembali audio background*/
            audioBackground3.setVolume(1, 1);
        }
    }
    public void home(View view) {
        Intent intent = new Intent(peng5.this, materi.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(peng5.this, peng6.class);
        startActivity(intent);
    }
    public void prev(View view) {
        Intent intent = new Intent(peng5.this, peng4.class);
        startActivity(intent);
    }
}
