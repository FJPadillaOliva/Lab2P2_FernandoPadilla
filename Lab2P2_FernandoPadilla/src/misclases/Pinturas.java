/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author Wendy
 */
public class Pinturas {
    private String nombre,autor,fechaP,fechaA;
    private boolean exp;
    
    public Pinturas(){
        
    }

    public Pinturas(String nombre, String autor, String fechaP, String fechaA, boolean exp) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechaP = fechaP;
        this.fechaA = fechaA;
        this.exp = exp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaP() {
        return fechaP;
    }

    public void setFechaP(String fechaP) {
        this.fechaP = fechaP;
    }

    public String getFechaA() {
        return fechaA;
    }

    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }

    public boolean isExp() {
        return exp;
    }

    public void setExp(boolean exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Pinturas{" + "Nombre de la obra=" + nombre + ", Autor=" + autor + ", Fecha de presentacion=" + fechaP + ", Fecha de adquisicion=" + fechaA + ", Exposicion=" + exp + '}';
    }
    
}
