/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sena.adso.gestionalquiler.views;

import com.sena.adso.gestionalquiler.dto.ReferenciasArrendatario;
import java.util.List;


public class ReferenciasView {
     public static void mostrarReferencias(List<ReferenciasArrendatario> referencias) {
        if (referencias.isEmpty()) {
            System.out.println("No hay referencias disponibles.");
        } else {
            System.out.println("\n--- Lista de Referencias ---");
            for (ReferenciasArrendatario referencia : referencias) {
                System.out.println(referencia.getNombre());
            }
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
