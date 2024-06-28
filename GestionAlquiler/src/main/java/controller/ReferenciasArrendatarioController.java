/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.sena.adso.gestionalquiler.dto.ReferenciasArrendatario;
import com.sena.adso.gestionalquiler.views.ReferenciasView;
import dao.ReferenciasArrendatarioDAO;
import java.util.List;
import java.util.Scanner;


public class ReferenciasArrendatarioController {
    private ReferenciasArrendatarioDAO referenciasArrendatarioDAO;
    private Scanner sc;

    public ReferenciasArrendatarioController() {
        
        referenciasArrendatarioDAO = new ReferenciasArrendatarioDAO();
        sc = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Referencias ---");
            System.out.println("1. Crear referencia arrendatario");
            System.out.println("2. Leer referencias");
            System.out.println("3. Actualizar referencias");
            System.out.println("4. Eliminar referencia");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    crearReferencia();
                    break;
                case 2:
                    leerReferencia();
                    break;
                case 3:
                    actualizarReferencia();
                    break;
                case 4:
                    eliminarReferencia();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
    }
    
     public void crearReferencia() {
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el identificacion: ");
        String identificacion = sc.nextLine();
        System.out.print("Ingrese la telefono: ");
        String telefono = sc.nextLine();
        ReferenciasArrendatario referenciasArrendatario = new ReferenciasArrendatario(nombre, identificacion, telefono);
        referenciasArrendatarioDAO.crearRefArrendatario(referenciasArrendatario);
        ReferenciasView.mostrarMensaje("Categoría creada exitosamente.");
    }
    
     private void leerReferencia() {
        List<ReferenciasArrendatario> referencias = referenciasArrendatarioDAO.leerReferencia();
        ReferenciasView.mostrarReferencias(referencias);
    } 
    
      private void actualizarReferencia() {
        leerReferencia();
        System.out.print("\nIngrese el ID de la categoría que desea actualizar: ");
        int id = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Ingrese el nuevo nombre de la referencia: ");
        String nuevoNombre = sc.nextLine();
        System.out.print("Ingrese el nueva identificacion de la referencia: ");
        String nuevaIdentificacion = sc.nextLine();
        System.out.print("Ingrese el nuevo telefono de la referencia: ");
        String nuevoTelefono = sc.nextLine();
        ReferenciasArrendatario referencia = new ReferenciasArrendatario(nuevoNombre, nuevaIdentificacion, nuevoTelefono);
        referenciasArrendatarioDAO.actualizarReferencia(referencia);
        ReferenciasView.mostrarMensaje("Referencioa actualizada exitosamente.");
    }
      
    private void eliminarReferencia() {
        leerReferencia();
        System.out.print("\nIngrese el ID de la referencia que desea eliminar: ");
        int id = sc.nextInt();
        referenciasArrendatarioDAO.eliminarReferencia(id);
        ReferenciasView.mostrarMensaje("Referencia eliminada exitosamente.");
    }
    
}
