/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka”
 *el programa pondrá un mensaje de Correcto, sino mostrará un mensaje 
 *de Incorrecto. Nota: investigar la función equals() en Java.
 */
package javaejer07;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la clave secreta: ");
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
