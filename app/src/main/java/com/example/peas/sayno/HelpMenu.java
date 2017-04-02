package com.example.peas.sayno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HelpMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_menu);
    }
    public void MainMenuButton(View v){
        Intent nextPage = new Intent(HelpMenu.this, MainMenu.class);
        startActivity(nextPage);
    }

}
