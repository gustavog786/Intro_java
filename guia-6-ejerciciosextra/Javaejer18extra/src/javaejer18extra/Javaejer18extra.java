/*
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 */
package javaejer18extra;


import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer18extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();
        int suma = 0;
        int vector [] = new int[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese un numero en la posicion "+ i);
            vector[i] = leer.nextInt();
        }
        for (int i = 0; i < tam; i++) {
            suma = suma + vector[i];
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("La suma de los numeros del vector es: "+ suma);
    }
    
}
