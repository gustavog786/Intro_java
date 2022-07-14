/*
 * Realizar un programa que pida dos números enteros positivos por teclado
 * y muestre por pantalla el siguiente menú:
 *El usuario deberá elegir una opción y el programa deberá mostrar el resultado
 * por pantalla y luego volver al menú. El programa deberá ejecutarse hasta
 * que se elija la opción 5. Tener en cuenta que, si el usuario selecciona
 * la opción 5, en vez de salir del programa directamente, se debe mostrar 
 * el siguiente mensaje de confirmación: ¿Está seguro que desea salir del 
 * programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
 * programa, caso contrario se vuelve a mostrar el menú.
 */
package javaejer11;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer11 {

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
                System.out.println("La suma de los numeros es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La la resta de los numeros es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La Multiplicacion de los numeros es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La division de los numeros es: " + (num1 / num2));
                break;
             case 5:
                System.out.println("estas seguro?");
                seguro = leer.next();
                break;   
            default:
                System.out.println("Error, ingrese una opcion valida");
                break;
        }
                
        } while (opcion != 5 || !seguro.equals("S") );
    }
    
}
