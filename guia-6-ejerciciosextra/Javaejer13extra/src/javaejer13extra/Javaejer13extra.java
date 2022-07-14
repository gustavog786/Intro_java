/*
 * Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la 
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el 
 * número 3:
 * 1
 * 12
 * 123
 */
package javaejer13extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer13extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int escalera = leer.nextInt();
        for (int i = 1; i < escalera +1; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
    
}
