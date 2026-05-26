/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio72;

/**
 *
 * @author estudiante
 */
public class LDobleP {
    private NodoP p;
 
    public LDobleP() {
        p = null;
    }
    public NodoP getP() {
        return p;
    }
    public void setP(NodoP p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public int nroNodos() {
        int c = 0;
        NodoP r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    public void adiprincipio(String p) {
        NodoP nue = new NodoP();
        nue.setPalabra(p);
        if (esVacia()) {
            setP(nue);
        } else {
            nue.setSig(getP());   
            getP().setAnt(nue);   
            setP(nue); 
        }
    }
 
    public void adifinal(String p) {
        NodoP nue = new NodoP();
        nue.setPalabra(p);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoP r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            nue.setAnt(r);    
            r.setSig(nue);    
        }
    }
 
    public NodoP eliPrincipio() {
        NodoP r = getP();
        setP(r.getSig());
        if (getP() != null)
            getP().setAnt(null);  
        r.setSig(null);
        return r;
    }
 
    public NodoP eliFinal() {
        NodoP r = getP();
        if (r.getSig() == null) {
            // Solo hay un nodo
            setP(null);
            return r;
        }
        while (r.getSig() != null)
            r = r.getSig();
        NodoP q = r.getAnt();
        q.setSig(null);   
        r.setAnt(null);
        return r;
    }
 
    public void mostrar() {
        NodoP r = getP();
        while (r != null) {
            System.out.println(r.getPalabra());  
            r = r.getSig();
        }
    }
 
    public void mostrarInverso() {
        NodoP r = getP();
        while (r.getSig() != null)
            r = r.getSig();
        while (r != null) {
            System.out.println(r.getPalabra());  
            r = r.getAnt();
        }
    }
    
}
