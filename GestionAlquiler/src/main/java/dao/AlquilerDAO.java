/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sena.adso.gestionalquiler.dto.Alquiler;
import config.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AlquilerDAO {
    private Connection conexion;
    private ConexionBD conexionBD;
    
    public AlquilerDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }
    
    public void crearAlquiler(Alquiler alquiler) {
        String sql = "INSERT INTO alquileres (propiedad_id, arrendatario_id, fecha_inicio, fecha_fin, estado, monto_pagado) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setObject(1, alquiler.getPropiedad());
            statement.setObject(2, alquiler.getArrendatario());
            statement.setDate(3, alquiler.getFechaInicio());
            statement.setDate(4, alquiler.getFechaFin());
            statement.setString(5, alquiler.getEstado());
            statement.setDouble(6, alquiler.getMontoPagado());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}
