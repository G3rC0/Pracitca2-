/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio62;

/**
 *
 * @author gerson
 */
public class Libro {
    private String titulo, autor;
    private int anioPublicacion, cantEjemplares;
    private double calificacion;

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public Libro(String ti, String au, int an, int ca, double cal){
        titulo=ti;
        autor=au;
        anioPublicacion=an;
        cantEjemplares=ca;
        calificacion=cal;
    }
    public void mostrar(){
        System.out.println("-"+titulo+"-"+autor+"-"+anioPublicacion+"-"+cantEjemplares+"-"+calificacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }
}
