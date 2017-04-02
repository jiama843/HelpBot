package com.example.peas.sayno;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Tanush on 2017-04-01.
 */

public class TalkingToBot extends AppCompatActivity {
    ArrayList<String> lis = new ArrayList<String>();
    ArrayList<String> k = new ArrayList<String>();
    String botReply;
    Bot chatbot = new Bot();



    public void onButtonClick(View v){
        TextView msg = (TextView) findViewById(R.id.textView);
        Button AI = (Button) findViewById(R.id.button3);
        String message = msg.getText().toString();
        printTextUser(v, message);
        int len = message.length();

        String newStr = message.toLowerCase();
        lis = new ArrayList<String>(Arrays.asList(message.split(" ")));

        k = chatbot.handleUserInput(lis);
        botReply = chatbot.respond(k);
        printTextResponse(v);

    }

    public void printTextUser(View view, String message){
        ((TextView)findViewById(R.id.textView2)).setText(message);
    }

    public void printTextResponse(View view){
        ((TextView)findViewById(R.id.textView2)).setText("Responding...");
        this.sleep(10000);
        ((TextView)findViewById(R.id.textView2)).setText(botReply);
    }

    private void sleep(int i) {
        for(int a = 0; a < i * 1000000; a++) {

        }
    }
}
