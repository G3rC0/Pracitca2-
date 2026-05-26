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
public class LSimpleB {
    private NodoB p;

    LSimpleB () {
        p = null;
    }

    // Getters y Setters
    public NodoB getP() {
        return p;
    }
    public void setP(NodoB p) {
        this.p = p;
    }

    // Verificar si está vacía
    public boolean esVacia() {
        return p == null;
    }

    // Agregar al principio
    public void adiprincipio(Libro nl) {
        NodoB nue = new NodoB();
        nue.setLi(nl);
        nue.setSig(getP());
        setP(nue);
    }

    // Agregar al final
    public void adifinal(Libro nl) {
        NodoB nue = new NodoB();
        nue.setLi(nl);
        if (esVacia()) {
            setP(nue);
        } else {
            NodoB r = getP();
            while (r.getSig() != null)
                r = r.getSig();
            r.setSig(nue);
        }
    }

    // Número de nodos
    public int nroNodos() {
        int c = 0;
        NodoB r = getP();
        while (r != null) {
            c++;
            r = r.getSig();
        }
        return c;
    }

    // Eliminar primero
    public NodoB eliPrincipio() {
        NodoB r = getP();
        setP(r.getSig());
        r.setSig(null);
        return r;
    }

    // Eliminar último
    public NodoB eliFinal() {
        NodoB r = getP();
        NodoB q = getP();
        while (r.getSig() != null) {
            q = r;
            r = r.getSig();
        }
        q.setSig(null);
        return r;
    }

    // Mostrar
    public void mostrar() {
        NodoB r = getP();
        while (r != null) {
            r.getLi().mostrar();
            r = r.getSig();
        }
        System.out.println();
    }
    
}
