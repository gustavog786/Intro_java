/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintroejer11;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaintroejer11 {

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
        Cambio(frase);
       
    }
    public static void Cambio ( String frase){
        String conc = "";
        for ( int i = 0; i < frase.length(); i++) {
        
            switch (frase.substring(i,i +1)) {
                case "A":
                case "a":
                    conc = conc.concat("@");
                    break;
                case "E":    
                case "e":
                    conc = conc.concat("#");
                    break;
                case "I":    
                case "i":
                    conc = conc.concat("$");
                    break;
                case "O":    
                case "o":
                    conc = conc.concat("%");
                    break;
                case "U":    
                case "u":
                    conc = conc.concat("*");
                    break;
                default:
                    conc = conc.concat(frase.substring(i, i + 1));
                    
            }
            
        
        }
        System.out.println("la frase codificada es:" + conc );
            
    }
}