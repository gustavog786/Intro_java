/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer144;
import java.util.Scanner;
/**
 *
 * @author gusta
 */
public class Javaejer144 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese la cantidad de euros a cambiar");
        double euros;
        euros = leer.nextDouble();
        
        
        
        System.out.println("Ingrese la moneda a comvertir");
        String moneda = leer.next();
        convertir( euros, moneda);
    }
    

    public static void convertir(double euros, String moneda ){
      switch  (moneda) {
          case "dolares":
              System.out.println("serian : " + (euros*1.28611)+ " dolares " );
              break;
          case "libras": 
              System.out.println("serian : " + (euros*0.86)+ " libras " );
              break;
          case "yenes":
              System.out.println("serian : " + (euros*129.852)+ " yenes " );
              break;
          default:
              System.out.println("la moneda ingresada no corresponde");

    }
    
}
}