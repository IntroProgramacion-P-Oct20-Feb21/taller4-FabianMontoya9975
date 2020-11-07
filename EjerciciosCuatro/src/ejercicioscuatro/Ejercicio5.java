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
public class Ejercicio5 {
    
    /**
     * @param args the command line arguments
     */
    // 1. Inicio
     public static void main(String[] args) {
        // Ingreso de valores por teclado
        // declarar variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. monto_prestamo, d[0,n]
        double monto_prestamo;
        // 3. interes_mensual, d[0,n]
        double interes_mensual;
        // 4. cociente, d[0,n]
        double cociente;
        // 5. suma, d[0,n]
        double suma;
        
        // pedir datos por teclado - entradas
        // 6. Escribir "Ingresar el monto del préstamo"
        System.out.println("Ingresar el monto del préstamo");
        // 7. Leer monto_prestamo
        monto_prestamo = entrada.nextDouble();
        // 8. Escribir "Ingresar el interés mensual a cobrar"
        System.out.println("Ingresar el interés mensual a cobrar");
        // 9. Leer interes_mensual
        interes_mensual = entrada.nextDouble();
        
        // proceso
        // 10. cociente <-- monto_prestamo / 12
        cociente = monto_prestamo / 12;
        // 11. suma <-- cociente + interes_mensual
        suma = cociente + interes_mensual;
        
        // salida
        // 12. Escribir "El pago mensual a pagar es: " + suma
        System.out.printf("El pago mensual a pagar es: $%.2f\n", suma);
                
     } // 13. Fin
}
