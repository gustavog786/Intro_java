/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package javaejer20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int[3][3];
        
        int cont = 0;
        int sumafila = 0;
        int sumacolumna = 0;
        int sumadiagonal= 0;
        Random random = new Random();
        //genero matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese un numero del 1 al 9 en la posicion: " + "["+i+"]["+j+"]");
                matriz[i][j]= leer.nextInt();
                while(matriz[i][j] < 0 || matriz[i][j] >9 ){
                    System.out.println("Error, el numero tiene que estar entre 1 y 9, entre nuevamente: ");
                    matriz[i][j]= leer.nextInt();
                }
            }
        }
        System.out.println("Matriz original");
        //muestro matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             sumacolumna = sumacolumna + matriz[i][j];
             sumafila = sumafila + matriz[j][i];
            if (i == j) {
                sumadiagonal = sumadiagonal + matriz [i][j];
            }
                        
            }
            
        }
        sumacolumna = sumacolumna/3;
        sumafila = sumafila / 3;
        System.out.println(sumacolumna);
        System.out.println(sumafila);
        System.out.println(sumadiagonal);
        if (sumadiagonal == sumacolumna && sumadiagonal == sumafila ) {
            System.out.println("Es un cuadrado magico y la suma es: " + sumadiagonal);
        }else{
            System.out.println("No es un cuadrado magico");
        }
    }
    
}
