/*
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente
 *en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaejer04;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la tempraratura en °C : ");
        int C = leer.nextInt();
        int F = 32 + (9 * C / 5);
        System.out.println( C + "°C en Fahrenheit son " + 25F + "°");
    }
    
}
