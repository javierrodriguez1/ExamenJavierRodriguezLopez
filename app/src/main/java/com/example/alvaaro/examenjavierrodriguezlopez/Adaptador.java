package com.example.alvaaro.examenjavierrodriguezlopez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alvaaro on 24/01/2018.
 */

public class Adaptador extends BaseAdapter {
    // CONTEXTO DE LA APLICACION
    Context contexto;
    // LIST DE PRODUCTOS
    List<Contacto> listaContactos;

    // CONSTRUCTOR
    public Adaptador(Context contexto, List<Contacto> listaContactos) {
        this.contexto = contexto;
        this.listaContactos = listaContactos;
    }

    @Override
    public int getCount() {
        return listaContactos.size();
    }

    @Override
    public Object getItem(int i) {
        return listaContactos.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View vista = view;
        LayoutInflater inflador = LayoutInflater.from(contexto);
        vista = inflador.inflate(R.layout.item, null);

        ImageView imageView = (ImageView) vista.findViewById(R.id.iv);
        TextView tvNombre = (TextView) vista.findViewById(R.id.tvNombre);
        TextView tvTelefono = (TextView) vista.findViewById(R.id.tvTelefono);

        imageView.setImageResource(listaContactos.get(i).getImagen());
        tvNombre.setText(listaContactos.get(i).getNombre().toString());
        tvTelefono.setText(listaContactos.get(i).getTelefono().toString());

        return vista;
    }
}
