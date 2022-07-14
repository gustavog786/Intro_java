/*
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo
 * y el promedio de n números (n>0). El valor de n se solicitará al principio
 * del programa y los números serán introducidos por el usuario. Realice dos 
 * versiones del programa, una usando el bucle “while” y otra con el 
 * bucle “do - while”.
 */
package javaejer07extra;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer07extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las cantidad de numeros: ");
        int cantidad = leer.nextInt();
        int numero = 0;
        int cont = 1;
        double suma = 0;
        int maximo;
        int minimo;
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        suma= suma + numero;
        maximo = numero;
        minimo = numero;
        while( cont < cantidad){
            System.out.println("Ingrese un numero: ");
            numero = leer.nextInt();
            maximo = max(maximo, numero);            
            minimo = Math.min(minimo, numero);
            suma= suma + numero;
            cont = cont + 1;
        }
        System.out.println("El numero maximo ingresado es: "+maximo);
        System.out.println("El numero minimo ingresado es: "+minimo);
        System.out.println("El promedio de los numero ingresados es: "+(suma/cantidad));
    }    
}
