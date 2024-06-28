/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBD {
    public Connection getConexion(){
        String url = "jdbc:mysql://localhost:3306/gestion_inmuebles";
        String usuario = "root";
        String clave = "esme2015";
        Connection conexion = null;
        try {
            /*Eliminar -> Connection*/
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión exitosa a la base de datos.");
            //conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        // Devuelve el objeto conexion
        return conexion;
    }
    public void closeConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Se cerro la conexion de forma exitosa");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion base de datos: " + e.getMessage());
            }
        }
    }
}
