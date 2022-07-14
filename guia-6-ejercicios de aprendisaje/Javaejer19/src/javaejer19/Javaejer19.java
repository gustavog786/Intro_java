/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int[3][3];
        int matrizT [][] = new int[3][3];
        int cont = 0;
        Random random = new Random();
        //genero matriz
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;
        System.out.println("Matriz original");
        //muestro matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println("");
        }
        
        //genero matriz traspuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        System.out.println("Matriz Traspuesta");
        //muestro matriz traspuesta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizT [i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == matrizT[i][j]*(-1)){
                    cont = cont + 1;
                }
            }
        }    
        if (cont == 9){   
            System.out.println("La matriz es anti simétrica");
            
        }else{
            System.out.println("La matriz NO es anti simetrica");
        }
    }
    
}
