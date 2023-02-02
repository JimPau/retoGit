package com.demj.retogit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ingreso, ingreso2 ;
    Button enviar_datos; //no me sirve


    @Override
    protected void onCreate(Bundle savedInstanceState) { // aparezca en la vista
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ingreso =findViewById(R.id.texto);
        ingreso2 =findViewById(R.id.texto2);


        //Método para el boton enviar

         // boton para enviar datos a otro mainActivity
        enviar_datos=(Button)findViewById(R.id.enviar_datos); // no me sirve

    }

    public void agregar (View v){
        if (validar()){
            Toast.makeText(this, "Ingresó sus datos correctamente", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(MainActivity.this, DatosActivity.class);
            i.putExtra("Nombre",ingreso.getText().toString());
            i.putExtra("Apellido",ingreso2.getText().toString());
            startActivity(i);


        }

    }

     // validar campos a ingresar y que no quede espacio en blanco
    public boolean validar(){
        boolean retorno = true;

        String c1=ingreso.getText().toString();
        String c2=ingreso2.getText().toString();
        if (c1.isEmpty()){
            ingreso.setError("Debes ingresar su nombre");
            retorno = false;
        }
        if (c2.isEmpty()){
            ingreso2.setError("Debes ingresar su apellido");
            retorno = false;
        }

        return retorno;

    }
}