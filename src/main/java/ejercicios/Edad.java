
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        LocalDate Fecha = LocalDate.now();
        int Dia = Fecha.getDayOfMonth();
        int Mes = Fecha.getMonthValue();
        int Year = Fecha.getYear();
        int edad = Year - anno;

        if (mes > Mes || (mes == Mes && dia > Dia)) {
            edad--;
        }

        return "Usted tiene "+edad+" años";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
