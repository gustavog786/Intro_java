/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejer13;
import java.util.Scanner;
/**
 *
 * @author gusta
 */
public class Javaejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
		int a;
		int b;
		int numerolados;
		System.out.println("Ingrese un número entero positivo");
		numerolados = leer.nextInt();
		for (a=1;a<=numerolados;a++) {
			for (b=1;b<=numerolados;b++) {
				if (a==1 || a==numerolados || b==1 || b==numerolados) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}


}

  