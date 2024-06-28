/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.adso.gestionalquiler.dto;


public class Propiedad {
    private int id;
    private String direccion;
    private String tipo;
    private double tamaño;
    private int numeroHabitaciones;
    private double precioAlquiler;

    public Propiedad(int id, String direccion, String tipo, double tamaño, int numeroHabitaciones, double precioAlquiler) {
        this.id = id;
        this.direccion = direccion;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precioAlquiler = precioAlquiler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }
    
    
}
