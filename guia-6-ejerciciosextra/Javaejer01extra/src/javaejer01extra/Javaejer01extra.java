/*
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas.
 */
package javaejer01extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer01extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ingrese una cantidad de minutos: ");
        int minutos = leer.nextInt();
        double hor;
        double dia;
        dia = Math.floor(minutos/1440);
        System.out.println(dia);
        hor = Math.floor((minutos-(dia*1440))/60);
        System.out.println(hor);
        System.out.println(minutos+" minutos son "+ dia+" dias y "+ hor +" horas");
    }
    
}
