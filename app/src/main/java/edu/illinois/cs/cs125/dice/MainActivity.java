package edu.illinois.cs.cs125.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2, imageView3,imageView4, imageView5, imageView6;
    private int RRR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDices = (Button) findViewById(R.id.rolling);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);


        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                final Animation anim1 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.shake);
//                final Animation anim2 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.shake);
//
//                final Animation.AnimationListener animationListener = new Animation.AnimationListener() {
//                    @Override
//                    public void onAnimationStart(Animation animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animation animation) {
//                        int value = randomDiceVal();
//                        int res = getResources().getIdentifier("dice_" + value, "drawable", "edu.illinois.cs.cs125.dice");
//
//                        if (animation == anim1) {
//                            imageView1.setImageResource(res);
//                        } else if (animation ==anim2) {
//                            imageView2.setImageResource(res);
//                        }
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animation animation) {
//
//                    }
//                };
//
//                anim1.setAnimationListener(animationListener);
//                anim2.setAnimationListener(animationListener);
//
//                imageView1.startAnimation(anim1);
//                imageView2.startAnimation(anim2);
                int val1 = randomDiceVal();
                int val2 = randomDiceVal();
                int val3 = randomDiceVal();
                int val4 = randomDiceVal();
                int val5 = randomDiceVal();
                int val6 = randomDiceVal();


                int new1 = getResources().getIdentifier("dice" + val1, "drawable","edu.illinois.cs.cs125.dice");
                int new2 = getResources().getIdentifier("dice" + val2, "drawable","edu.illinois.cs.cs125.dice");
                int new3 = getResources().getIdentifier("dice" + val3, "drawable","edu.illinois.cs.cs125.dice");
                int new4 = getResources().getIdentifier("dice" + val4, "drawable","edu.illinois.cs.cs125.dice");
                int new5 = getResources().getIdentifier("dice" + val5, "drawable","edu.illinois.cs.cs125.dice");
                int new6 = getResources().getIdentifier("dice" + val6, "drawable","edu.illinois.cs.cs125.dice");



                imageView1.setImageResource(new1);
                imageView2.setImageResource(new2);
                imageView3.setImageResource(new3);
                imageView4.setImageResource(new4);
                imageView5.setImageResource(new5);
                imageView6.setImageResource(new6);

            }
        });
    }

    public static int randomDiceVal(){
        return RANDOM.nextInt(6) + 1;
    }
}
