package com.example.alvaaro.examenjavierrodriguezlopez;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alvaaro on 24/01/2018.
 */

public class ListarActivity extends AppCompatActivity{

    ListView listView;
    public static ArrayList<Contacto> contactos1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        listView = (ListView)findViewById(R.id.listViewContactos);
        //RECOJO LOS DATOS DEL ARRAYLIST DE AÑADIR CONTACTOS

        contactos1 = AnadirActivity.getContactos();
        contactos1.add(new Contacto("Javier",0,"672234234"));
        contactos1.add(new Contacto("Javier1",0,"654323432"));

        for(int i=0;i<AnadirActivity.contactos.size();i++){
            Adaptador miAdaptador = new Adaptador(getApplicationContext(), AnadirActivity.contactos);
            listView.setAdapter(miAdaptador);
        }
    }

}
