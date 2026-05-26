/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio64;

/**
 *
 * @author gerson
 */
public class Ejercicio64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LSCircular A=new LSCircular();
        A.adifinal(new Auto("Gerson","subaru", 120.60));
        A.adifinal(new Auto("Klever","nissan", 90.45));
        A.adifinal(new Auto("Pepito","F1", 100.90));
        A.adifinal(new Auto("Juan","Audi", 90.45));
        A.adifinal(new Auto("Emilia","BMW", 110.75));   
        A.mostrar();
        System.out.println("======================");
        //inciso b
        verificarX(A, "Emilia");
        System.out.println("======================");
        //inciso c
        mayorVel(A);
        System.out.println("======================");
        //inciso d
        modeloX(A, "Subaru");
        A.mostrar();
    }
    
    public static void verificarX(LSCircular a, String x){
        NodoA r=a.getP();
        boolean sw=false;
        while(r.getSig()!=a.getP()){
            if(r.getDato().getNomConductor().equalsIgnoreCase(x)){
                sw=true;
            }
            r=r.getSig();
        }
        if(r.getDato().getNomConductor().equalsIgnoreCase(x)){
                sw=true;
        }
        
        if(sw)
            System.out.println("si esta compitiendo");
        else
            System.out.println("no esta compitiendo");
    }
    
    public static void mayorVel(LSCircular a){
        NodoA r=a.getP();
        double may=0;
        while(r.getSig()!=a.getP()){
            if(r.getDato().getVelocidadMaxima()>may)
                may=r.getDato().getVelocidadMaxima();
            r=r.getSig();
        }
        if(r.getDato().getVelocidadMaxima()>may)
            may=r.getDato().getVelocidadMaxima();
        NodoA r2=a.getP();
        while(r2.getSig()!=a.getP()){
            if(r2.getDato().getVelocidadMaxima()==may)
                r2.getDato().mostrar();
            r2=r2.getSig();
        }
        if(r2.getDato().getVelocidadMaxima()==may)
            r2.getDato().mostrar();
    }
    public static void modeloX(LSCircular a, String x){
        NodoA r=a.getP();
        NodoA ant=null;
        while(r.getSig()!=a.getP()){
            if(r.getDato().getModelo().equalsIgnoreCase(x)){
                if (ant == null) {
                    a.setP(r.getSig()); 
                    r = a.getP();
                } else {
                    ant.setSig(r.getSig());
                    r = r.getSig();
                }
            }else{
                ant = r;
                r = r.getSig();
            }
        }
        if(r.getDato().getModelo().equalsIgnoreCase(x)){
            if (ant == null) { 
                a.setP(r.getSig()); 
                r = a.getP();
            } else {
                ant.setSig(r.getSig());
                r = r.getSig();
            }
        }else{
            ant = r;
            r = r.getSig();
        }
    }
}
