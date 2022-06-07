package com.feolost.KidsQuiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;

public class rus_2 extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;
    private ShapeableImageView correct;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rus2);
        //Запуск на полный экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView question_1 = (ImageView) findViewById(R.id.question_1);
        ImageView question_2 = (ImageView) findViewById(R.id.question_2);
        Button repeat = (Button) findViewById(R.id.repeat);

        final MediaPlayer correct = MediaPlayer.create(this,R.raw.correct);
        final MediaPlayer wrong = MediaPlayer.create(this,R.raw.wrong);
        final MediaPlayer dictor = MediaPlayer.create(this,R.raw.rus2);

        dictor.start();

        repeat.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                dictor.start();
                return false;
            }
        });

        question_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(rus_2.this, rus_3.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                    finish();
                    correct.start();
                }catch (Exception e) {

                }

            }

        });


        //set the ontouch listener
        question_1.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        ImageView view = (ImageView) v;
                        //overlay is black with transparency of 0x77 (119)
                        view.getDrawable().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                        view.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        ImageView view = (ImageView) v;
                        //clear the overlay
                        view.getDrawable().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                wrong.start();
                return true;
            }

        });


    }
    @Override
    public void onBackPressed() {

        if (backPressedTime + 4000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
            backToast = Toast.makeText(getBaseContext(),"Вы уверены, что хотите выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

}