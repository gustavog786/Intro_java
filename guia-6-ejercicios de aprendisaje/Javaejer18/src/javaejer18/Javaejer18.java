/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz 
 * A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaejer18;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int[4][4];
        int matrizT [][] = new int[4][4];
        Random random = new Random();
        //genero matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt((10 - 1) + 1) + 1;
            }
        }
        System.out.println("Matriz original");
        //muestro matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println("");
        }
        
        //genero matriz traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        System.out.println("Matriz Traspuesta");
        //muestro matriz traspuesta
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matrizT [i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
