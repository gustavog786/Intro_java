/*
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en 
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no 
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada.
 * Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
 * siguientes funciones de Java substring(), Length() y Math.random().
 */
package javaejer23extra;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Javaejer23extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String matriz [][] = new String[20][20];
        int[] fila = new int[5];
        int[] columna = new int[5];
        String[] palabra = new String[5];
        Scanner leer = new Scanner(System.in);
        Random rnd = new Random();
        int hola;
        int f = 0;
        int c = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                hola =rnd.nextInt(10-1+1)+1;
                matriz[i][j]= String.valueOf(hola);
                System.out.println("Ingrese una palabra de minimo 3 y maximo 5 caracteres : ");
                palabra[i] = leer.nextLine();
                filas(fila);
                columnas(columna,palabra);
                while(palabra[i].length()<3 || palabra[i].length()>5){
                System.out.println("Error, ingrese nuevamente la palabra: ");
                palabra[i] = leer.nextLine();
                filas(fila);  
                columnas(columna,palabra);                
                }
            }
        
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + matriz [i][j] + "]");
            }
            System.out.println("");
        }
       
    }
    public static void filas(int[] fila){
        for (int i=0; i<fila.length; i++) {
            fila[i] = -1;
        }

        // Selecciono una fila aleatoria
        int i = 0;
        boolean libre = false;
        int aleatorio;
        while (i<fila.length) {
            aleatorio = (int) (Math.random()*20);

            for (int j=0; j<fila.length; j++) {
                if (fila[i] == aleatorio) {
                    libre = false;
                    break;
                } else {
                    libre = true;
                }
            }
            if (libre){
                fila[i] = aleatorio;
                i++;
            }
        }

        // Imprimo la fila seleccionada
        for (i=0; i<fila.length; i++){
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    
 
    }
    public static void columnas(int[] columna, String[] palabras){
        // Relleno columna
        for (int i=0; i<columna.length; i++) {
            columna[i] = (int) (Math.random()*(20-palabras[i].length()));
        }
        // Muestro columnas
        for (int i=0; i<columna.length; i++) {
            System.out.print(columna[i] + " ");
        }
        System.out.println();
    }
}