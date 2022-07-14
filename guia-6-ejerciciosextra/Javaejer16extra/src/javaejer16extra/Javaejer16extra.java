/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o 
 * menores de edad. Después de cada persona, el programa debe preguntarle al 
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 */
package javaejer16extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer16extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        identificacion();
    }
    public static void identificacion(){
        Scanner leer = new Scanner(System.in);
        String nombre;
        String seguir = "";
        int edad;
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = leer.next();
            System.out.println("Ingrese su edad: ");
            edad = leer.nextInt();
            if (edad< 18) {
                System.out.println(nombre+" es menor de edad ");
            }else{
                System.out.println(nombre+" es mayor de edad");
            }
            System.out.println("Quiere seguir mostrando personas? ");
            seguir = leer.next();
        } while (!seguir.equals("no"));
        
    }

}
