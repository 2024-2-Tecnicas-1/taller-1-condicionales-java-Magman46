
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
        int[] numeros = {numero1, numero2, numero3, numero4};
        
        java.util.Arrays.sort(numeros);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numeros.length; i++) {
            sb.append(numeros[i]);
            if (i < numeros.length - 1) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
