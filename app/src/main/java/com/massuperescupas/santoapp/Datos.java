package com.massuperescupas.santoapp;

import java.io.Serializable;

public class Datos implements Serializable
{
    String NombreaActividad,txtDescriptivos,FotoActividad;

    public Datos(String nombreActividad, String FotoActividad, String txtDescriptivo)
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

    public String getFotoActividad()
    {
        return FotoActividad;
    };

    public void setFotoActividad(String fotoActividad)
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
