package com.example.peas.sayno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
//Receives a string str, from input.
///////////////////////////////////////////////////////////////////////////////////////////////////
//Start of Actual Code
ArrayList<string> los = new ArrayList;

private int len = str.length();

String newStr = str.toLowerCase
String tempStr = “”;

for(int i = 0; i < len; i++){
	char temp = newStr.charAt(i);
	if(temp >= ‘a’ && temp <= ‘z’){
		tempStr += “+temp+”;
	}else{
		los.add(tempStr);
		tempStr = “”;
	}
}

return los;
//Scan the ArrayList los
    
    
    
        public void run (){

        long startTime;
        long timeMilliseconds;
        long waitTime;
        long totalTime = 0;
        int frameCount = 0;
        long targetTime = 1000/FPS;

        while(running){

            startTime = System.nanoTime();
            canvas = null;

            try{

                canvas = this.surfaceHolder.lockCanvas();

                synchronized (surfaceHolder) {

                    this.gamePanel.update();
                    this.gamePanel.draw(canvas);

                }

            } catch(Exception e){}

                finally{

                    if(canvas != null){

                        try {

                            surfaceHolder.unlockCanvasAndPost(canvas);

                        }catch(Exception e){}

                    }

                }

            timeMilliseconds = (System.nanoTime() - startTime)/1000000;
            waitTime = targetTime - timeMilliseconds;

            try{

                this.sleep(waitTime);

            }catch (Exception e){}

            totalTime += (System.nanoTime() - startTime);
            frameCount++;

            if(frameCount == FPS){

                averageFPS = 1000/((totalTime/frameCount)/1000000);
                totalTime -= totalTime;
                frameCount -= frameCount;
                System.out.println(averageFPS);

            }

        }

    }

}
