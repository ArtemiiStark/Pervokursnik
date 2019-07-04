package com.example.pervokursnik;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.w3c.dom.Text;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Schedule_Bus extends AppCompatActivity {

    Button openMap;
    ImageButton imageButtonBack;

    Button red_square_22c;
    Button oct_square_22c;
    Button school_50_22c;
    Button corpus_7_22c;
    Button torg_pereulok_12;
    Button red_square_12;
    Button oct_square_12;
    Button school_50_12;
    Button univer_city_12;
    Button motor_zavod_22;
    Button marks_square_22;
    Button oct_square_22;
    Button school_50_22;
    Button univ_city_22;
    Button middle_poselok12;
    Button middle_poselok22;

    TextView page2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus_schedule);

        imageButtonBack = findViewById(R.id.imageButtonBack);

        middle_poselok12 = findViewById(R.id.middle_poselok_12);
        middle_poselok22 = findViewById(R.id.middle_poselok_22);

        page2 = findViewById(R.id.page2);

        openMap = findViewById(R.id.openMap);

        red_square_22c = findViewById(R.id.red_square_22c);
        oct_square_22c = findViewById(R.id.oct_square_22c);
        school_50_22c = findViewById(R.id.school_50_22c);
        corpus_7_22c = findViewById(R.id.corpus_7_22c);
        torg_pereulok_12 = findViewById(R.id.torg_pereulok_12);
        red_square_12 = findViewById(R.id.red_square_12);
        oct_square_12 = findViewById(R.id.oct_square_12);
        school_50_12 = findViewById(R.id.school_50_12);
        univer_city_12 = findViewById(R.id.univer_city_12);
        motor_zavod_22 = findViewById(R.id.motor_zavod_22);
        marks_square_22 = findViewById(R.id.marks_square_22);
        oct_square_22 = findViewById(R.id.oct_square_22);
        school_50_22 = findViewById(R.id.school_50_22);
        univ_city_22 = findViewById(R.id.univ_city_22);



        openMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://yandex.ru/maps/?um=constructor%3A73167e469f19143083cea406d1de152fa1a9e7d5212cbe21e5474ebd12aa44d1&source=constructorLink"));
                startActivity(browserIntent);
            }
        });




        red_square_22c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22c&q=0&id=294&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches = new ArrayList<>();
                                Matcher matcher = pattern.matcher(result);


                                matcher.find();
//                                while(matcher.find()) {
                                allMatches.add(matcher.group());
                                String firstCome = allMatches.get(0).replace('.', ':');

