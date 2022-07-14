/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de
 * 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaejer17;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();
        int vector [] = new int[tam];
        Random random = new Random();
        int contw = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for (int i = 0; i < tam; i++) {
            vector[i]= random.nextInt((99999 - 1) + 1) + 1;
        }
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            contw = 0;
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                contw = contw + 1 ;
            }
            switch(contw){
                case 1 :
                    cont1 = cont1 +1;
                    break;
                case 2 :
                    cont2 = cont2 +1;
                    break;
                case 3 :
                    cont3 = cont3 +1;
                    break;
                case 4 :
                    cont4 = cont4 +1;
                    break;
                case 5 :
                    cont5 = cont5 +1;
                    break;
                default: 
                    System.out.println("error");
            }
                    
        }
        System.out.println("La cantidad de numeros de 1 digito es: " + cont1);
        System.out.println("La cantidad de numeros de 2 digitos es: " + cont2);
        System.out.println("La cantidad de numeros de 3 digitos es: " + cont3);
        System.out.println("La cantidad de numeros de 4 digitos es: " + cont4);
        System.out.println("La cantidad de numeros de 5 digitos es: " + cont5);
    }

}
