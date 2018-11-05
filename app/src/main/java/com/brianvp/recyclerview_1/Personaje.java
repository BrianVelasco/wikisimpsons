package com.brianvp.recyclerview_1;

/**
 * Created by IBVP on 05/11/2018.
 */

public class Personaje {
    private String nombre;
    private String desc;
    private int foto;

    public Personaje(){

    }

    public Personaje(String nombre, String desc, int foto) {
        this.nombre = nombre;
        this.desc = desc;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
