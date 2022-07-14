/*
 * Realizar un programa que rellene una matriz de tamaño NxM con valores 
 * aleatorios y muestre la suma de sus elementos.
 */
package javaejer22extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer22extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("INgrese el numero de filas de la matriz: ");
        int N = leer.nextInt();
        System.out.println("INgrese el numero de columnas de la matriz: ");
        int M = leer.nextInt();
        int matriz [][] = new int[N][M];
        int suma = 0;
        Random rnd = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j]= rnd.nextInt(10-1+1)+1;
                suma = suma + matriz[i][j];
            }   
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de los elementos de la matriz es: " +suma);
    }
    
}
