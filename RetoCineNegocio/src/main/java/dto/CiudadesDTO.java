/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Oley
 */
public class CiudadesDTO {
       private int id;
    private String Nombre;
    private boolean estaEliminado;

    public CiudadesDTO() {
    }

    public CiudadesDTO(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }

    public CiudadesDTO(int id, String Nombre, boolean estaEliminado) {
        this.id = id;
        this.Nombre = Nombre;
        this.estaEliminado = estaEliminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isEstaEliminado() {
        return estaEliminado;
    }

    public void setEstaEliminado(boolean estaEliminado) {
        this.estaEliminado = estaEliminado;
    }
    
    
    
    
    
}
