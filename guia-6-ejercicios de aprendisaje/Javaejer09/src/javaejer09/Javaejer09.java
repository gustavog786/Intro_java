/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 *de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
 *un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
 *imprimir “INCORRECTO”. Nota: investigar la función Substring y equals()de Java.
 */
package javaejer09;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        if (frase.substring(0,1).equals("a")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
