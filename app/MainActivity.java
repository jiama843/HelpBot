package com.example.john.testapp;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    public static Canvas canvas;
    //private SurfaceHolder surfaceHolder;
    private TextDrawer text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //canvas = this.surfaceHolder.lockCanvas();

        final Button send = (Button) findViewById(R.id.Send);
        send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                printStarter(v);
                //text.draw(canvas);
            }
        });
    }

    public void printStarter(View view) {
        ((TextView)findViewById(R.id.fullscreen_content)).setText("Some Guy is Writing...");
        this.sleep(100000);
        ((TextView)findViewById(R.id.fullscreen_content)).setText("Your Text");//replace your text with call to a function
    }

    private void sleep(int i) {
        for(int a = 0; a < i * 1000000; a++){

        }
    }
}
