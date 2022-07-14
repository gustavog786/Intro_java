/*
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los 
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo sustituya por una E.
 * Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * 0-1-2
 * 0-1-E
 * Nota: investigar función equals() y como convertir números a String.
 */
package javaejer12extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");    
     
        String caracter = "";
     
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
           
                if (i == 3){
                 caracter = caracter.concat("E");
                 
                } else {
                  caracter = caracter.concat(Integer.toString(i));               
                }
                  caracter = caracter.concat(" - ");
                    
                if (j == 3){
                 caracter = caracter.concat("E");
                 
                } else {
                  
                  caracter = caracter.concat(Integer.toString(j));               
                }
                    caracter = caracter.concat(" - "); 
                    
                if (k == 3){
                 caracter = caracter.concat("E");
                 
                } else {
                  
                  caracter = caracter.concat(Integer.toString(k));               
                }

                System.out.println(caracter);
                    caracter = "";
                }
            }
        }
        System.out.println("");
    }
    
}
