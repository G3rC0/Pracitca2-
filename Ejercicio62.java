/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio62;

/**
 *
 * @author gerson
 */
public class Ejercicio62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LSimpleB b=new LSimpleB();
        b.adifinal(new Libro("One Piece", "Eiichirō Oda",1999 , 60, 9.8));
        b.adifinal(new Libro("Dragon Ball", "Akira Toriyama",1984 , 45,10));
        b.adifinal(new Libro("Black Clover", "Yuki Tabata",2015 , 30, 7.8));
        b.adifinal(new Libro("Dr. STONE", "Riichiro Inagaki",2017 , 50,8.2));
        b.adifinal(new Libro("Vinland Saga", "Makoto Yukimura",2005 , 15,8.4));
        b.adifinal(new Libro("Trillion Game", "Riichiro Inagaki",2020 , 80,5.6));
        b.mostrar();
        System.out.println("========inciso b==========");
        // inciso a)
        b.adifinal(new Libro("Bleach", "Tite Kubo", 2001, 5,4.9));
        b.mostrar();
        System.out.println("===========inciso c=======");
        //inciso b)
        contarAu(b, "Riichiro Inagaki");
        System.out.println("========inciso d==========");
        //inciso c
        mayor(b);
        System.out.println("=======inciso e ==========");
        eliminarCal(b);
        b.mostrar();
        
    }
    public static void contarAu(LSimpleB a, String x){
        NodoB r=a.getP();
        int cont=0;
        while(r!= null){
            if(r.getLi().getAutor().equalsIgnoreCase(x))
                cont++;
            r=r.getSig();
        }
        System.out.println(x+" tiene "+cont+" libros");
        
    }
    public static void mayor(LSimpleB a){
        NodoB r=a.getP();
        int may=0;
        while(r!=null){
            if(r.getLi().getCantEjemplares()>may)
                may=r.getLi().getCantEjemplares();
            r=r.getSig();
        }
        NodoB r2=a.getP();
        while(r2!=null){
            if(r2.getLi().getCantEjemplares()==may)
                r2.getLi().mostrar();
            r2=r2.getSig();
        }
    }
    public static void eliminarCal(LSimpleB a){
        NodoB actual=a.getP();
        NodoB anterior = null; // Necesitamos recordar el nodo anterior
        while (actual != null) {
            if (actual.getLi().getCalificacion() < 6) {
                // ¡Encontramos un nodo para eliminar!
                if (anterior == null) {
                    // Caso A: El nodo a eliminar es el PRIMERO de la lista
                    a.setP(actual.getSig()); // La cabeza de la lista ahora es el segundo nodo
                    actual = a.getP();       // Actualizamos nuestro puntero al nuevo primer nodo
                } else {
                    // Caso B: El nodo a eliminar está en el medio o al final
                    anterior.setSig(actual.getSig()); // El nodo anterior salta al nodo actual
                    actual = actual.getSig();         // Avanzamos al siguiente nodo a revisar
                }
            } else {
                // Si no hay que eliminar, simplemente avanzamos ambos punteros
                anterior = actual;
                actual = actual.getSig();
            }
        }
    }
    
}
