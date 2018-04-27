package edu.illinois.cs.cs125.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toolbar;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2, imageView3,imageView4, imageView5, imageView6;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDices = (Button) findViewById(R.id.rolling);
        spinner = (Spinner) findViewById(R. id.spinner);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.amount_arrays, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        imageView6 = (ImageView) findViewById(R.id.imageView6);


        rollDices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<ImageView> list = new ArrayList<ImageView>();
                list.add(imageView1);
                list.add(imageView2);
                list.add(imageView3);
                list.add(imageView4);
                list.add(imageView5);
                list.add(imageView6);

                for(int i = 0; i < 6; i++){
                    list.get(i).setVisibility(View.VISIBLE);
                }

                String text = spinner.getSelectedItem().toString();
                int input = Integer.parseInt(text);

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

                for(int i = 0; i < 6 - input; i++){
                        int index = randomFromList(list);
                        list.get(index).setVisibility(View.INVISIBLE);
                        list.remove(index);
                }
            }
        });

    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    public static int randomDiceVal(){
        return RANDOM.nextInt(6) + 1;
    }

    public static int randomFromList(List list) {
        int index = RANDOM.nextInt(list.size());
        return index;
    }

}
