/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de
 * los números introducidos supere el límite inicial.
 */
package javaejer10;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite: ");
        int limite = leer.nextInt();
        int suma = 0 ;
        do {
            System.out.println("Ingrese un numero positivo: ");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma <= limite);
        System.out.println("La suma de los numeros ingresados supero el numero limite");
    }
    
}
