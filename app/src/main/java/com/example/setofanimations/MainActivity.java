package com.example.setofanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fadeIn = findViewById(R.id.fadeIn);
        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                fadeIn.startAnimation(in);
            }
        });

        Button fadeOut = findViewById(R.id.fadeOut);
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                fadeOut.startAnimation(out);
            }
        });

        Button Blink = findViewById(R.id.blink);
        Blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation blink = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                Blink.startAnimation(blink);
            }
        });

        Button ZoomIn = findViewById(R.id.zoom_in);
        ZoomIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation zoom_in = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                ZoomIn.startAnimation(zoom_in);
            }
        });

        Button ZoomOut = findViewById(R.id.zoom_out);
        ZoomOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation zoom_out = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                ZoomOut.startAnimation(zoom_out);
            }
        });

        Button Rotate = findViewById(R.id.rotate);
        Rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                Rotate.startAnimation(rotate);
            }
        });
    }
}