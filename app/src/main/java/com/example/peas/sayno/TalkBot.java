package com.example.peas.sayno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class TalkBot extends AppCompatActivity {
    ArrayList<String> lis = new ArrayList<String>();
    ArrayList<String> k = new ArrayList<String>();
    String botReply;
    Bot chatbot = new Bot();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talk_bot);
    }
    public void onButtonClick(View v){
        EditText msg = (EditText) findViewById(R.id.editText5);
        Button AI = (Button) findViewById(R.id.button);
        String message = msg.getText().toString();
        printTextUser(v, message);
        int len = message.length();

        String newStr = message.toLowerCase();
        lis = new ArrayList<String>(Arrays.asList(newStr.split(" ")));
        k = chatbot.handleUserInput(lis);
       /*for(int i = 0; i < k.size(); i++) {
            Log.d("MyTag2",k.get(i));
        }*/
        botReply = chatbot.respond(k);
        printTextResponse(v);

    }

    public void printTextUser(View view, String message){
        TextView l1 = (TextView)findViewById(R.id.textView3);
        l1.setText(message);
    }

    public void printTextResponse(View view){
        ((TextView)findViewById(R.id.textView2)).setText("Responding...");
        this.sleep(5000);
        ((TextView)findViewById(R.id.textView2)).setText(botReply);
    }

    private void sleep(int i) {
        for(int a = 0; a < i * 1000000; a++) {

        }
    }

}
