package com.company;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente extends Persona{

    public List<Pelicula> peliculasAlquiladas=new ArrayList<Pelicula>();

    public Cliente(String nombre,int telefono,String direccion)

    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.setDireccion(direccion);
    }

    public void solicitarPeli(Pelicula existencias,List<Boleta> boletas)
    {
        Calendar fechaRetiro = Calendar.getInstance();
        Calendar fechaDevolucion = Calendar.getInstance();
        EncargadoVideoStore en=new EncargadoVideoStore();

        if(existencias.getCantidadDePeliculas()>0)
        {
            if(en.chequearCliente(this)==false)//le paso esta clase
            {
                System.out.println("cargando cliente al sistema espere un momento...");
                en.cargarCliente(this);
            }

            System.out.println("El cliente " +this.nombre+" que vive en el domicilio "+this.getDireccion()
                    +" a alquilado la pelicula "+existencias.titulo);
            peliculasAlquiladas.add(existencias);
            existencias.setCantidadDePeliculas(existencias.getCantidadDePeliculas()-1);
            existencias.indicePopularidad++;
            fechaRetiro.set(fechaRetiro.YEAR,fechaRetiro.MONTH,fechaRetiro.DATE);
            fechaDevolucion.set(fechaRetiro.YEAR,fechaRetiro.MONTH,fechaRetiro.DATE+10);//SOLO LA PUEDEN ALQUILAR POR 10 DIAS

            boletas.add(en.hacerBoleta(fechaRetiro,fechaDevolucion,existencias));
        }else
        {
            System.out.println("lo siento cliente"+this.nombre+" no hay existencias de la pelicula "
                    +existencias.titulo+
                    " elija otra :(");
        }

    }

    public void devuelvoPeli(Pelicula peliAdevolver)
    {
        System.out.println("El cliente "+this.nombre+" devolvio la pelicula "+peliAdevolver.titulo);
        peliAdevolver.setCantidadDePeliculas(peliAdevolver.getCantidadDePeliculas()+1);
    }
    @Override
    public String toString() {
        return "Cliente "+this.nombre+" {" +
                //printea el toString de Pelicula
                "\n"+
                "peliculasAlquiladas=" + peliculasAlquiladas +
                "\n"+ ", nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }

    @Override
    public void saludar() {

    }
}
