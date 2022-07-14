/*
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
 * trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la
 * función equals() de la clase String.
 */
package javaejer03extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer03extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra ");
        String letra = leer.nextLine();
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") ) {
            System.out.println("La letra es una vocal");
        }else{
            System.out.println("La letra NO es una vocal");
        }
    }
    
}
