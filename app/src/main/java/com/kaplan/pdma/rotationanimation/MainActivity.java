package com.kaplan.pdma.rotationanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

//http://www.viralandroid.com/2015/11/android-rotate-animation-example.html

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageViewPizza = (ImageView) findViewById(R.id.imageViewPizza);
        imageViewPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startRotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.android_rotate_animation);
                imageViewPizza.startAnimation(startRotateAnimation);
            }
        });
    }
}
