package edu.illinois.cs.cs125.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2, imageView3,imageView4, imageView5, imageView6;
    Button b2, b3, b4, b5, b6, b1;
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

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
                b4 = (Button) findViewById(R.id.button4);
                b5 = (Button) findViewById(R.id.button5);
                b6 = (Button) findViewById(R.id.button6);


        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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
                imageView1.setVisibility(View.INVISIBLE);
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

    public void b1Clicked(View v) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
    }
    public void b2Clicked(View v) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.INVISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
    }
    public void b3Clicked(View v) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.INVISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
    }
    public void b4Clicked(View v) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);
        imageView5.setVisibility(View.INVISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
    }
    public void b5Clicked(View v) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);
        imageView5.setVisibility(View.VISIBLE);
        imageView6.setVisibility(View.INVISIBLE);
    }
    public void b6Clicked(View v) {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);
        imageView5.setVisibility(View.VISIBLE);
        imageView6.setVisibility(View.VISIBLE);
    }


}
