/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author Wendy
 */
public class Esculturas {
    private String nombre,material,departamento;
    private int año;
    
    public Esculturas(){
        
    }

    public Esculturas(String nombre, String material, int año, String departamento) {
        this.nombre = nombre;
        this.material = material;
        this.año = año;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Esculturas{" + "Escultor=" + nombre + ", Material=" + material + ", Departamento=" + departamento + ", Año =" + año + '}';
    }
    
}
