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
public class Ejercicio3 {
    
    /**
     * @param args the command line arguments
     */
    // 1. Inicio
     public static void main(String[] args) {
        // Ingreso de valores por teclado
        // declarar variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. costo_minuto, d[0,n]
        double costo_minuto;
        // 3. minutos_consumidos, d[0,n]
        double minutos_consumidos;
        // 4. producto, d[0,n]
        double producto;        
        
        // pedir datos por teclado - entradas
        // 5. Escribir "Ingresar el costo por minutos"
        System.out.println("Ingresar el costo por minutos");
        // 6. Leer costo_minuto
        costo_minuto = entrada.nextDouble();
        // 7. Escribir "Ingresar los minutos consumidos en el mes"
        System.out.println("Ingresar los minutos consumidos en el mes");
        // 8. Leer minutos_consumidos
        minutos_consumidos = entrada.nextDouble();
        
        // proceso
        // 9. producto <-- costo_minuto * minutos_consumidos
        producto = costo_minuto * minutos_consumidos;
        
        // salida
        // 10. Escribir "El valor de la planilla: " + producto
        System.out.printf("El valor de la planilla: $%.2f\n",
                producto);
        
     } // 11. Fin
    
}
