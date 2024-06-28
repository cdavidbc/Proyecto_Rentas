/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.sena.adso.gestionalquiler.dto.ReferenciasArrendatario;
import config.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReferenciasArrendatarioDAO {
    private Connection conexion;
    private ConexionBD conexionBD;

    public ReferenciasArrendatarioDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }
    
    public void crearRefArrendatario(ReferenciasArrendatario referenciasArrendatario) {
        String sql = "INSERT INTO referencias (nombre, identificacion, telefono) VALUES (?,?,?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, referenciasArrendatario.getNombre());           
            statement.setString(2, referenciasArrendatario.getIdentificacion());
            statement.setString(3, referenciasArrendatario.getTelefono());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    
     public List<ReferenciasArrendatario> leerReferencia() {
        List<ReferenciasArrendatario> referencias = new ArrayList<>();
        String sql = "SELECT * FROM referencias";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String identificacion = resultSet.getString("identificacion");
                String telefono = resultSet.getString("telefono");
                ReferenciasArrendatario referencia = new ReferenciasArrendatario(nombre, identificacion, telefono);
                referencias.add(referencia);
            }
        } catch (SQLException e) {
                System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return referencias;
    }
    
    public void actualizarReferencia(ReferenciasArrendatario referencia) {
        String sql = "UPDATE referencias SET nombre = ?, identificacion = ?, telefono = ? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, referencia.getNombre());
            statement.setString(2, referencia.getIdentificacion());
            statement.setString(3, referencia.getTelefono());
            statement.executeUpdate();
        } catch (SQLException e) {
                System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }
    
    public void eliminarReferencia(int id) {
        String sql = "DELETE FROM referencias WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
                System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }
    
    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
    }
}
