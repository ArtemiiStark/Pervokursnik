package com.example.pervokursnik;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Schedule_bus1 extends AppCompatActivity {

    Button openMap;
    ImageButton imageButtonBack;
    TextView page1;


    Button globus_1;
    Button avrora_1;
    Button krasn_1;
    Button school_50_1;
    Button univer_city_1;
    Button nizh_poselok_1;

    Button globus_2;
    Button avrora_2;
    Button krasn_2;
    Button school_50_2;
    Button univer_city_2;
    Button nizh_poselok_2;

    Button shinn_zavod;
    Button oct_square_27;
    Button school_50_27;
    Button soyuznaya;
    Button sof_church;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maket);

        page1 = findViewById(R.id.page1);

        imageButtonBack = findViewById(R.id.imageButtonBack);

        openMap = findViewById(R.id.openMap);

        globus_1 = findViewById(R.id.globus_1);
        globus_2 = findViewById(R.id.globus_2);

        avrora_1 = findViewById(R.id.avrora_1);
        avrora_2 = findViewById(R.id.avrora_2);

        krasn_1 = findViewById(R.id.krasn_1);
        krasn_2 = findViewById(R.id.krasn_2);

        school_50_1 = findViewById(R.id.school_50_1);
        school_50_2 = findViewById(R.id.school_50_2);

        univer_city_1 = findViewById(R.id.univer_city_1);
        univer_city_2 = findViewById(R.id.univer_city_2);

        nizh_poselok_1 = findViewById(R.id.nizh_poselok_1);
        nizh_poselok_2 = findViewById(R.id.nizh_poselok_2);

        shinn_zavod = findViewById(R.id.shinn_zavod);
        oct_square_27 = findViewById(R.id.oct_square_27);
        school_50_27 = findViewById(R.id.school_50_27);
        soyuznaya = findViewById(R.id.soyuznaya);
        sof_church = findViewById(R.id.sof_church);


        openMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://yandex.ru/maps/?um=constructor%3A73167e469f19143083cea406d1de152fa1a9e7d5212cbe21e5474ebd12aa44d1&source=constructorLink"));
                startActivity(browserIntent);
            }
        });


        globus_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=498&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternr = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesr = new ArrayList<String>();
                                Matcher matcherr = patternr.matcher(result);
                                matcherr.find();
                                allMatchesr.add(matcherr.group());
                                String firstComee = allMatchesr.get(0).toString().replace('.', ':');
                                customDialog("Глобус", firstComee);

                            }
                        });
            }
        });

        avrora_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=449&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternt = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchest = new ArrayList<String>();
                                Matcher matchert = patternt.matcher(result);
                                matchert.find();
                                allMatchest.add(matchert.group());
                                String firstComer = allMatchest.get(0).toString().replace('.', ':');
                                customDialog("Кинотеатр Аврора", firstComer);

                            }
                        });
            }
        });

        krasn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=392&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterny = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesy = new ArrayList<String>();
                                Matcher matchery = patterny.matcher(result);
                                matchery.find();
                                allMatchesy.add(matchery.group());
                                String firstComet = allMatchesy.get(0).toString().replace('.', ':');
                                customDialog("ул. Красноборская", firstComet);

                            }
                        });
            }
        });


        school_50_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=907&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternu = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesu = new ArrayList<String>();
                                Matcher matcheru = patternu.matcher(result);
                                matcheru.find();
                                allMatchesu.add(matcheru.group());
                                String firstComey = allMatchesu.get(0).toString().replace('.', ':');
                                customDialog("Школа №50", firstComey);

                            }
                        });
            }
        });

        univer_city_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=853&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterni = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesi = new ArrayList<String>();
                                Matcher matcheri = patterni.matcher(result);
                                matcheri.find();
                                allMatchesi.add(matcheri.group());
                                String firstComeu = allMatchesi.get(0).toString().replace('.', ':');
                                customDialog("Университетский городок", firstComeu);

                            }
                        });
            }
        });


        nizh_poselok_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=859&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterno = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatcheso = new ArrayList<String>();
                                Matcher matchero = patterno.matcher(result);
                                matchero.find();
                                allMatcheso.add(matchero.group());
                                String firstComei = allMatcheso.get(0).toString().replace('.', ':');
                                customDialog("Средний поселок", firstComei);

                            }
                        });
            }
        });


        shinn_zavod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=27&q=0&id=168&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternr = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesr = new ArrayList<String>();
                                Matcher matcherr = patternr.matcher(result);
                                matcherr.find();
                                allMatchesr.add(matcherr.group());
                                String firstComee = allMatchesr.get(0).toString().replace('.', ':');
                                customDialog("Шинный завод", firstComee);

                            }
                        });
            }
        });

        oct_square_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=27&q=0&id=295&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternt = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchest = new ArrayList<String>();
                                Matcher matchert = patternt.matcher(result);
                                matchert.find();
                                allMatchest.add(matchert.group());
                                String firstComer = allMatchest.get(0).toString().replace('.', ':');
                                customDialog("Октябрьская", firstComer);

                            }
                        });
            }
        });

        school_50_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=27&q=0&id=297&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterny = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesy = new ArrayList<String>();
                                Matcher matchery = patterny.matcher(result);
                                matchery.find();
                                allMatchesy.add(matchery.group());
                                String firstComet = allMatchesy.get(0).toString().replace('.', ':');
                                customDialog("Школа №50", firstComet);

                            }
                        });
            }
        });


        soyuznaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=27&q=0&id=879&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternu = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesu = new ArrayList<String>();
                                Matcher matcheru = patternu.matcher(result);
                                matcheru.find();
                                allMatchesu.add(matcheru.group());
                                String firstComey = allMatchesu.get(0).toString().replace('.', ':');
                                customDialog("Союзная 1", firstComey);

                            }
                        });
            }
        });

        sof_church.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=27&q=0&id=883&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterni = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesi = new ArrayList<String>();
                                Matcher matcheri = patterni.matcher(result);
                                matcheri.find();
                                allMatchesi.add(matcheri.group());
                                String firstComeu = allMatchesi.get(0).toString().replace('.', ':');
                                customDialog("Софийская церковь", firstComeu);

                            }
                        });
            }
        });


        nizh_poselok_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=855&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterno = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatcheso = new ArrayList<String>();
                                Matcher matchero = patterno.matcher(result);
                                matchero.find();
                                allMatcheso.add(matchero.group());
                                String firstComei = allMatcheso.get(0).toString().replace('.', ':');
                                customDialog("Средний поселок", firstComei);

                            }
                        });
            }
        });


        globus_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=498&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternr = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesr = new ArrayList<String>();
                                Matcher matcherr = patternr.matcher(result);
                                matcherr.find();
                                allMatchesr.add(matcherr.group());
                                String firstComee = allMatchesr.get(0).toString().replace('.', ':');
                                customDialog("Глобус", firstComee);

                            }
                        });
            }
        });

        avrora_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=449&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternt = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchest = new ArrayList<String>();
                                Matcher matchert = patternt.matcher(result);
                                matchert.find();
                                allMatchest.add(matchert.group());
                                String firstComer = allMatchest.get(0).toString().replace('.', ':');
                                customDialog("Кинотеатр Аврора", firstComer);

                            }
                        });
            }
        });

        krasn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=392&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterny = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesy = new ArrayList<String>();
                                Matcher matchery = patterny.matcher(result);
                                matchery.find();
                                allMatchesy.add(matchery.group());
                                String firstComet = allMatchesy.get(0).toString().replace('.', ':');
                                customDialog("ул. Красноборская", firstComet);

                            }
                        });
            }
        });


        school_50_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=907&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternu = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesu = new ArrayList<String>();
                                Matcher matcheru = patternu.matcher(result);
                                matcheru.find();
                                allMatchesu.add(matcheru.group());
                                String firstComey = allMatchesu.get(0).toString().replace('.', ':');
                                customDialog("Школа №50", firstComey);

                            }
                        });
            }
        });

        univer_city_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=35&q=0&id=853&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterni = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesi = new ArrayList<String>();
                                Matcher matcheri = patterni.matcher(result);
                                matcheri.find();
                                allMatchesi.add(matcheri.group());
                                String firstComeu = allMatchesi.get(0).toString().replace('.', ':');
                                customDialog("Университетский городок", firstComeu);

                            }
                        });
            }
        });


        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Schedule_bus1.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void getItems2(View view) {
        Intent intent = new Intent(Schedule_bus1.this, Schedule_Bus.class);
        startActivity(intent);
    }

    public void customDialog(String title, String message){
        final android.support.v7.app.AlertDialog.Builder builderSingle = new android.support.v7.app.AlertDialog.Builder(this);
        builderSingle.setTitle(title);
        builderSingle.setMessage(message);


        builderSingle.setPositiveButton(
                "OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });


        builderSingle.show();
    }
}














