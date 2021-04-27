package com.company;

import java.util.Calendar;

public class Boleta {
    private Calendar fechaDevolucion;
    public Calendar fechaRetiro;
    public Pelicula peliculaAlquilada;
    public Boleta(Calendar fechaDevolucion,Calendar fechaRetiro,Pelicula peliculaAlquilada)
    {
        this.fechaDevolucion=fechaDevolucion;
        this.fechaRetiro=fechaRetiro;
        this.peliculaAlquilada=peliculaAlquilada;
    }
    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }
}

