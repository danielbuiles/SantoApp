package com.massuperescupas.santoapp;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ListaActividades extends RecyclerView.Adapter<ListaActividades.viewHolder>
{
    ArrayList<Datos> ListaDatos;

    public ListaActividades(ArrayList<Datos> ListaDatos)
    {
        this.ListaDatos=ListaDatos;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View vistadellyItemtouriscard = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.touristcard,parent,false);

        return new viewHolder(vistadellyItemtouriscard);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position)
    {
        holder.actualizarDatos(ListaDatos.get(position));
    }

    @Override
    public int getItemCount()
    {
        return ListaDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder
    {
        TextView NombreActividad;
        ImageView FotoActividad;

        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            NombreActividad=itemView.findViewById(R.id.NameActivity);
            FotoActividad=itemView.findViewById(R.id.FotoActivity);
        }

        public void actualizarDatos(Datos datos)
        {
            NombreActividad.setText(datos.getNombreaActividad());
            Picasso.with(itemView.getContext())
            .load(datos.getFotoActividad())
            .into(FotoActividad);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {
                    Intent intent = new Intent(itemView.getContext(),HomeActivity.class);
                    intent.putExtra("datosPueblo",datos);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
