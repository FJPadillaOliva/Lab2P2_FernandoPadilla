/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author Wendy
 */
public class Fotografias {
    private String dimension,resolucion;
    private boolean color;
    
    public Fotografias(){
        
    }

    public Fotografias(String dimension, String resolucion, boolean color) {
        this.dimension = dimension;
        this.resolucion = resolucion;
        this.color = color;
    }
    

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fotografias{" + "Dimensiones=" + dimension + ", Resolucion=" + resolucion + ", Color=" + color + '}';
    }
    
}
