package ejercicio64;

class LSCircular {
    private NodoA p;

    public LSCircular() {
        p = null;
    }

    // Getters y Setters
    public NodoA getP() {
        return p;
    }
    public void setP(NodoA p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    // Número de nodos
    public int nroNodos() {
        if (esVacia()) return 0;
        int c = 1;
        NodoA r = getP();
        while (r.getSig() != getP()) {
            r = r.getSig();
            c++;
        }
        return c;
    }

    // Agregar al principio
    public void adiprincipio(Auto d) {
        NodoA nue = new NodoA();
        nue.setDato(d);
        if (esVacia()) {
            setP(nue);
            nue.setSig(getP());       // apunta a sí mismo
        } else {
            // recorre hasta el último nodo
            NodoA r = getP();
            while (r.getSig() != getP())
                r = r.getSig();
            nue.setSig(getP());       // nue apunta al actual primero
            setP(nue);                // nue es el nuevo primero
            r.setSig(getP());         // el último apunta al nuevo primero
        }
    }

    // Agregar al final
    public void adifinal(Auto d) {
        NodoA nue = new NodoA();
        nue.setDato(d);
        if (esVacia()) {
            setP(nue);
            nue.setSig(getP());       // apunta a sí mismo
        } else {
            NodoA r = getP();
            while (r.getSig() != getP())
                r = r.getSig();
            r.setSig(nue);            // el último apunta al nuevo
            nue.setSig(getP());       // el nuevo apunta al primero
        }
    }

    // Eliminar primero
    public NodoA eliPrincipio() {
        NodoA x = getP();
        if (x.getSig() == getP()) {
            // solo hay un nodo
            setP(null);
        } else {
            NodoA r = getP();
            while (r.getSig() != getP())
                r = r.getSig();
            setP(getP().getSig());    // el segundo pasa a ser primero
            r.setSig(getP());         // el último apunta al nuevo primero
        }
        x.setSig(null);
        return x;
    }

    // Eliminar último
    public NodoA eliFinal() {
        NodoA x = getP();
        if (x.getSig() == getP()) {
            // solo hay un nodo
            setP(null);
        } else {
            NodoA r = getP();
            while (r.getSig().getSig() != getP())
                r = r.getSig();       // r queda en el penúltimo
            x = r.getSig();           // x es el último
            r.setSig(getP());         // el penúltimo apunta al primero
        }
        x.setSig(null);
        return x;
    }

    // Mostrar
    public void mostrar() {
        if (esVacia()) return;
        NodoA r = getP();
        while (r.getSig() != getP()) {
            r.getDato().mostrar();
            r = r.getSig();
        }
        r.getDato().mostrar(); // último nodo
    }
}
