/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores 
 * aleatorios y le pida al usuario un numero a buscar en el vector.
 * El programa mostrará donde se encuentra el numero y si se encuentra repetido
 */
package javaejer16;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author gusta
 */
public class Javaejer16 {

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
        int cont = 0;
        for (int i = 0; i < tam; i++) {
            vector[i]= random.nextInt((10 - 1) + 1) + 1;
        }
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Ingrese un numero a buscar dentro del vector: ");
        int num = leer.nextInt();
        for (int i = 0; i < tam; i++) {
            if (num == vector[i]) {
                cont = cont +1;
                if (cont == 1){
                System.out.println("El numeero se encuentra en la posicion " + i);
                }
            }   
        } if (cont > 1) {
                    System.out.println("EL numero se encuentra repetido");
            } if (cont == 0){
                System.out.println("El numero no se encuentra en el vector");
                }           
    }
    
}
