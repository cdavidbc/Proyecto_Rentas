/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sena.adso.gestionalquiler.dto.Alquiler;
import com.sena.adso.gestionalquiler.dto.Propiedad;
import dao.AlquilerDAO;
import java.util.Scanner;


public class AlquilerController {
    private AlquilerDAO alquilerDAO;
    private Scanner sc;

    public AlquilerController() {
        alquilerDAO = new AlquilerDAO();
        sc = new Scanner(System.in);
    }
    
    public void mostrarMenu(){
        int opcion;
        do{
            System.out.println("\n--Menú Alquiler --");
            System.out.println("1. Agregar Alquiler");
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion){
                case 1: 
                    crearAlquiler();
                    break;
            }
        }while(opcion != 0);
    }
    
    private void crearAlquiler(){
        System.out.println("Ingrese la propiedad: ");
        int id_propiedad = sc.nextInt();
        
        System.out.println("Ingrese el arrendatario: ");
        int id_arrendatario = sc.nextInt();
        
        System.out.println("Ingrese la fecha de inicio: ");
        String fechaInicio = sc.nextLine();
        System.out.println("Ingrese la fecha fin: ");
        String fechaFin = sc.nextLine();
        System.out.println("Ingrese el estado: ");
        String estado = sc.nextLine();
        System.out.println("Ingrese canon de arrendamiento: ");
        Double montoPagado = sc.nextDouble();
        
       
    }
    
}
