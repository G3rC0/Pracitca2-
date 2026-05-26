/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio62;

/**
 *
 * @author estudiante
 */
public class NodoB {
    private Libro li;
    private NodoB sig;//link
    
    public NodoB(){
        sig=null;
    }

    public NodoB getSig() {
        return sig;
    }

    public void setSig(NodoB sig) {
        this.sig = sig;
    }

    public Libro getLi() {
        return li;
    }

    public void setLi(Libro li) {
        this.li = li;
    }
    
}
