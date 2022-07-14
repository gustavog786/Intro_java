/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer07v2extra;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer07V2extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las cantidad de numeros: ");
        int cantidad = leer.nextInt();
        int numero;
        int cont = 0;
        double suma = 0;
        int maximo = 0;
        int minimo = 0;
        do {
            System.out.println("Ingrese un numero: ");
            numero = leer.nextInt();
            maximo = max(maximo, numero);                        
            suma= suma + numero;
            if (cont == 0) {
                minimo = numero;
            }else{
                minimo = Math.min(minimo, numero);
            }
            cont = cont + 1;
        } while (cont < cantidad);
        System.out.println("El numero maximo ingresado es: "+maximo);
        System.out.println("El numero minimo ingresado es: "+minimo);
        System.out.println("El promedio de los numero ingresados es: "+(suma/cantidad));
    }    
}
