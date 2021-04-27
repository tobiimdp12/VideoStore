package com.company;

import java.util.*;

public class Pelicula implements Comparable<Pelicula>{


    public String genero;
    public String titulo;
    public String fechaLazamiento;
    public double duracion;
    public String descripcion;
    private int cantidadDePeliculas;
    public String clasificacionDeAud;
    public String siglaPaisOrigen;
    public int indicePopularidad;


    public Pelicula(String genero, String titulo, String fechaLazamiento, double duracion,
                    String descripcion, int cantidadDePeliculas,
                    String clasificacionDeAud, String siglaPaisOrigen) {
        this.genero = genero;
        this.titulo = titulo;
        this.fechaLazamiento = fechaLazamiento;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.setCantidadDePeliculas(cantidadDePeliculas);
        this.clasificacionDeAud = clasificacionDeAud;
        this.siglaPaisOrigen = siglaPaisOrigen;

    }
    @Override
    public String toString() {
        return "\n"+"Pelicula{" +
                "genero='" + genero  +
                ", titulo='" + titulo  +
                ", Popularidad='" + this.indicePopularidad  +
                '}'+ "\n";
    }

    public void setCantidadDePeliculas(int cantidadDePeliculas) {
        this.cantidadDePeliculas = cantidadDePeliculas;
    }

    public int getCantidadDePeliculas() {
       return this.cantidadDePeliculas;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void ordenarPelisSegunPopu(List<Pelicula> peliculas)
    {
        Pelicula pelicula;


        Collections.sort(peliculas);

        for (Pelicula peliculaIndice:peliculas) {
            System.out.println(peliculaIndice);
        }

    }
    public void ordenarPelis(List<Pelicula> peliculas, String generoAfiltrar)
    {
        List<Pelicula> peliculasDeUnGenero=new ArrayList<Pelicula>();
        Pelicula pelicula;

        for (Object i:peliculas) {
            pelicula=(Pelicula) i;
            if(pelicula.genero==generoAfiltrar)
            {
                peliculasDeUnGenero.add(pelicula);
            }
        }

        Collections.sort(peliculasDeUnGenero);

        for (Pelicula peliculaIndice:peliculasDeUnGenero) {
            System.out.println(peliculaIndice);
        }

    }

    @Override
    public int compareTo(Pelicula o) {
        if(o.indicePopularidad<this.indicePopularidad)
        {
            return -1;
        }else if(o.indicePopularidad<this.indicePopularidad)
        {
            return 0;
        }else
        {
            return 1;
        }

    }

}
