/*
 * Escriba un programa que lea números enteros. Si el número es múltiplo de 
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
 * cantidad de números pares y la cantidad de números impares. Al igual que en 
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 */
package javaejer08extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer08extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);        
        int num;
        int contpar = 0;
        int contimpar = 0;
        int conttotal = 0;
        do {
            System.out.println("Ingrese un cantidad de numeros: ");
            num = leer.nextInt();
                if (num % 5 == 0) {
                break;
            }
                if (num % 2 == 0) {
                contpar = contpar +1;
            }else{
                   contimpar = contimpar + 1; 
                }
            conttotal = conttotal + 1;
        } while (num >= 0);
        System.out.println("La cantidad total de numeros ingresados fue: " + conttotal);
        System.out.println("La cantidad de numeros pares  fue: " + contpar);
        System.out.println("La cantidad de numeros impares fue: " + contimpar);
    }
    
}
