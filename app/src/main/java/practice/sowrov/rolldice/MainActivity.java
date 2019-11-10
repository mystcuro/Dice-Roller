package practice.sowrov.rolldice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button rollButton = (Button) findViewById(R.id.button);
        final ImageView leftDice = (ImageView) findViewById(R.id.rollimg_1);
        final ImageView rightDice = (ImageView) findViewById(R.id.rollimg_2);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener(){
             @Override
            public void onClick(View v){

                 Random randomNumberGenerator = new Random();
                 int i = randomNumberGenerator.nextInt();
                 leftDice.setImageResource(diceArray[i]);
                 i = randomNumberGenerator.nextInt();
                 rightDice.setImageResource(diceArray[i]);

             }
        });
    }

}
