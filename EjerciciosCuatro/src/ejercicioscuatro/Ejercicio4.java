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
public class Ejercicio4 {
    
    /**
     * @param args the command line arguments
     */
    // 1. Inicio
     public static void main(String[] args) {
        // Ingreso de valores por teclado
        // declarar variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. costo_cpu, d[0,n]
        double costo_cpu;
        // 3. costo_teclado, d[0,n]
        double costo_teclado;
        // 4. costo_pantalla, d[0,n]
        double costo_pantalla;
        // 5. costo_raton, d[0,n]
        double costo_raton;
        // 6. suma, d[0,n]
        double suma;
        
        // pedir datos por teclado - entradas
        // 7. Escribir "Ingresar el costo del CPU"
        System.out.println("Ingresar el costo del CPU");
        // 8. Leer costo_cpu
        costo_cpu = entrada.nextDouble();
        // 9. Escribir "Ingresar costo del teclado"
        System.out.println("Ingresar el costo del teclado");
        // 10. Leer costo_teclado
        costo_teclado = entrada.nextDouble();
        // 11. Escribir "Ingresar costo de la pantalla"
        System.out.println("Ingresar el costo de la pantalla");
        // 12. Leer costo_pantalla
        costo_pantalla = entrada.nextDouble();
        // 13. Escribir "Ingresar costo del ratón"
        System.out.println("Ingresar el costo del ratón");
        // 14. Leer costo_raton
        costo_raton = entrada.nextDouble();
        
        // proceso
        // 15. suma <-- costo_cpu + costo_teclado + costo_pantalla 
        // + costo_raton
        suma = costo_cpu + costo_teclado + costo_pantalla + costo_raton;
        
        // salida
        // 16. Escribir "El costo de la computadora de escritorio es " + suma
        System.out.printf("El costo de la computadora de escritorio es de: "
                + "$%.2f\n",
                suma);
        
     } // 17. Fin
}
