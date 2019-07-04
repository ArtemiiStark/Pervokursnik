package com.example.pervokursnik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> items = new ArrayList<>();


    SpinnerDialog spinnerDialog;

    Button  buttonSelectDestination;
    Button buttonFindSchedule;
    Button buttonFindBus;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        initItems();




        spinnerDialog = new SpinnerDialog(MainActivity.this, items, "Введите пункт назначения(куда)", R.style.DialogAnimations_SmileWindow, "Закрыть");
        spinnerDialog.setCancellable(true);


        //spinnerDialog.setShowKeyboard(false);


        buttonSelectDestination = findViewById(R.id.firstMenuButton);
        buttonSelectDestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerDialog.setShowKeyboard(true);
                spinnerDialog.showSpinerDialog();
            }
        });


        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String item, int position) {

                if(position == 3) {

                    Intent intent = new Intent(MainActivity.this, DestinationShow.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("check9", R.drawable.two_one_five_d);
                    intent.putExtras(bundle);

                    startActivity(intent);
                }

                if(position == 9) {

                    Intent intent = new Intent(MainActivity.this, DestinationShow.class);
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("check9", R.drawable.two_one_zero_d);
                    intent.putExtras(bundle2);
                    startActivity(intent);
                }




                Toast.makeText(MainActivity.this, "Выбрано: " + item, Toast.LENGTH_LONG).show();
            }
        });

        // action на "найти помещение"

        buttonFindSchedule = findViewById(R.id.secondMenuButton);
        buttonFindSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Shedule_lessons.class);
                startActivity(intent);
            }
        });

        buttonFindBus = findViewById(R.id.thirdMenuButton);
        buttonFindBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Schedule_Bus.class);
                startActivity(intent);
            }
        });

    }

    //Заполнение спинера
    private void initItems() {

        //items.set(1, "ХОЛЛ 2 этаж");
        items.add("Выберите из списка");
        items.add("ХОЛЛ 2 этаж");
        items.add("ХОЛЛ 3 этаж");
        items.add("215 - лекционная аудитория");
        items.add("220 - лекционная аудитория");
        items.add("312 - лекционная аудитория");
        items.add("219 - учебная аудитория");
        items.add("225 - учебная аудитория");
        items.add("304 - учебная аудитория");
        items.add("306 - учебная аудитория");
        items.add("210 - компьютерный класс");
        items.add("213 - компьютерный класс");
        items.add("216 - компьютерный класс");
        items.add("223 - компьютерный класс");
        items.add("208 - каб. инностранных языков");
        items.add("305 - каб. инностранных языков");
        items.add("Деканат");
        items.add("Столовая");
        items.add("Туалет М 2 этаж");
        items.add("Туалет Ж 2 этаж");
        items.add("Туалет М 3 этаж");
        items.add("Туалет Ж 3 этаж");
        items.add("Библиотека");
        items.add("203");
        items.add("207");
        items.add("301");
        items.add("304");
        items.add("309");
    }


}
