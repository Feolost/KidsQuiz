package com.feolost.KidsQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    //SplashScreen
    Handler h = new Handler();
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Запуск на полный экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //
        //Задняя музыка
        mediaPlayer = MediaPlayer.create(this,R.raw.music);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, MainMenu.class);
                startActivity(i);
                finish();
            }
        },2000);
    }
}