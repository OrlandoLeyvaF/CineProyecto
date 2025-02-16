/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexion.IConexionBD;
import daoInterfaces.ICuidadesDAO;
import entidades.Ciudades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Oley
 */
public class CiudadesDAO implements ICuidadesDAO {

    private  IConexionBD conexionBD;

    public CiudadesDAO() {
    }

     public void configurarConexion(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Ciudades guardar(Ciudades ciudades) {
        String sql = "INSERT INTO ciudades(nombre) VALUES(?)";
        try (Connection conexion = conexionBD.crearConexion(); PreparedStatement prepared = conexion.prepareStatement(sql)) {
            prepared.setString(1, ciudades.getNombre());
            prepared.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ciudades;

    }

}
