/*
 * Crear una función rellene un vector con números aleatorios, pasándole un 
 * arreglo por parámetro. Después haremos otra función o procedimiento que
 * imprima el vector.
 */
package javaejer20extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer20extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();
        int vector [] = new int[tam];
        rellenoaleatorio(tam, vector);
        muestrovector(tam, vector);
    }
    public static void rellenoaleatorio( int n, int vector []){
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            vector[i]= rnd.nextInt(10-1+1)+1;
        }
    }
    public static void muestrovector( int n, int vector[]){
        System.out.println("Muestro vector");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
    }
}
