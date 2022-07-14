/*
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir 
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 */
package javaejer15extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer15extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numero: ");
        int num2 = leer.nextInt();
        int opcion;
        String seguro = "A";
        do {
        System.out.println("MENU");
        System.out.println("1.Sumar");
        
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija una opcion: ");
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                sumar(num1,num2);
                break;
            case 2:
                restar(num1,num2);
                break;
            case 3:
                multiplicar(num1,num2);
                break;
            case 4:
                dividir(num1,num2);
                break; 
            case 5:
                break; 
            default:
                System.out.println("Error, ingrese una opcion valida");
                break;    
        }
            
        } while (opcion != 5 );
    }    
    public static void sumar( int num1, int num2){
        int suma = num1+num2;
        System.out.println("La suma de los numeros es: " + (suma));
    }    
    public static void restar( int num1, int num2){
        System.out.println("La resta de los numeros es: " + (num1 - num2));
    }
    public static void multiplicar( int num1, int num2){
        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
    }   
    public static void dividir( int num1, int num2){
        System.out.println("La division de los numeros es: " + (num1 / num2));
    }   
}
