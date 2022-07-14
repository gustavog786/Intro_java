/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
 *el doble, el triple y la raíz cuadrada de ese número. Nota: 
 *investigar la función Math.sqrt().
 */
package javaejer05;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        Double raiz = Math.sqrt(num);
        System.out.println("La raiz cuadrada de "+ num +" es "+raiz);
    }
    
}
