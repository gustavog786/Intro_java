/*
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas
 *y después toda en minúsculas. Nota: investigar la función toUpperCase()
 *y toLowerCase() en Java.
 */
package javaejer03;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        System.out.println("Ahora se muestra la frase un minusculas: " + frase.toLowerCase());
        System.out.println("Ahora se muestra la frase en mayusculas: " + frase.toUpperCase());
    }
    
}
