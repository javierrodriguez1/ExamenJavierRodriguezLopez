package com.example.alvaaro.examenjavierrodriguezlopez;

/**
 * Created by alvaaro on 24/01/2018.
 */

public class Contacto {

    //ATRIBUTOS
    private String nombre;
    private int imagen;
    private String telefono;

    //CONSTRUCTOR VACÍO
    public Contacto(){

    }

    //CONSTRUCTOR CON PARAMETROS
    public Contacto(String nombre,int imagen, String telefono){
        this.nombre=nombre;
        this.imagen=imagen;
        this.telefono=telefono;
    }

    //METODOS GET AND SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
