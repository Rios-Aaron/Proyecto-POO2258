package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Volcan {
    private int ID;
    private int CantidaddeErupciones;
    private String Nombre;
    private int Periodicidad;
    private String Clasificacion;
    private String Ubicacion;
    private String url;


    public Volcan() {
    }


    public Volcan(int ID, String Nombre, int CantidaddeErupciones, String Clasificacion, int Periodicidad, String Ubicacion, String url ) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.CantidaddeErupciones = CantidaddeErupciones;
        this.Clasificacion = Clasificacion;
        this.Periodicidad = Periodicidad;
        this.Ubicacion = Ubicacion;
        this.url = url;

    }

    public int getCantidaddeErupciones() {
        return CantidaddeErupciones;
    }

    public void setCantidaddeErupciones(int CantidaddeErupciones) {
        this.CantidaddeErupciones = CantidaddeErupciones;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPeriodicidad() {
        return Periodicidad;
    }

    public void setPeriodicidad(int Periodicidad) {
        this.Periodicidad = Periodicidad;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Volcan{" +
                "ID=" + ID +
                ", CantidaddeErupciones=" + CantidaddeErupciones +
                ", Nombre='" + Nombre + '\'' +
                ", Periodicidad=" + Periodicidad +
                ", Clasificacion='" + Clasificacion + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException {
        URL urlImagen = new URL(this.url);
        return new ImageIcon(urlImagen);
    }
}