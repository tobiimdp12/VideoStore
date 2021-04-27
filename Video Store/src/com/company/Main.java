package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pelicula pelicula=new Pelicula("Accion","indiana joness","10/02/1988",
                20,"una peli epica",23,"G","AR");

        Pelicula pelicula_2=new Pelicula("Documental","resistencia","10/02/1398",
                20,"una peli epicas",12,"G","AR");

        Pelicula pelicula_3=new Pelicula("Comedia","indiana","10/02/1688",
                20,"una peli epicaaa",32,"G","AR");

        Pelicula pelicula_4=new Pelicula("Drama","boca","10/02/1928",
                20,"una peli epicaka",2,"PG-13","AR");

        Pelicula pelicula_5=new Pelicula("Horror","JE JE JE","10/02/1188",
                20,"un peliculom epico",21,"R","AR");

        Pelicula pelicula_6=new Pelicula("Documental","inflacion..¿algun dia finalizara?",
                "10/02/1988",20,"una peli epica",
                4,"UNRATED","AR");
        Pelicula pelicula_7=new Pelicula("Documental","Crisis en chacarita..¿algun dia finalizara?",
                "10/02/1988",20,"una peli epicasa",
                4,"UNRATED","AR");
        Pelicula pelicula_8=new Pelicula("Documental","River y Boca..¿algun dia finalizara?",
                "10/02/1988",20,"una peli epicarda",
                4,"UNRATED","AR");

        List<Pelicula> peliculas=new ArrayList<>(7);
        peliculas.add(pelicula);
        peliculas.add(pelicula_2);
        peliculas.add(pelicula_3);
        peliculas.add(pelicula_4);
        peliculas.add(pelicula_5);
        peliculas.add(pelicula_6);
        peliculas.add(pelicula_7);
        peliculas.add(pelicula_8);
        Cliente cliente_1=new Cliente("Tobias",223470593,"Mexico 222");
        Cliente cliente_2=new Cliente("Cris",223450694,"Mitre 2234");
        EncargadoVideoStore encargadoVideoStore=new EncargadoVideoStore
                ("juan",223456,"neco 12");
        List<Boleta> boletas=new ArrayList<>();
        Boleta boleta;
        Scanner salirIn=new Scanner(System.in);
        String salir;
        System.out.println("¿Que pelicula decide alquilar?");
        Scanner nombrePeli=new Scanner(System.in);

        cliente_1.solicitarPeli(pelicula_4,boletas);
        cliente_1.solicitarPeli(pelicula_4,boletas);
        cliente_1.solicitarPeli(pelicula_3,boletas);
        cliente_1.solicitarPeli(pelicula_3,boletas);
        cliente_1.solicitarPeli(pelicula_3,boletas);
        cliente_1.solicitarPeli(pelicula_3,boletas);
        cliente_1.solicitarPeli(pelicula_3,boletas);
        cliente_1.solicitarPeli(pelicula_2,boletas);
        cliente_1.solicitarPeli(pelicula_2,boletas);
        cliente_1.solicitarPeli(pelicula_2,boletas);
        cliente_1.solicitarPeli(pelicula_2,boletas);

        System.out.println(cliente_1.toString());
        System.out.println(cliente_2.toString());
        System.out.println("Mostrando alquileres vigentes: ");
        encargadoVideoStore.alquileresVigentes(cliente_1);
        System.out.println("\n fin alquileres vigentes \n");
        Calendar fechaAbuscar = Calendar.getInstance();
        fechaAbuscar.set(2021,fechaAbuscar.MONTH,5);
        System.out.println(fechaAbuscar);
       //encargadoVideoStore.alquileresDevueltosParaHoy(boletas,fechaAbuscar);
        System.out.println("ultimos 10 de un cliente ");
        encargadoVideoStore.ultimosDiezCliente(cliente_1);
        System.out.println("\n fin ultimos 10 \n ");
        System.out.println("Ordenando pelis segun la popularidad ");
        pelicula.ordenarPelisSegunPopu(peliculas);
        System.out.println("\n fin del proceso de ordenamiento \n ");
        System.out.println("Ordenando pelis segun la popularidad en un genero en especifico");
        pelicula.ordenarPelis(peliculas,"Documental");
        System.out.println("\n fin del proceso de ordenamiento \n ");
    }
}
