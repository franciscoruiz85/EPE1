package com.promedio.panxo;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {

    Button salir;
    CheckBox licencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        licencia = (CheckBox) findViewById(R.id.checkBox);
        salir = (Button) findViewById(R.id.btn_salir);

        licencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir.setEnabled(true);
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context aqui = getApplicationContext();
                Toast.makeText(aqui, "Licencia aceptada",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
