package ejercicio72;
    
class NodoP {
    private String palabra;
    private NodoP ant;
    private NodoP sig;

    public NodoP() {
        ant = null;
        sig = null;
    }

    // Getters
    public NodoP getAnt() {
        return ant;
    }
    public NodoP getSig() {
        return sig;
    }

    public String getPalabra() {
        return palabra;
    }

    // Setters
    public void setAnt(NodoP ant) {
        this.ant = ant;
    }
    public void setSig(NodoP sig) {
        this.sig = sig;
    }    
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
