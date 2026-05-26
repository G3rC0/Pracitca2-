/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio72;

/**
 *
 * @author gerson
 */
public class Ejercicio72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LDobleP p=new LDobleP();
        p.adifinal("rezar");
        p.adifinal("oso");
        p.adifinal("radar");
        p.adifinal("panificacion");
        p.adifinal("ojo");
        p.mostrar();
        System.out.println("=================");
        //inciso a)
        palindromo(p);
        p.mostrar();
        System.out.println("=================");
        insertarImportante(p);
        p.mostrar();
        System.out.println("=================");
    }
    public static void palindromo(LDobleP a){
        NodoP r = a.getP(); // Puntero para recorrer la lista

    while (r != null) {
        NodoP sig = r.getSig();
        String palabra = r.getPalabra();
        if (esPalindromo(palabra)) {
            NodoP anterior = r.getAnt();
            if (anterior == null) {
                a.setP(sig);
                if (sig != null) {
                    sig.setAnt(null);                }
            } 
            
            else {
                anterior.setSig(sig);
                if (sig != null) {
                    sig.setAnt(anterior); 
                }
            }
        }
        r = sig;
    }
    }
    private static boolean esPalindromo(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return false;
        }
        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }
        return true;
    }
    public static void insertarImportante(LDobleP lista) {
        // Si la lista está vacía, no hay nada que hacer
        if (lista.getP() == null) {
            return;
        }

        NodoP actual = lista.getP();

        while (actual != null) {
            String palabra = actual.getPalabra();

            // Verificamos si la palabra tiene más de 8 letras
            if (palabra != null && palabra.length() > 8) {

                // 1. Creamos el nuevo nodo
                NodoP nuevoNodo = new NodoP();
                nuevoNodo.setPalabra("IMPORTANTE");
                // 2. Guardamos el nodo que originalmente iba después del actual
                NodoP siguienteOriginal = actual.getSig();

                // 3. Conectamos el NUEVO nodo a su entorno
                nuevoNodo.setSig(siguienteOriginal); // El siguiente del nuevo es el que estaba después
                nuevoNodo.setAnt(actual);            // El anterior del nuevo es el actual

                // 4. Conectamos el entorno al NUEVO nodo
                actual.setSig(nuevoNodo); // El actual ahora apunta al nuevo hacia adelante

                if (siguienteOriginal != null) {
                    // Si no estábamos al final de la lista, el nodo que seguía 
                    // ahora apunta hacia atrás al nuevo nodo
                    siguienteOriginal.setAnt(nuevoNodo);
                }

                // 5. ¡Paso CRÍTICO! 
                // Avanzamos 'actual' a 'siguienteOriginal' para saltarnos el nodo 
                // "IMPORTANTE" recién creado y evitar un bucle infinito.
                actual = siguienteOriginal; 

            } else {
                // Si la palabra tiene 8 letras o menos, avanzamos normalmente
                actual = actual.getSig();
            }
        }
    }
}
