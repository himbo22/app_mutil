package com.haikf.appmulti;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class YesNoActivity2 extends AppCompatActivity {
    ImageView wheel_image;
    Button but_spin;
    String[] sectors = {"yes","no","yes","no","yes","no","yes","no","yes","no","yes","no"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yes_no2);
        wheel_image = findViewById(R.id.wheel_image);

        but_spin = findViewById(R.id.but_spin);
        Collections.reverse(Arrays.asList(sectors));
        but_spin.setOnClickListener(view -> {
            Random random = new Random();
            int degree = random.nextInt(360);
            RotateAnimation rotateAnimation = new RotateAnimation(0,degree+720,
                    RotateAnimation.RELATIVE_TO_SELF,0.5f,
                    RotateAnimation.RELATIVE_TO_SELF,0.5f);
            rotateAnimation.setDuration(3000);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setInterpolator(new DecelerateInterpolator());
            rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {

                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    CaculatePoint(degree);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {

                }

            });
            wheel_image.startAnimation(rotateAnimation);
        });


    }
    @SuppressLint("SetTextI18n")
    public void CaculatePoint(int degree)
    {
        int initialPoint = 0;
        int endPoint = 30;
        int i  = 0;
        String res = null;
        do
        {
            if(degree > initialPoint && degree < endPoint)
            {
                res=sectors[i];
            }
            initialPoint += 30;
            endPoint += 30;
            i++;
        }
        while (res == null);
        

    }
}