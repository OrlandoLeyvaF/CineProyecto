/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Presentacion.MenuAdministrador;
import dto.CiudadesDTO;
import inegocio.ICuidadesNegocio;
import negocio.CiudadesNegocio;

/**
 *
 * @author Oley
 */
public class main {
    public static void main(String[] args) {
        
    
    CiudadesDTO ciudadesDTO=new CiudadesDTO();
    
    ICuidadesNegocio cuidadesNegocio=new CiudadesNegocio();
    
    
    MenuAdministrador menuAdministrador=new MenuAdministrador(cuidadesNegocio);
    menuAdministrador.setVisible(true);
}
}