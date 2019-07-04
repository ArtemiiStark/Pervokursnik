package com.example.pervokursnik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class Shedule_lessons extends AppCompatActivity {

    PDFView pdfView;
    ArrayList<String> items1 = new ArrayList<>();
    Button buttonFind;
    Button buttonCancel;
    Button status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shedule_lessons);

        initItems1();

        status = findViewById(R.id.status);

        pdfView = findViewById(R.id.pdfView);

        final SpinnerDialog spinnerDialog1 = new SpinnerDialog(Shedule_lessons.this, items1, "Введите специальность", R.style.DialogAnimations_SmileWindow, "Закрыть");
        spinnerDialog1.setCancellable(true);


        buttonFind = findViewById(R.id.buttonFind);
        buttonFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                status.setVisibility(View.INVISIBLE);
                pdfView.setVisibility(View.VISIBLE);
                spinnerDialog1.setShowKeyboard(true);
                spinnerDialog1.showSpinerDialog();
            }
        });

        buttonCancel = findViewById(R.id.buttonCancel);
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Shedule_lessons.this, MainActivity.class);
                startActivity(intent);
            }
        });


        spinnerDialog1.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String item, int position) {

                if(position == 1) {
                    pdfView.fromAsset("tab_raspIVT-1-19_V-2.pdf").load();
                } else if (position == 2) {
                    pdfView.fromAsset("tab_raspPIEIT-1-19_V.pdf").load();


                } else if (position == 3) {
                    pdfView.fromAsset("tab_raspIVT-2-19_V.pdf").load();


                } else if (position == 4) {
                    pdfView.fromAsset("tab_raspPIEIT-2-19_V.pdf").load();

                } else if (position == 5) {
                    pdfView.fromAsset("tab_raspIVT-3-19_V.pdf").load();


                } else if (position == 6) {
                    pdfView.fromAsset("tab_raspPIEIT-3-19_V.pdf").load();

                }


            }
        });
    }

    private void initItems1() {

        //items.set(1, "ХОЛЛ 2 этаж");
        items1.add("Выберите из списка");
        items1.add("1 курс ИВТ");
        items1.add("1 курс ПИЭ/ИТ");
        items1.add("2 курс ИВТ");
        items1.add("2 курс ПИЭ/ИТ");
        items1.add("3 курс ИВТ");
        items1.add("3 курс ПИЭ/ИТ");

    }
}
