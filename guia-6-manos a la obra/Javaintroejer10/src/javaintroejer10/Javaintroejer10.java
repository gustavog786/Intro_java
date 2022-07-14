/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer10;


import java.util.Scanner;



/**
 *
 * @author gusta
 */
public class Javaintroejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int numero = 1 ;
        
        
            for(int i = 0; i <5; i++){
                System.out.println("Ingrese un numero entre 1 y 20: ");
                numero = leer.nextInt();
                while (numero <= 1 || numero >= 20){
                System.out.println("Numero incorrecto, ingrese nuevamente");
                numero = leer.nextInt();
            }
                System.out.println("para " + numero + " : ");
                for (int j = 0; j < numero ; j++) {
                    System.out.print("*");   
                }
                System.out.println(" ");

       }
    }
    
}
