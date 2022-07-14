/*
 * Una obra social tiene tres clases de socios:
 * o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
 * descuento en todos los tipos de tratamientos.
 * o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
 * para los mismos tratamientos que los socios del tipo A.
 * o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
 * dichos tratamientos.
 * o Solicite una letra (carácter) que representa la clase de un socio, y luego
 * un valor real que represente el costo del tratamiento (previo al descuento)
 * y determine el importe en efectivo a pagar por dicho socio.
 */
package javaejer05extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer05extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una clase de socio: ");
        String letra = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento: ");
        double costo = leer.nextDouble();
        switch(letra){
            case "A":
            case "a":    
                System.out.println("Por ser socio tipo A debe abonar \n"
                        + "un total de: "+ (costo*0.5));
                break;
            case "B":
            case "b":    
                System.out.println("Por ser socio tipo B debe abonar \n"
                        + "un total de: "+ (costo*0.65));
                break;
            case "C":
            case "c":    
                System.out.println("Por ser socio tipo C debe abonar \n"
                        + "un total de: "+ costo);
                break;
            default :
                System.out.println("El tipo de socio no corresponde");
                break;
        }
    }
    
}
