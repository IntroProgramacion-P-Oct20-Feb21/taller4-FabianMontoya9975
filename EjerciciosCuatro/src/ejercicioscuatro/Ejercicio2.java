/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscuatro;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio2 {
    
    /**
     * @param args the command line arguments
     */
    // 1. Inicio
    public static void main(String[] args) {
        // Ingreso de valores por teclado
        // declarar variables
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        // 2. gasto1, d[0,n]
        double gasto1;
        // 3. gasto2, d[0,n]
        double gasto2;
        // 4. gasto3, d[0,n]
        double gasto3;
        // 5. suma, d[0,n]
        double suma;
        
        // pedir datos por teclado - entradas
        // 6. Escribir "Ingresar gastos del primer hijo"
        System.out.println("Ingresar gastos del primer hijo");
        // 7. Leer gasto1
        gasto1 = entrada.nextDouble();
        // 8. Escribir "Ingresar gastos del segundo hijo"
        System.out.println("Ingresar gastos del segundo hijo");
        // 9. Leer gasto2
        gasto2 = entrada.nextDouble();
        // 10. Escribir "Ingresar gastos del tercer hijo"
        System.out.println("Ingresar gastos del tercer hijo");
        // 11. Leer gasto3
        gasto3 = entrada.nextDouble();
        
        // proceso
        // 12. suma <-- gasto1 + gasto2 + gasto3
        suma = gasto1 + gasto2 + gasto3;
        
        // salida
        // 13. Escribir "El gasto total es: " + suma
        System.out.printf("Es gasto total es: $%.2f\n", suma);
    } // 14. Fin
}
