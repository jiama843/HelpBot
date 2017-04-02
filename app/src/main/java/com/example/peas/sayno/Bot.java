package com.example.peas.sayno;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarron on 4/1/17.
 */

public class Bot{
    ArrayList<String> keys = new ArrayList<String>();
    ArrayList<String> listOfTheKeys = new ArrayList<String>();
    String reply;
    String fk;


    public ArrayList<String> handleUserInput(ArrayList<String> personString ) {
        listOfTheKeys.clear();
        if(keys.isEmpty()) {
            keys.add("i");
            keys.add("hi");
            keys.add("me");
            keys.add("he");
            keys.add("she");
            keys.add("they");
            keys.add("hate");
            keys.add("harass");
            keys.add("harassment");
            keys.add("bully");
            keys.add("how");
            keys.add("are");
            keys.add("you");
            keys.add("rape");
            keys.add("raped");
            keys.add("sexuality");
            keys.add("sex");
            keys.add("force");
            keys.add("have");
            keys.add("gay");
            keys.add("bi");
            keys.add("bisexual");
            keys.add("les");
            keys.add("lez");
            keys.add("lesbian");
            keys.add("lesbians");
            keys.add("fag");
            keys.add("faggot");
            keys.add("help");
            keys.add("police");
            keys.add("domestic");
            keys.add("violence");
            keys.add("violent");
            keys.add("ugly");
            keys.add("am");
            keys.add("doing");
            keys.add("need");
        }

        for (int i = 0; i < keys.size(); i++) {
            if(personString.contains(keys.get(i)) == true) {
                listOfTheKeys.add(keys.get(i));
            }
        }
        return listOfTheKeys;
    }

    public String respond(ArrayList<String> k) {
        if(k.contains("i") && k.contains("hate")){
            reply = "Hating is bad for your health, spread positivity";
        } else if(k.contains("ugly") && k.contains("i") &&
                k.contains("am")){
            reply = "Everyone is beautiful";
        } else if((k.contains("i") && k.contains("am")) &&
                (k.contains("gay") || k.contains("les")
                        || k.contains("lesbian"))) {
            reply = "You can be any sexual orientation you wish";
        }else if(k.contains("hi")) {
            reply = "Hi there";

        }else if(k.contains("hi") && k.contains("how") &&
                k.contains("are") && k.contains("you")) {
            reply = "Im good thanks for asking";
        }else if(k.contains("how") &&
                k.contains("are") && k.contains("you")) {
            reply = "Im good thanks for asking";
        }else if(k.contains("how") &&
                k.contains("you") && k.contains("doing")) {
            reply = "Im good thanks for asking";
        }else if((k.contains("i") &&
                k.contains("need")) &&
                (k.contains("help") || k.contains("advice"))) {
            reply = "How can I help you?";
        }else {
            reply = "Please revise your message as I am too primitive to understand :)";
        }
            return reply;
    }

}
