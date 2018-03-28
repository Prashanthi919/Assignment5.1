package com.example.prashu.assignment51;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private TextView t;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.txt);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manageBlinkeffect();
            }
        });

    }

    @SuppressLint("WrongConstant")
    private void manageBlinkeffect() {
        ObjectAnimator oa = ObjectAnimator.ofInt(t, "backgroundColor", Color.WHITE, Color.CYAN,
                Color.WHITE);
        oa.setDuration(1500);
        oa.setEvaluator(new ArgbEvaluator());
        oa.setRepeatMode(Animation.REVERSE);
        oa.setRepeatCount(Animation.INFINITE);
        oa.start();
    }
}
