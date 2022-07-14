/*
 * Escribir un programa que lea un número entero y devuelva el número de dígitos
 * que componen ese número. Por ejemplo, si introducimos el número 12345, el
 * programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
 * utilizando el operador de división. Nota: recordar que las variables de tipo
 * entero truncan los números o resultados.
 */
package javaejer11extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = leer.nextInt();
        int cont = 1;
        double aux = (int)(num /10);
        while(aux>0){
            aux = (int)(aux /10);
            cont = cont + 1;
        }
        System.out.println("El numero de digitos del numero "+num+" es "+cont);
    }
    
}
