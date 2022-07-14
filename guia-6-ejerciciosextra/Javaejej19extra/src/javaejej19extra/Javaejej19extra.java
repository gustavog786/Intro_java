/*
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */
package javaejej19extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejej19extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int tam = leer.nextInt();
        int cont = 0;
        int vector [] = new int[tam];
        int vector2[] = new int [tam];
        System.out.println("Relleno vector");
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese un numero en la posicion "+ i);
            vector[i] = leer.nextInt();
        }
        System.out.println("Relleno vector2");
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese un numero en la posicion "+ i);
            vector2[i] = leer.nextInt();
        }
        System.out.println("Muestro vector");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");
        System.out.println("Muestro vector2");
        for (int i = 0; i < tam; i++) {
            System.out.print("[" + vector2[i] + "]");
        }
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            if (vector[i] == vector2[i]) {
                cont = cont +1;
                System.out.println(cont);
            }else{break;}
        }
        System.out.println("");
        if (cont == tam) {
            System.out.println("Los 2 vectores son iguales");
        }else{ System.out.println("Losn 2 vectores NO son iguales");}
    }
    
}
