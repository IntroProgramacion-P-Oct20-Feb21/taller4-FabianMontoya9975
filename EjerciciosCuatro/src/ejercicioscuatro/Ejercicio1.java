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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingreso de valores por teclado
        // declarar variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. base, d[0,n]
        double base;
        // 3. altura, d[0,n]
        double altura;
        // 4. producto, d[0,n]
        double producto;
        // 5. cociente, d[0,n]
        double cociente;         
        
        // pedir datos por teclado - entradas
        // 6. Escribir "Ingresar la base del triángulo"
        System.out.println("Ingresar la base del triángulo");
        // 7. Leer base
        base = entrada.nextDouble();
        // 8. Escribir "Ingresar altura del triángulo"
        System.out.println("Ingresar la altura del triángulo");
        // 9. Leer altura
        altura = entrada.nextDouble();
        
        // proceso
        // 10. producto <-- base * altura
        producto = base + altura;
        // 11. cociente <-- producto / 2
        cociente = producto / 2;
        
        // salida
        // 13. Escribir "El área del triángulo es: " + cociente
        System.out.printf("El área del triángulo es: %.3f\n", cociente);
        
    } // 14.Fin

}
