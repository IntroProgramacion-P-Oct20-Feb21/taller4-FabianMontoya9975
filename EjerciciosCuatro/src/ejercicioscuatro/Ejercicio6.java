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
public class Ejercicio6 {
    
    /**
     * @param args the command line arguments
     */
    // 1. Inicio
     public static void main(String[] args) {
        // Ingreso de valores por teclado
        //declarar variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. edad, i[18,80]
        int edad;
        // 3. costo_kilovatio_hora, d[0,n]
        double costo_kilovatio_hora;
        // 4. kilovatios, d[0,n]
        double kilovatios;
        // 5. planilla, d[0,n]
        double planilla;
        // 6. descuento, d[0,n]
        double descuento;
        // 7. planilla_descuento, d[0,n]
        double planilla_descuento;
        
        // pedir datos por teclado - entradas
        // 8. Escribir "Ingresar edad del usuario"
        System.out.println("Ingresar edad del usuario");
        // 9. Leer edad
        edad = entrada.nextInt();
        // 10. Escribir "Ingresar el costo del kilovatio/hora"
        System.out.println("Ingresar el costo del kilovatio/hora");
        // 11. Leer costo_kilovatio_hora
        costo_kilovatio_hora = entrada.nextDouble();
        // 12. Escribir "Ingresar el número de kilovatios consumidos en el mes"
        System.out.println("Ingresar el número de kilovatios consumidos "
                + "en el mes");
        // 13. Leer kilovatios
        kilovatios = entrada.nextDouble();
        
        // proceso
        // 14. planilla <-- costo_kilovatio_hora * kilovatios
        planilla = costo_kilovatio_hora * kilovatios;
        // 15. descuento <-- planilla * 10%
        descuento = planilla * 0.1;
        // 16. planilla_descuento <-- planilla - descuento
        planilla_descuento = planilla - descuento;
        
        
        /*
        //Se puede utilizar solo el condicional if
        
        // salida
        // 17. Si edad >65 Entonces
        if (edad >=65)
            // 18. Escribir "El valor de su planilla con el 10% de descuento
            // es: " + planilla_descuento
            System.out.printf("El usuario es mayor a 65 años.\n"
                    + "El valor de su planilla con el 10%% de "
                    + "descuento es: $%.2f\n",
                    planilla_descuento);
        // 19. Sino
        if (edad <65)
            // 20. Escribir "El valor de su planilla es: " + planilla
            System.out.printf("El valor de su planilla es: $%.2f\n", planilla);
        // 21. FinSi
                */
        
        
                                // ó
        
        
        //Se puede utilizar el condicional if else
        
        // salida
        // 17. Si edad >65 Entonces
        if (edad >=65){
            // 18. Escribir "El valor de su planilla con el 10% de descuento
            // es: " + planilla_descuento
             System.out.printf("El usuario es mayor a 65 años.\n"
                    + "El valor de su planilla con el 10%% de "
                    + "descuento es: $%.2f\n",
                    planilla_descuento);       
        } else { // 19. Sino
            // 20. Escribir "El valor de su planilla es: " + planilla
            System.out.printf("El valor de su planilla es: $%.2f\n", planilla);        
        } // 21. FinSi
        
     } // 22. Fin
}
