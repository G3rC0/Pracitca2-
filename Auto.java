/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio64;

/**
 *
 * @author gerson
 */
public class Auto {
    private String nomConductor, modelo;
    private double velocidadMaxima;
    
    public Auto(String no,String mo, double ve){
        nomConductor=no;
        modelo=mo;
        velocidadMaxima=ve;
    }
    public void mostrar(){
        System.out.println("-"+nomConductor+" "+modelo+" "+velocidadMaxima);
    }

    public String getNomConductor() {
        return nomConductor;
    }

    public void setNomConductor(String nomConductor) {
        this.nomConductor = nomConductor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
