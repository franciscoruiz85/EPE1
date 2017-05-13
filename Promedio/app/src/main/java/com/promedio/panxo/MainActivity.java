package com.promedio.panxo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_epr1, et_epr2, et_epe1, et_epe2,
            et_eva1, et_eva2, et_eva3, et_eva4, et_exam;
    TextView prom_parcial, prom_final;
    Button calcular, calfinal, datos;
    String nota;
    int notas=0;
    double pfinal=0, parcial=0, evas=0, epr1, epr2, epe1, epe2, eva1, eva2, eva3, eva4, exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_epr1 = (EditText) findViewById(R.id.etEPR1);
        et_epr2 = (EditText) findViewById(R.id.etEPR2);
        et_epe1 = (EditText) findViewById(R.id.etEPE1);
        et_epe2 = (EditText) findViewById(R.id.etEPE2);
        et_eva1 = (EditText) findViewById(R.id.etEVA1);
        et_eva2 = (EditText) findViewById(R.id.etEVA2);
        et_eva3 = (EditText) findViewById(R.id.etEVA3);
        et_eva4 = (EditText) findViewById(R.id.etEVA4);
        et_exam = (EditText) findViewById(R.id.etExamen);

        prom_parcial  = (TextView) findViewById(R.id.txtPromParcial);
        prom_final  = (TextView) findViewById(R.id.txtPromFinal);
        calcular = (Button) findViewById(R.id.calProm);
        calfinal = (Button) findViewById(R.id.calFinal);
        datos = (Button) findViewById(R.id.datos);

        et_epr2.setOnFocusChangeListener( new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_epr1.getText().toString();
                if ( !nota.isEmpty()) {
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_epr1.setError("Nota mal ingresada");
                        et_epr1.requestFocus();
                        et_epr1.setText("");
                    }
                    else {
                        epr1 = (notas*0.1)*0.1;
                        prom_parcial.setText(Double.toString(epr1));
                    }
                }
                else{
                    et_epr1.setError("Ingrese una nota");
                    et_epr1.requestFocus();
                }
            }
        });

        et_epe1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_epr2.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas=0;
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_epr2.setError("Nota mal ingresada");
                        et_epr2.requestFocus();
                        et_epr2.setText("");
                    }
                    else {
                        epr2 = (notas*0.1)*0.2;
                        prom_parcial.setText(Double.toString(epr2));
                    }
                }
                else{
                    et_epr2.setError("Ingrese una nota");
                    et_epr2.requestFocus();
                }
            }
        });

        et_epe2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_epe1.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas=0;
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_epe1.setError("Nota mal ingresada");
                        et_epe1.requestFocus();
                        et_epe1.setText("");
                    }
                    else {
                        epe1 = (notas*0.1)*0.15;
                        prom_parcial.setText(Double.toString(epe1));
                    }
                }
                else{
                    et_epe1.setError("Ingrese una nota");
                    et_epe1.requestFocus();
                }
            }
        });

        et_eva1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_epe2.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_epe2.setError("Nota mal ingresada");
                        et_epe2.requestFocus();
                        et_epe2.setText("");
                    }
                    else {
                        epe2 = (notas*0.1)*0.25;
                        prom_parcial.setText(Double.toString(epe2));
                    }
                }
                else{
                    et_epe2.setError("Ingrese una nota");
                    et_epe2.requestFocus();
                }
            }
        });

        et_eva2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                notas=0;
                nota = et_eva1.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_eva1.setError("Nota mal ingresada");
                        et_eva1.requestFocus();
                        et_eva1.setText("");
                    }
                    else {
                        eva1 = notas*0.1;
                        prom_parcial.setText(Double.toString(eva1));
                    }
                }
                else{
                    et_eva1.setError("Ingrese una nota");
                    et_eva1.requestFocus();
                }
            }
        });

        et_eva3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_eva2.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_eva2.setError("Nota mal ingresada");
                        et_eva2.requestFocus();
                        et_eva2.setText("");
                    }
                    else {
                        eva2 = notas*0.1;
                        prom_parcial.setText(Double.toString(eva2));
                    }
                }
                else{
                    et_eva2.setError("Ingrese una nota");
                    et_eva2.requestFocus();
                }
            }
        });

        et_eva4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_eva3.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_eva3.setError("Nota mal ingresada");
                        et_eva3.requestFocus();
                        et_eva3.setText("");
                    }
                    else {
                        eva3 = notas*0.1;
                        prom_parcial.setText(Double.toString(eva3));
                    }
                }
                else{
                    et_eva3.setError("Ingrese una nota");
                    et_eva3.requestFocus();
                }
            }
        });

        calcular.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                nota = et_eva4.getText().toString();
                if ( !nota.isEmpty() ) {
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_eva4.setError("Nota mal ingresada");
                        et_eva4.requestFocus();
                        et_eva4.setText("");
                    }
                    else {
                        eva4 = notas*0.1;
                        prom_parcial.setText(Double.toString(eva4));
                        calcular.setEnabled(true);
                        et_exam.requestFocus();
                    }
                }
                else{
                    et_eva4.setError("Ingrese una nota");
                    et_eva4.requestFocus();
                }
            }
        });


        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                evas = eva1 + eva2 + eva3 + eva4;
                parcial = epr1 + epr2 + epe1 + epe2 + ((evas/4)*0.3);
                prom_parcial.setText(Double.toString(parcial));

                if (parcial<5.5){
                    et_exam.setEnabled(true);
                    calfinal.setEnabled(true);
                }
                else{
                    prom_final.setText(Double.toString(parcial));
                }
            }
        });

        calfinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nota = et_exam.getText().toString();
                if (!nota.isEmpty()){
                    notas = Integer.parseInt(nota);
                    if ( notas < 10 || notas > 70 ) {
                        et_exam.setError("Nota mal ingresada");
                        et_exam.requestFocus();
                        et_exam.setText("");
                    }
                    else {
                        exam = notas*0.1;
                        pfinal = parcial*0.7 + exam*0.3;
                        prom_final.setText(Double.toString(pfinal));
                        datos.setEnabled(true);
                    }
                }
                else{
                    et_exam.setError("Ingrese una nota");
                    et_exam.requestFocus();
                }
            }
        });

        datos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DatosActivity.class));
            }
        });
    }
}
