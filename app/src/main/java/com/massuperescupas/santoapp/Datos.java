package com.massuperescupas.santoapp;

import java.io.Serializable;

public class Datos implements Serializable
{
    String NombreaActividad,txtDescriptivos;
    int FotoActividad;

    public Datos(String nombreActividad, int FotoActividad,String txtDescriptivo)
    {
        this.NombreaActividad = nombreActividad;
        this.FotoActividad= FotoActividad;
        this.txtDescriptivos= txtDescriptivo;
    }

    public String getNombreaActividad()
    {
        return NombreaActividad;
    };

    public void setNombreaActividad(String NombreActividad)
    {
        this.NombreaActividad = NombreActividad;
    };

    public  int getFotoActividad()
    {
        return FotoActividad;
    };

    public void setFotoActividad(int fotoActividad)
    {
        this.FotoActividad = fotoActividad;
    };

    public String getTxtDescriptivo()
    {
        return txtDescriptivos;
    }

    public void setTxtDescriptivos(String txtDescriptivo)
    {
        this.txtDescriptivos = txtDescriptivo;
    }
}
