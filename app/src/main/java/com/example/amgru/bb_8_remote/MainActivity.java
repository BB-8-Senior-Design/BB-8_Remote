package com.example.amgru.bb_8_remote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView directionMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton rotateLeft = (ImageButton) findViewById(R.id.ImageButton);
        ImageButton rotateRight = (ImageButton) findViewById(R.id.ImageButton3);
        ImageButton goLeft = (ImageButton) findViewById(R.id.ImageButton6);
        ImageButton goRight = (ImageButton) findViewById(R.id.ImageButton5);
        ImageButton goForward = (ImageButton) findViewById(R.id.ImageButton2);
        ImageButton goBackward = (ImageButton) findViewById(R.id.ImageButton4);
        directionMessage= (TextView) findViewById(R.id.textView);

        rotateRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    directionMessage.setText("Rotating Head Right");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    directionMessage.setText("Done!");;
                }
                return true;
            }
        });

        rotateLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    directionMessage.setText("Rotating Head Left");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    directionMessage.setText("Done!");;
                }
                return true;
            }
        });

        goRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    directionMessage.setText("Turning Right");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    directionMessage.setText("Done!");;
                }
                return true;
            }
        });

        goLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    directionMessage.setText("Turning Left");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    directionMessage.setText("Done!");;
                }
                return true;
            }
        });

        goForward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    directionMessage.setText("Going Forward");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    directionMessage.setText("Done!");;
                }
                return true;
            }
        });


        goBackward.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    directionMessage.setText("Going Backward");
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    directionMessage.setText("Done!");;
                }
                return true;
            }
        });
    }
}
