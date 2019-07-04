package com.example.pervokursnik;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class DestinationShow extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView;
    ImageButton buttonCancel;
    TextView textView;

    GifImageView gifImageView;
    GifImageView gifImageView1;

    GifDrawable gifDrawable;
    GifDrawable gifDrawable1;

    ArrayList<String> items1 = new ArrayList<>();
    SpinnerDialog spinnerDialog;
    Button buttonSelectPosition;

    int secondRoom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.destination_show);

        imageView1 = findViewById(R.id.imageLevel);
        textView = findViewById(R.id.textView2);

        gifImageView = findViewById(R.id.gifImageView);

        gifImageView1 = findViewById(R.id.gifImageView1);


        initItems1();


        spinnerDialog = new SpinnerDialog(DestinationShow.this, items1, "Найдите или введите номер аудитории", R.style.DialogAnimations_SmileWindow, "Закрыть");
        spinnerDialog.setCancellable(true);
        spinnerDialog.setShowKeyboard(false);


        imageView = findViewById(R.id.imageView);


        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            int pic = bundle.getInt("check9");
            imageView.setImageResource(pic);
            textView.setText("2");
            secondRoom = 215;

//            int gif = bundle.getInt("gif");
//            gifImageView.setBackgroundResource(gif);


        }

        Bundle bundle1 = this.getIntent().getExtras();
        if (bundle1 != null) {
            int pic = bundle1.getInt("check9");
            imageView.setImageResource(pic);
        }


        buttonCancel = findViewById(R.id.imageButton);
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DestinationShow.this, MainActivity.class);
                startActivity(intent);
            }
        });


        spinnerDialog = new SpinnerDialog(DestinationShow.this, items1, "Введите пункт отправления(откуда)", R.style.DialogAnimations_SmileWindow, "Закрыть");
        spinnerDialog.setCancellable(true);
        spinnerDialog.setShowKeyboard(false);


        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String item1, int position1) {



                //Переход при выборе на другую активность
                //Частный случай
                //imageView1.setVisibility(View.INVISIBLE);



                if (item1.equals("312 - лекционная аудитория") && secondRoom == 215) {



                    textView.setText("3");

                    gifImageView.setVisibility(View.VISIBLE);
                    buttonSelectPosition.setVisibility(View.INVISIBLE);



                    try {
                        gifDrawable = new GifDrawable(getResources(), R.drawable.three_one_two_g1);
                        //
                        gifDrawable1 = new GifDrawable(getResources(), R.drawable.two_one_five_g1);
                        //
                        gifDrawable.start();

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                // Делаем полные анимации и после переход на последнюю активность
                                //
                                gifDrawable.stop();
                                gifImageView.setVisibility(View.INVISIBLE);
                                textView.setText("2");
                                gifImageView1.setVisibility(View.VISIBLE);
                                gifDrawable1.start();

                                // Переход на карту этажей и передача этажей
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(DestinationShow.this, LevelsMap.class);
                                        startActivity(intent);
                                        imageView.clearAnimation();

                                    }
                                }, 10000);

                            }

                        }, 10000);

                    } catch (IOException e) {
                        e.printStackTrace();

                    }



                }

                //Toast.makeText(DestinationShow.this, "Выбрано: " + item1, Toast.LENGTH_LONG).show();
            }
        });

        // action на "найти помещение"
        buttonSelectPosition = findViewById(R.id.buttonFinder);
        buttonSelectPosition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerDialog.setShowKeyboard(true);
                spinnerDialog.showSpinerDialog();
            }
        });


    }

    private void initItems1() {

        //items1.set(1, "ХОЛЛ 2 этаж");
        //0
        items1.add("ХОЛЛ 2 этаж");
        //1
        items1.add("ХОЛЛ 3 этаж");
        //2
        items1.add("215 - лекционная аудитория");
        //3
        items1.add("220 - лекционная аудитория");
        //4
        items1.add("312 - лекционная аудитория");
        //5
        items1.add("219 - учебная аудитория");
        //6
        items1.add("225 - учебная аудитория");
        //7
        items1.add("304 - учебная аудитория");
        items1.add("306 - учебная аудитория");
        //8
        items1.add("210 - компьютерный класс");
        //9
        items1.add("213 - компьютерный класс");
        //§0
        items1.add("216 - компьютерный класс");
        items1.add("223 - компьютерный класс");
        items1.add("208 - каб. инностранных языков");
        items1.add("305 - каб. инностранных языков");
        items1.add("Деканат");
        items1.add("Столовая");
        items1.add("Туалет М 2 этаж");
        items1.add("Туалет Ж 2 этаж");
        items1.add("Туалет М 3 этаж");
        items1.add("Туалет Ж 3 этаж");
        items1.add("Библиотека");
        items1.add("203");
        items1.add("207");
        items1.add("301");
        items1.add("304");
        items1.add("309");
    }



}
