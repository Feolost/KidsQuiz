package com.feolost.KidsQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Level_Selecting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Запуск на полный экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level_selecting);

        TextView quiz_1 = (TextView) findViewById(R.id.quiz_1);
        TextView quiz_2 = (TextView) findViewById(R.id.quiz_2);
        TextView quiz_3 = (TextView) findViewById(R.id.quiz_3);
        TextView quiz_4 = (TextView) findViewById(R.id.quiz_4);
        TextView quiz_5 = (TextView) findViewById(R.id.quiz_5);
        TextView quiz_6 = (TextView) findViewById(R.id.quiz_6);
        TextView quiz_7 = (TextView) findViewById(R.id.quiz_7);
        TextView quiz_8 = (TextView) findViewById(R.id.quiz_8);
        TextView quiz_9 = (TextView) findViewById(R.id.quiz_9);
        TextView quiz_10 = (TextView) findViewById(R.id.quiz_10);
        TextView quiz_11 = (TextView) findViewById(R.id.quiz_11);
        TextView quiz_12 = (TextView) findViewById(R.id.quiz_12);
        TextView quiz_13 = (TextView) findViewById(R.id.quiz_13);
        TextView quiz_14 = (TextView) findViewById(R.id.quiz_14);
        TextView quiz_15 = (TextView) findViewById(R.id.quiz_15);
        TextView quiz_16 = (TextView) findViewById(R.id.quiz_16);
        TextView quiz_17 = (TextView) findViewById(R.id.quiz_17);
        TextView quiz_18 = (TextView) findViewById(R.id.quiz_18);
        TextView quiz_19 = (TextView) findViewById(R.id.quiz_19);
        TextView quiz_20 = (TextView) findViewById(R.id.quiz_20);
        TextView quiz_21 = (TextView) findViewById(R.id.quiz_21);
        TextView quiz_22 = (TextView) findViewById(R.id.quiz_22);
        TextView quiz_23 = (TextView) findViewById(R.id.quiz_23);
        TextView quiz_24 = (TextView) findViewById(R.id.quiz_24);
        TextView quiz_25 = (TextView) findViewById(R.id.quiz_25);
        TextView quiz_26 = (TextView) findViewById(R.id.quiz_26);
        TextView quiz_27 = (TextView) findViewById(R.id.quiz_27);
        TextView quiz_28 = (TextView) findViewById(R.id.quiz_28);
        TextView quiz_29 = (TextView) findViewById(R.id.quiz_29);
        TextView quiz_30 = (TextView) findViewById(R.id.quiz_30);

        quiz_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_1.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr2.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_3.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_4.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_5.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_6.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_7.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_8.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_9.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, okr_10.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

        quiz_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level_Selecting.this, Coming_Soon.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                    startActivity(intent);
                }catch (Exception e) {

                }
            }
        });

    }



    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(Level_Selecting.this, MainMenu.class);
            startActivity(intent);
            finish();
        }catch (Exception e) {

        }
    }


}