package com.massuperescupas.santoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity
{
    Datos datos;
    ImageView img;
    TextView txtTitle,txtDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        img =findViewById(R.id.imgActiviadPueblo);
        txtTitle=findViewById(R.id.txtActividadPueblo);
        txtDescripcion=findViewById(R.id.txtDescripcion);

        datos=(Datos) getIntent().getSerializableExtra("datosPueblo");

        img.setImageResource(datos.getFotoActividad());
        txtTitle.setText(datos.getNombreaActividad());
        txtDescripcion.setText(datos.getTxtDescriptivo());
    }
}