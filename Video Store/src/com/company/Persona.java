package com.company;

public abstract class Persona {
    public String nombre;
    public int telefono;
    private String direccion;

    public abstract void saludar();
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
