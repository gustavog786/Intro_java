/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro05;
//aca se importa el scannner
import java.util.Scanner;
/**
 *
 * @author gusta
 */
public class Javaintro05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Con esta clase guardamos valores ingreados por consola en las variables");
        System.out.println("Ingrese su nombre: ");
        char nombre = leer.next().charAt(0);
        System.out.println("Ingrese un numero real: ");
        Double decimal = leer.nextDouble();
        System.out.println("Ingrese un true o false");
        boolean logico = leer.nextBoolean();
    }
    
}
