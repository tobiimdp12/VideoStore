package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EncargadoVideoStore extends Persona{

   public List<Cliente> listadoDeClientes=new ArrayList<Cliente>();
    public EncargadoVideoStore(String nombre,int telefono,String direccion)
    {
        this.nombre=nombre;
        this.telefono=telefono;
        this.setDireccion(direccion);
    }
    public EncargadoVideoStore()
    {

    }
    public Boleta hacerBoleta(Calendar fechaRetiro,Calendar fechaDevolucion,Pelicula peliculaAlquilada)
    {
        Boleta boleta=new Boleta(fechaRetiro,fechaDevolucion,peliculaAlquilada);

        return boleta;
    }
    public boolean chequearCliente(Cliente nuevoCliente)
    {

      if(listadoDeClientes.contains(nuevoCliente))//compruebo si el cliente ya esta cargado en el sistemma
      {
          return true;
      }else
      {
          return false;
      }
    }
    public void cargarCliente(Cliente nuevoCliente)
    {
        listadoDeClientes.add(nuevoCliente);
    }
    public void anotarDevolucion(Boleta boleta ,Cliente cliente)
    {
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.set(fechaActual.YEAR,fechaActual.MONTH,fechaActual.DATE);

        if(fechaActual==boleta.getFechaDevolucion())//si entrego la pelicula en la fecha establecida
        {
            cliente.peliculasAlquiladas.remove(boleta.peliculaAlquilada);
        }
    }

    public void alquileresVigentes(Cliente cliente)
    {
        Cliente clienteNuevo;
        for (Object c:cliente.peliculasAlquiladas) {

            System.out.println(c);
        }
    }

    public void alquileresDevueltosParaHoy(List<Boleta> boletas,Calendar fechaAbuscar)
    {
        for (Boleta i:boletas) {
            if(i.getFechaDevolucion()==fechaAbuscar)
            {
                System.out.println(i);
            }
        }
    }

    public void ultimosDiezCliente(Cliente cliente)
    {
        int i=cliente.peliculasAlquiladas.size()-1;//le asigno el ultimo valor a i
        int solo10=0;
        System.out.println("cantidad de peliculas alquiladas" + cliente.peliculasAlquiladas.size());
        if(cliente.peliculasAlquiladas.size()>=10) //si hay mas de 10 elementos en la lista
        {

            while (solo10<=10)
            {

                System.out.println(cliente.peliculasAlquiladas.get(i));
                i--;//voy para atras
                solo10++;
            }
        }else
        {

            i=cliente.peliculasAlquiladas.size()-1;
            while (i>=0)
            {

                System.out.println(cliente.peliculasAlquiladas.get(i));
                i--;//voy para atras
            }
        }
    }

    public void mostrarInfoDetallada(Pelicula pelicula)
    {

    }

    @Override
    public void saludar() {

    }


}
