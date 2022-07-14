/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer09;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaintroejer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
         int suma = 0;
         int cont = 0;
         do { 
            System.out.println("Ingrese un numero: ");
            int aux = leer.nextInt();
            if (aux == 0){
                break;
            }else{
                suma = suma + aux ;
                cont = cont + 1;
            }
         } while  (cont < 5); 
         System.out.println("La suma de todos los numeros es: " + suma);
    }
    
}
