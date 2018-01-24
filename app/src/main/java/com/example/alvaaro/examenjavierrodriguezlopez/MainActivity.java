package com.example.alvaaro.examenjavierrodriguezlopez;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void anadir(View v){
        Intent paso = new Intent(getApplicationContext(), AnadirActivity.class);
        startActivity(paso);
    }

    public void listar(View v){
        Intent paso = new Intent(getApplicationContext(),ListarActivity.class);
        startActivity(paso);
    }

}
