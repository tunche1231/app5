package com.example.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner opciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opciones = findViewById(R.id.spinner);

        //String[] datos2 = getResources().getStringArray(R.array.opciones_sexo);
        List<Persona> datos = new ArrayList<>();
        datos.add(new Persona("70318982","Diego", R.drawable.ic_android_black_24dp));
        datos.add(new Persona("71456874","Juan",R.drawable.ic_aspect_ratio_black_24dp));

        Activity_spinner adapter = new Activity_spinner(this,datos, R.layout.item_spinner);
        opciones.setAdapter(adapter);

        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
