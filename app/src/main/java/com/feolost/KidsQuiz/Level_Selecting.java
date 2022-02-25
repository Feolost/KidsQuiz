package com.feolost.KidsQuiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Level_Selecting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Запуск на полный экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_level_selecting);
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