/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import conexion.ConexionBD;
import conexion.IConexionBD;
import dao.CiudadesDAO;
import daoInterfaces.ICuidadesDAO;
import dto.CiudadesDTO;
import inegocio.ICuidadesNegocio;
import negocio.CiudadesNegocio;

/**
 *
 * @author Oley
 */
public class main {

    public static void main(String[] args) {
        IConexionBD conexionBD = new ConexionBD();
        CiudadesDTO ciudadesDTO = new CiudadesDTO(1, "Sinaloa");
        ICuidadesNegocio cuidadesNegocio = new CiudadesNegocio();
        cuidadesNegocio.guardar(ciudadesDTO);
    }

}
