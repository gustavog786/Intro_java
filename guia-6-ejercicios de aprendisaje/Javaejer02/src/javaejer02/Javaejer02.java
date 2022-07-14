/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable 
 *y lo muestre por pantalla.
 */
package javaejer02;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es: " + nombre);
    }
    
}
