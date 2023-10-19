package com.example.estudiarinformatica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spCiclo = (Spinner) findViewById(R.id.sPciclo);
        Spinner spPoblacion = (Spinner) findViewById(R.id.spPoblacion);
        Spinner spTipo = (Spinner) findViewById(R.id.spTipo);

        AccionMostrarTexto(spCiclo, spPoblacion, spTipo);
    }

    public void AccionMostrarTexto(Spinner spCiclo, Spinner spPoblacion, Spinner spTipo){


    }
}