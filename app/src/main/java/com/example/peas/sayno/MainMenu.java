package com.example.peas.sayno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void AIButton(View v){
        Intent nextPage = new Intent(MainMenu.this, TalkBot.class);
        startActivity(nextPage);
    }
    public void HelpButton(View v){
        Intent nextPage = new Intent(MainMenu.this, HelpMenu.class);
        startActivity(nextPage);
    }

}
