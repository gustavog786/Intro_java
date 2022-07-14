/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer11v2;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaintroejer11V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;
        String Cambiar;
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        Cambiar = Cambio(frase);
        System.out.println(Cambiar);
    }
    public static String Cambio ( String frase){
        System.out.println(frase.replace('a', '@').replace('e', '#').replace('i', '$').replace('o', '&').replace('u', '*'));
    return frase;    
    }
}
