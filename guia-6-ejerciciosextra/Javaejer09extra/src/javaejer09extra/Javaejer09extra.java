/*
 * Simular la división usando solamente restas. Dados dos números enteros 
 * mayores que uno, realizar un algoritmo que calcule el cociente y el residuo
 * usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un
 * resultado menor que el divisor, este resultado es el residuo, y el número de
 * restas realizadas es el cociente.
 * Por ejemplo: 50 / 13:
 * 50 – 13 = 37 una resta realizada
 * 37 – 13 = 24 dos restas realizadas
 * 24 – 13 = 11 tres restas realizadas
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package javaejer09extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer09extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un numero: ");
        int num2 = leer.nextInt();
        int resto = num1;
        int cociente = 0;
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero");
        }else{
            if (num1 > num2) {
                while(resto > num2){
                    resto = resto - num2;
                    cociente = cociente + 1;
                    
                }
                System.out.println("el residuo es "+ resto + " y el cociente es "+ cociente);
            }else{
                System.out.println("No podemos dividir por el metodo de la resta ");
            }                
        }
    }
    
}
