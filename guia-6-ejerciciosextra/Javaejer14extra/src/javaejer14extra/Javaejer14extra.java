/*
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M 
 * cantidad de hijos. Escriba un programa que pida la cantidad de familias y 
 * para cada familia la cantidad de hijos para averiguar la media de edad de
 * los hijos de todas las familias.
 */
package javaejer14extra;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gusta
 */
public class Javaejer14extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de familias: ");
        int M = leer.nextInt();
        int hijos = 0;
        double suma = 0;
        int cantidad = 0;
        int edad= 0;
        Random rnd = new Random();
        int matriz [][] = new int[2][M];
        for (int i = 0; i < M; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia: "+(i+1));
            hijos = leer.nextInt();   
                for (int j = 0; j < hijos; j++) {
                    edad = rnd.nextInt(40);
                    System.out.println(edad);
                    suma = suma + edad;
                    cantidad = cantidad +1;
                }
        }
         System.out.println("La media de edad de los hijos de todas las familias es: " + suma/cantidad);
    }
    
}
