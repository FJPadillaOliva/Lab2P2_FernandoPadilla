/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misclases;

/**
 *
 * @author Wendy
 */
public class Escritos {
 
        private int totalp;
    private String genero, autor,epoca;
    
    public Escritos(){
        
    }

    public Escritos(int totalp, String epoca, String genero, String autor) {
        this.totalp = totalp;
        this.epoca = epoca;
        this.genero = genero;
        this.autor = autor;
    }

    public int getTotalp() {
        return totalp;
    }

    public String getEpoca() {
        return epoca;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setTotalp(int totalp) {
        this.totalp = totalp;
    }

    public void setEpoca(String epoca) {
        this.epoca = epoca;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Escritos{" + "Total de palabras=" + totalp + ", Genero=" + genero + ", Autor=" + autor + ", Epoca=" + epoca + '}';
    }
    
}
