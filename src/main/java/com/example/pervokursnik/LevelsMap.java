package com.example.pervokursnik;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class LevelsMap extends AppCompatActivity {

    Button buttonBackMenu;
    ImageButton firstLevel;
    ImageButton secondLevel;
    ImageButton thirdLevel;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        buttonBackMenu = findViewById(R.id.buttonBack);
        firstLevel = findViewById(R.id.firstLevel);
        secondLevel = findViewById(R.id.secondLevel);
        thirdLevel = findViewById(R.id.thirdLevel);
        imageView = findViewById(R.id.imageMap);


        buttonBackMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LevelsMap.this, MainActivity.class);
                startActivity(intent);
            }
        });

        firstLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        secondLevel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                imageView.setImageResource(R.drawable.two_one_five1);






            }
        });

        thirdLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                imageView.setImageResource(R.drawable.three_one_two1);



            }
        });


    }

}
