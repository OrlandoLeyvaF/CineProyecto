/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import conexion.ConexionBD;
import conexion.IConexionBD;
import dao.CiudadesDAO;
import daoInterfaces.ICuidadesDAO;
import dto.CiudadesDTO;
import entidades.Ciudades;
import inegocio.ICuidadesNegocio;

/**
 *
 * @author Oley
 */
public class CiudadesNegocio implements ICuidadesNegocio {

    private final ICuidadesDAO cuidadesDAO;

    public CiudadesNegocio( ) {
        this.cuidadesDAO=new CiudadesDAO();
         IConexionBD conexionBD = new ConexionBD();  
        ((CiudadesDAO) cuidadesDAO).configurarConexion(conexionBD); 
    }

    @Override
    public CiudadesDTO guardar(CiudadesDTO ciudadesDTO) {
        Ciudades ciudades = convertirADominio(ciudadesDTO);
        Ciudades ciudades1 = this.cuidadesDAO.guardar(ciudades);
        return convertirCuidadDTO(ciudades);

    }

    private Ciudades convertirADominio(CiudadesDTO ciudadesDTO) {
        Ciudades ciudad = new Ciudades();
        ciudad.setNombre(ciudadesDTO.getNombre());
        ciudad.setEstaEliminado(ciudadesDTO.isEstaEliminado());
        return ciudad;
    }

    private CiudadesDTO convertirCuidadDTO(Ciudades cuidad) {
        CiudadesDTO cuidadDTO = new CiudadesDTO();
        cuidadDTO.setNombre(cuidad.getNombre());
        return cuidadDTO;
    }
}
