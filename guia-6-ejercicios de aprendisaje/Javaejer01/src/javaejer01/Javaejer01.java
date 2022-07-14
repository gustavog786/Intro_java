/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la 
 * suma de los dos. El programa deberá después mostrar el resultado de la suma
 */
package javaejer01;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los 2 numero es: " + suma);
    }
    
}
