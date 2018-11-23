package com.example.lenovo.itaninew;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.lenovo.itaninew.Board.Boarding;

public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itani_splash_screen);

        setAnimation();

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,Boarding.class));
            }
        }, SPLASH_TIME_OUT);
    }

    private void setAnimation() {
        ObjectAnimator scaleXAnimation = ObjectAnimator.ofFloat(findViewById(R.id.welcome_text), "scaleX", 5.0F, 1.0F);
        scaleXAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleXAnimation.setDuration(900);
        ObjectAnimator scaleYAnimation = ObjectAnimator.ofFloat(findViewById(R.id.welcome_text), "scaleY", 5.0F, 1.0F);
        scaleYAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        scaleYAnimation.setDuration(900);
        ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(findViewById(R.id.welcome_text), "alpha", 0.0F, 1.0F);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setDuration(900);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(scaleXAnimation).with(scaleYAnimation).with(alphaAnimation);
        animatorSet.setStartDelay(900);
        animatorSet.start();

        findViewById(R.id.imagelogo2).setAlpha(1.0F);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.translate_top_to_center);
        findViewById(R.id.imagelogo2).startAnimation(anim);

        findViewById(R.id.imagelogo1).setAlpha(1.0F);
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.fade);
        findViewById(R.id.imagelogo1).startAnimation(anim1);
    }
}
