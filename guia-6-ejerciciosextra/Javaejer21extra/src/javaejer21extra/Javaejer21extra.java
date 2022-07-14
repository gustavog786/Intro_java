/*
 * Los profesores del curso de programación de Egg necesitan llevar un registro 
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 
 * 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las 
 * ponderaciones de cada nota son:
 * Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15%
 * Primer Integrador 25%
 * Segundo integrador 50%
 * Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
 * Al final del programa los profesores necesitan obtener por pantalla la 
 * cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban 
 * los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 */
package javaejer21extra;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer21extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos");
        int N = leer.nextInt();
        double notafinal [] = new double[N];
        int contdes= 0;
        int contapr= 0;
        double practico1;
        double practico2;
        double integrador1;
        double integrador2;
        for (int i = 0; i < N; i++) {
            System.out.println("Alumnos "+ (i+1));
            System.out.println("Ingrese la nota del practico 1: ");
            practico1 = leer.nextDouble();
            System.out.println("Ingrese la nota del practico 2: ");
            practico2 = leer.nextDouble();
            System.out.println("Ingrese la nota del integrador 1: ");
            integrador1 = leer.nextDouble();
            System.out.println("Ingrese la nota del integrador 2: ");
            integrador2 = leer.nextDouble();
            notafinal[i]= (practico1*0.1+practico2*0.15+integrador1*0.25+integrador2*0.5);
        }
        for (int i = 0; i < N; i++) {
            if (notafinal[i]<7) {
                contdes =contdes +1;
            }else{contapr = contapr +1;}
        }
        for (int i = 0; i < N; i++) {
            System.out.print("[" + notafinal[i] + "]");
        }
        System.out.println("");
        System.out.println("La cantidad de alumnos aprobados es: "+ contapr);
        System.out.println("La cantidad de alumnos desaprobados es: "+ contdes);
    }
    
}
