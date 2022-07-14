/*
 * Leer la altura de N personas y determinar el promedio de estaturas que 
 * se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package javaejer06extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer06extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero de personas para saber su altura: ");
        int numero = leer.nextInt();
        int cont= 0;
        int contp = 0;
        double suma = 0;
        double sumatotal = 0;
        int alt;
        do {
            System.out.println("Ingrese la altura en centimetros de la persona "+(cont +1));
            alt = leer.nextInt();
            if (alt<160) {
                suma = suma + alt;
                contp = contp + 1;
            }
            sumatotal = sumatotal + alt;
            cont= cont +1;
        } while (cont < numero);
        System.out.println("El promedio de las personas con estatura menor a 1.60m \n"
                + " es : " +(suma/contp)/100+" metros"); 
        System.out.println("El promedio de estatura de todas las personas es:"+(sumatotal/cont)/100+" metros");
    }
    
}
