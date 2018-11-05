package com.brianvp.recyclerview_1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IBVP on 05/11/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {
    ArrayList<Personaje> listDato;

    public AdapterDatos(ArrayList<Personaje> listDato) {
        this.listDato = listDato;
    }

    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        //enlaza el adaptador con itemview
        //Inflamos view y lo retornamos a
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrv,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(AdapterDatos.ViewHolderDatos holder, int position) {
        //comunicacion adaptador y viewholder
       //Solo con strings
        // holder.asignarDatos(listDato.get(position));
        //Con personajes
        holder.nombre.setText(listDato.get(position).getNombre());
        holder.des.setText(listDato.get(position).getDesc());
        holder.foto.setImageResource(listDato.get(position).getFoto());

    }

    @Override
    public int getItemCount() {
        return listDato.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView nombre, des;
        ImageView foto;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nPersonaje);
            des = itemView.findViewById(R.id.dPersonaje);
            foto = itemView.findViewById(R.id.imgPersonaje);
        }
        //Ejercicio solo String
        /*public void asignarDatos(String s) {
            dato.setText(s);

        }*/
    }
}
