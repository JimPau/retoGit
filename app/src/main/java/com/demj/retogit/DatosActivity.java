package com.demj.retogit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {


    private TextView textrespuesta,textrespuesta2;

    // Metodo para el boton regresar aqui el VIew si funciona
    public void regresar (View view) {
        Intent i = new Intent(DatosActivity.this, MainActivity.class);
        startActivity(i);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        textrespuesta = (TextView)findViewById(R.id.textrespuesta);
        textrespuesta2 = (TextView)findViewById(R.id.textrespuesta2);


        String respuesta = getIntent().getStringExtra("Nombre"  );
        textrespuesta.setText( "Me llamo " + respuesta );

        String respuesta2 = getIntent().getStringExtra("Apellido" );
        textrespuesta2.setText( "Mi  apellido  es " + respuesta2 );







    }

    }
