/*
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
 * diferente a cada una. A continuación, realizar las instrucciones necesarias 
 * para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y
 * D tome el valor de B. Mostrar los valores iniciales y los valores finales
 * de cada variable. Utilizar sólo una variable auxiliar.
 */
package javaejer02extra;

/**
 *
 * @author gusta
 */
public class Javaejer02extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = D;
        D = B;
        B = C;
        C = A;
        A = aux;
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
    }
    
}
