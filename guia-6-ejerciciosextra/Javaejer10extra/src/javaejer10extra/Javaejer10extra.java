/*
 * Realice un programa para que el usuario adivine el resultado de una 
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. El 
 * programa debe indicar al usuario si su respuesta es o no correcta. En caso
 * que la respuesta sea incorrecta se debe permitir al usuario ingresar su
 * respuesta nuevamente. Para realizar este ejercicio investigue como
 * utilizar la función Math.random() de Java.
 */
package javaejer10extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = (int) (Math.random()*10+1);
        System.out.println("El número aleatorio entre 1 y 10 es: " + num1);
        int num2 = (int) (Math.random()*10+1);
        System.out.println("El número aleatorio entre 1 y 10 es: " + num2);
        int mult = num1*num2;
        System.out.println("Adivine el numero que surge de la multiplicacion de 2 numeros\n"
                + " entre 1 y 9");
        Scanner leer = new Scanner(System.in);        
        int num = leer.nextInt();
        do {
            if (num > mult) {
                System.out.println("Ingrese un numero mas chico: ");
                num = leer.nextInt();
            }else if(num<mult){
                 System.out.println("Ingrese un numero mas grande: ");
                 num = leer.nextInt();                   
            }            
        } while (num != mult);
        System.out.println("encontraste el numero y es: " + mult);
    }
    
}
