/*
 * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la
 * matriz P de 3x3, se solicita escribir un programa en el cual se compruebe 
 * si la matriz P está contenida dentro de la matriz M. Para ello se debe 
 * verificar si entre todas las submatrices de 3x3 que se pueden formar en la
 * matriz M, desplazándose por filas o columnas, existe al menos una
 * que coincida con la matriz P. En ese caso, el programa debe indicar la fila
 * y la columna de la matriz M en la cual empieza el primer elemento
 * de la submatriz P.
 */
package javaejer21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int[3][3];
        int matriz2 [][] = new int[10][10];
        int cont = 0;
        int hola[] = new int[2];
        Random random = new Random();
        //genero matriz 3x3
        matriz[0][0] = 36;
        matriz[0][1] = 5;
        matriz[0][2] = 67;
        matriz[1][0] = 89;
        matriz[1][1] = 90;
        matriz[1][2] = 75;
        matriz[2][0] = 14;
        matriz[2][1] = 22;
        matriz[2][2] = 26;
        System.out.println("Matriz de 3x3");
        //muestro matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println("");
        }
        //Genero Matriz de 5x5
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz2[i][j] = random.nextInt((10 - 1) + 1) + 1;     
            }
        }
        matriz2[0][3] = 36;
        matriz2[0][8] = 36;
        matriz2[1][1] = 36;
        matriz2[1][2] = 5;
        matriz2[1][3] = 67;
        matriz2[2][1] = 89;
        matriz2[2][2] = 90;
        matriz2[2][3] = 75;
        matriz2[3][1] = 14;
        matriz2[3][2] = 22;
        matriz2[3][3] = 26;
        matriz2[6][6] = 36;
        System.out.println("Matriz de 5x5");
        //muestro matriz de 5x5
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matriz2 [i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 10-3; i++) {       //recorro hasta la matriz grande - la chica
            for (int j = 0; j < 10-3; j++) {
                if (matriz2[i][j] == matriz[0][0]) {
                    hola[0] =  i ;
                    hola[1] =  j ;
                    
                    cont= 0;
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            if (matriz2[k][l] == matriz[k-i][l-j]) {
                                cont = cont +1;
                            }
                        }
                    }
                    if (cont == 9) {
                       System.out.println("esta contenida en y empieza en la posicion: ");
                       System.out.println("["+hola[0]+"],["+hola[1]+"]");
                        
                    }
                }
                
            }
        }
        System.out.println("contador" + cont);
        if (cont == 9 ) {
            System.out.println("esta contenida en y empieza en la posicion: ");
            System.out.println("["+hola[0]+"],["+hola[1]+"]");
        }else{
            System.out.println("No esta contenida");
        }
    }
    
}
