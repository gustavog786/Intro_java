/*
 * Crear un programa que dado un numero determine si es par o impar.
 */
package javaejer06;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " es un numero par");
        }else{
            System.out.println(num + " NO es un numero par");
        }
    }
    
}
