/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 
 * y se muestre su equivalente en romano.
 */
package javaejer04extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer04extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 9: ");
        int numero = leer.nextInt();
        int i;
        String romano = "";
        while( numero< 1 || numero > 9){
            System.out.println("Error, Ingrese un numero entre 1 y 9: ");
            numero = leer.nextInt();
        }   
        if (numero == 9) {
          romano = romano + "IX";
        } else if (numero >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= numero; i++) {                                                           
                      romano = romano + "I";
                 }
        } else if (numero == 4) {
                 romano = romano + "IV";
        } else {
                 for (i = 1; i <= numero; i++) {
                      romano = romano + "I";
                 }
      }
        System.out.println(numero+" en numeros romanos es " + romano);
    }
    
}
