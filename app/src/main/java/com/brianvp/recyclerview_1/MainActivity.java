package com.brianvp.recyclerview_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // con Strings ArrayList<String> listDato;
    ArrayList<Personaje> listaDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = (RecyclerView) findViewById(R.id.recyclerId);

        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        //Presentar en un grid (this, numero de columnas)
        //recycler.setLayoutManager(new GridLayoutManager(this,2));

        /*listDato = new ArrayList<>();
        for (int i=0; i<=50; i++){
            listDato.add("Dato : "+i+" ");
        }
        AdapterDatos adapter = new AdapterDatos(listDato);
        recycler.setAdapter(adapter);*/
        listaDatos = new ArrayList<Personaje>();
        llenarPersonajes();
        AdapterDatos personajes = new AdapterDatos(listaDatos);
        recycler.setAdapter(personajes);
    }

    private void llenarPersonajes() {
        listaDatos.add(new Personaje("Bart","Bartholomew \"Bart\" Jojo Simpson (en Hispanoamérica Bartolomeo Jay Simpson) es un personaje ficticio de la serie animada Los Simpson",R.drawable.bart));
        listaDatos.add(new Personaje("Mr. Burns","Es un personaje malvado y recurrente. Él es el propietario de la Planta de energía nuclear de Springfield y es el jefe de Homer Simpson (tanto en su vertiente más hostil como en la más conciliadora).",R.drawable.burns));
        listaDatos.add(new Personaje("Flanders","Ned Flanders vive en la casa de al lado de la familia Simpson, por lo tanto es su vecino. Normalmente es odiado por Homer Simpson, que lo define como \"peor que Monstruo de Frankenstein y el Dr. No\".",R.drawable.flanders));
        listaDatos.add(new Personaje("Homero","Básicamente, Homer es una sátira de los norteamericanos promedio, en palabras de su mismo creador, Matt Groening. Las bromas indirectas se pueden encontrar en su personalidad, su actitud, su filosofía, su idiosincracia, etc",R.drawable.homero));
        listaDatos.add(new Personaje("Krusti","Es el payaso que conduce el programa de televisión favorito de los niños de Springfield.",R.drawable.krusti));
        listaDatos.add(new Personaje("Lisa","Es la hija mediana de Homer y Marge Simpson, y la hermana de Bart y Maggie. Goza de notable protagonismo y complejidad en la serie aunque es uno de los personajes",R.drawable.lisa));
        listaDatos.add(new Personaje("Magie","Debido a que aún no puede hablar, Maggie es la que menos protagonismo e importancia tiene en la familia Simpson",R.drawable.magie));
        listaDatos.add(new Personaje("Marge","Marjorie \"Marge\" Simpson (apellido de soltera Bouvier), es la Esposa de Homer Simpson y madre de tres hijos: Bart, Lisa y Maggie. Ella, junto al resto de su familia, conforman el elenco de personajes protagonistas de Los Simpson",R.drawable.marge));
        listaDatos.add(new Personaje("Milhouse","Es el mejor amigo de Bart Simpson. Tiene aspecto y comportamientos de nerd, pero dista mucho de serlo. De hecho, en una ocasión señaló que no era un nerd \"porque los nerds son listos\".",R.drawable.milhouse));
    }
}
