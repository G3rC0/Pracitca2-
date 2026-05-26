package ejercicio64;
    
class NodoA {
    private Auto dato;
    private NodoA sig;

    public NodoA() {
        sig = null;
    }

    // Getters
    public Auto getDato() {
        return dato;
    }
    public NodoA getSig() {
        return sig;
    }

    // Setters
    public void setDato(Auto dato) {
        this.dato = dato;
    }
    public void setSig(NodoA sig) {
        this.sig = sig;
    }
}
