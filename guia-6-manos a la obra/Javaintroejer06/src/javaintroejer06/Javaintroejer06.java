/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer06;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaintroejer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero : ");
        int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25 ){
            System.out.println(" Los 2 numero son mayores que 25");
        } else if (num1 > 25 || num2 > 25 ) {
            System.out.println("Alguno de los 2 es mayor que 25");
        } else {
            System.out.println("Ninguno de los 2 es mayor a 25");
        }
    }
    
}
