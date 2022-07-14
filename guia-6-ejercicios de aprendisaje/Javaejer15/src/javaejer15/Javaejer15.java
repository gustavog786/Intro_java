/*
 * Realizar un algoritmo que rellene un vector con los 100 primeros números 
 *enteros y los muestre por pantalla en orden descendente.
 */
package javaejer15;

/**
 *
 * @author gusta
 */
public class Javaejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector [] = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]= i + 1;
        }
        for (int i = 99; i > -1; i--) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}