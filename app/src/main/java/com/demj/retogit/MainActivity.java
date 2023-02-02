package com.demj.retogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void buttonAcep(View view){
        Toast.makeText(MainActivity.this, "Bienvenido a este nuevo mundo ☺", Toast.LENGTH_SHORT).show();
        
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}