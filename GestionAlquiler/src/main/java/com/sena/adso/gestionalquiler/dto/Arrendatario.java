/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.adso.gestionalquiler.dto;

import java.util.List;


public class Arrendatario {
    
    private String nombre;
    private String identificacion;
    private String datosContacto;
    private List<ReferenciasArrendatario> referencias;

    public Arrendatario(String nombre, String identificacion, String datosContacto, List<ReferenciasArrendatario> referencias) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.datosContacto = datosContacto;
        this.referencias = referencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDatosContacto() {
        return datosContacto;
    }

    public void setDatosContacto(String datosContacto) {
        this.datosContacto = datosContacto;
    }

    public List<ReferenciasArrendatario> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<ReferenciasArrendatario> referencias) {
        this.referencias = referencias;
    }
    
    
}
