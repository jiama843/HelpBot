package com.example.peas.sayno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
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
