/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import conexion.ConexionBD;
import conexion.IConexionBD;
import dao.CiudadesDAO;
import daoInterfaces.ICuidadesDAO;
import entidades.Ciudades;

/**
 *
 * @author Oley
 */
public class main {
    public static void main(String[] args) {
        IConexionBD conexionBD=new ConexionBD();
        Ciudades ciudades=new Ciudades(1, "Obregon");
        CiudadesDAO cuidadesDAO= new CiudadesDAO();
        cuidadesDAO.guardar(ciudades);

    }
}
