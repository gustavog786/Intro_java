/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer12;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaintroejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        Esmultiplo(num1, num2);
    }
    public static void Esmultiplo( int num1, int num2){
        if (num2 % num1 == 0) {
            System.out.println("El numero " + num1 + " es multiplo de " + num2);
        }
        else{
            System.out.println("El numero " + num1 + " NO es multiplo de " + num2);
            
        }
    }
    
}
