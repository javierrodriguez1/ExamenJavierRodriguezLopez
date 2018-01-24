package com.example.alvaaro.examenjavierrodriguezlopez;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by alvaaro on 24/01/2018.
 */

public class AnadirActivity extends AppCompatActivity{

    EditText etNombre, etTelefono;
    public static ArrayList<Contacto> contactos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir);

        etNombre = (EditText)findViewById(R.id.etNombre);
        etTelefono = (EditText)findViewById(R.id.etTelefono);
    }

    public void guardar(){
        Contacto c = new Contacto(etNombre.toString(), 0, etTelefono.toString());
        contactos.add(c);
        Toast.makeText(this, "Contacto agregado", Toast.LENGTH_LONG).show();
    }

    public static ArrayList getContactos(){
        return contactos;
    }
}