//                                }
                                customDialog("Красная площадь", firstCome);
                            }
                        });
            }
        });

        oct_square_22c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22c&q=0&id=295&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern1 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches2 = new ArrayList<String>();
                                Matcher matcher1 = pattern1.matcher(result);
                                matcher1.find();
                                    allMatches2.add(matcher1.group());
                                    String status = allMatches2.get(0).toString().replace('.', ':');
                                    customDialog("Октябрьская площадь", status);

                            }
                        });
            }
        });


        school_50_22c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22c&q=0&id=297&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern2 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches1 = new ArrayList<String>();
                                Matcher matcher2 = pattern2.matcher(result);
                                matcher2.find();
                                allMatches1.add(matcher2.group());
                                String firstCom = allMatches1.get(0).toString().replace('.', ':');
                                customDialog("Школа №50", firstCom);

                            }
                        });
            }
        });

        corpus_7_22c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22c&q=0&id=302&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern3 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches3 = new ArrayList<String>();
                                Matcher matcher3 = pattern3.matcher(result);
                                matcher3.find();
                                allMatches3.add(matcher3.group());
                                String firstCome1 = allMatches3.get(0).toString().replace('.', ':');
                                customDialog("7 корпус ЯрГУ", firstCome1);

                            }
                        });
            }
        });


        torg_pereulok_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=12&q=0&id=69&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern4 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");
                                Pattern pattern1 = Pattern.compile("рейсов нет");

                                List<String> allMatches4 = new ArrayList<String>();
                                Matcher matcher4 = pattern4.matcher(result);
                                matcher4.find();
                                allMatches4.add(matcher4.group());
                                String firstCome2 = allMatches4.get(0).toString().replace('.', ':');
                                customDialog("Торговый переулок", firstCome2);

                            }
                        });
            }
        });


        red_square_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=12&q=1&id=238&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern5 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");
                                Pattern pattern1 = Pattern.compile("рейсов нет");

                                List<String> allMatches5 = new ArrayList<String>();
                                Matcher matcher5 = pattern5.matcher(result);
                                matcher5.find();
                                allMatches5.add(matcher5.group());
                                String firstCome3 = allMatches5.get(0).toString().replace('.', ':');
                                customDialog("Красная площадь", firstCome3);

                            }
                        });
            }
        });


        oct_square_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=12&q=1&id=295&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern6 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");
                                Pattern pattern1 = Pattern.compile("рейсов нет");

                                List<String> allMatches6 = new ArrayList<String>();
                                Matcher matcher6 = pattern6.matcher(result);
                                matcher6.find();
                                allMatches6.add(matcher6.group());
                                String firstCome4 = allMatches6.get(0).toString().replace('.', ':');
                                customDialog("Октябрьская площадь", firstCome4);

                            }
                        });
            }
        });


        school_50_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=12&q=1&id=297&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern7 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");
                                Pattern pattern1 = Pattern.compile("рейсов нет");

                                List<String> allMatches7 = new ArrayList<String>();
                                Matcher matcher7 = pattern7.matcher(result);
                                matcher7.find();
                                allMatches7.add(matcher7.group());
                                String firstCome5 = allMatches7.get(0).toString().replace('.', ':');
                                customDialog("Школа №50", firstCome5);

                            }
                        });
            }
        });



        univer_city_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=12&q=1&id=853&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern8 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches8 = new ArrayList<String>();
                                Matcher matcher8 = pattern8.matcher(result);
                                matcher8.find();
                                allMatches8.add(matcher8.group());
                                String firstCome6 = allMatches8.get(0).toString().replace('.', ':');
                                customDialog("Университетский городок", firstCome6);

                            }
                        });
            }
        });


        motor_zavod_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22&q=0&id=164&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern9 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches9 = new ArrayList<String>();
                                Matcher matcher9 = pattern9.matcher(result);
                                matcher9.find();
                                allMatches9.add(matcher9.group());
                                String firstCome7 = allMatches9.get(0).toString().replace('.', ':');
                                customDialog("Моторный завод", firstCome7);

                            }
                        });
            }
        });


        marks_square_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22&q=0&id=166&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern10 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches10 = new ArrayList<String>();
                                Matcher matcher10 = pattern10.matcher(result);
                                matcher10.find();
                                allMatches10.add(matcher10.group());
                                String firstCome8 = allMatches10.get(0).toString().replace('.', ':');
                                customDialog("Площадь Карла Маркса", firstCome8);

                            }
                        });
            }
        });


        oct_square_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22&q=0&id=295&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternq = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesq = new ArrayList<String>();
                                Matcher matcherq = patternq.matcher(result);
                                matcherq.find();
                                allMatchesq.add(matcherq.group());
                                String firstCome9 = allMatchesq.get(0).toString().replace('.', ':');
                                customDialog("Октябрьская площадь", firstCome9);

                            }
                        });
            }
        });


        school_50_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22&q=0&id=297&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patternw = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchesw = new ArrayList<String>();
                                Matcher matcherw = patternw.matcher(result);
                                matcherw.find();
                                allMatchesw.add(matcherw.group());
                                String firstComeq = allMatchesw.get(0).toString().replace('.', ':');
                                customDialog("Школа №50", firstComeq);

                            }
                        });
            }
        });

        univ_city_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22&q=0&id=853&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern patterne = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatchese = new ArrayList<String>();
                                Matcher matchere = patterne.matcher(result);
                                matchere.find();
                                allMatchese.add(matchere.group());
                                String firstComew = allMatchese.get(0).toString().replace('.', ':');
                                customDialog("Университетский городок", firstComew);

                            }
                        });
            }
        });

        middle_poselok12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=12&q=1&id=855&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern1 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches2 = new ArrayList<String>();
                                Matcher matcher1 = pattern1.matcher(result);
                                matcher1.find();
                                allMatches2.add(matcher1.group());
                                String status = allMatches2.get(0).toString().replace('.', ':');
                                customDialog("Средний поселок", status);

                            }
                        });
            }
        });

        middle_poselok22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ion.with(getApplicationContext())
                        .load("http://yartr.ru/rasp.php?vt=1&nmar=22&q=0&id=855&view=1")
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {

                                Pattern pattern1 = Pattern.compile("(([0,1][0-9])|(2[0-3])).[0-5][0-9]");

                                List<String> allMatches2 = new ArrayList<String>();
                                Matcher matcher1 = pattern1.matcher(result);
                                matcher1.find();
                                allMatches2.add(matcher1.group());
                                String status = allMatches2.get(0).toString().replace('.', ':');
                                customDialog("Средний поселок", status);

                            }
                        });
            }
        });


        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Schedule_Bus.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }


    public void getItems1(View view) {
        Intent intent = new Intent(Schedule_Bus.this, Schedule_bus1.class);
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
