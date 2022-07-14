/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer13;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaintroejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Equipo = new String [5];
        for (int i = 0; i < 5; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un nombre de unintegrante del equipo: ");
            Equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + Equipo[i] + "]");
        }
        System.out.println("");
    }
    
}
