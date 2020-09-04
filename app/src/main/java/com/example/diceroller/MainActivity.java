package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgdice;
    MediaPlayer mp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgdice=findViewById(R.id.imgdice);
        imgdice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp1!=null)
                {
                    mp1.stop();
                    mp1.release();
                    mp1=null;
                }
                mp1=MediaPlayer.create(getApplicationContext(),R.raw.diceroll);
                mp1.start();

                Random random=new Random();
                int num=random.nextInt(6)+1;
                switch (num)
                {
                    case 1:
                    imgdice.setImageResource(R.drawable.diceone);
                    break;
                    case 2:
                    imgdice.setImageResource(R.drawable.dicetwo);
                    break;
                    case 3:
                    imgdice.setImageResource(R.drawable.dicethree);
                    break;
                    case 4:
                    imgdice.setImageResource(R.drawable.dicefour);
                    break;
                    case 5:
                    imgdice.setImageResource(R.drawable.dicefive);
                    break;
                    case 6:
                    imgdice.setImageResource(R.drawable.dicesix);
                    break;
                }
            }
        });
    }
}