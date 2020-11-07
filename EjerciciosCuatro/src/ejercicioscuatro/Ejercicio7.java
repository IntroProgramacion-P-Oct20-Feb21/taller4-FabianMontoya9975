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
public class Ejercicio7 {
    
    /**
     * @param args the command line arguments
     */
    // 1. Inicio
     public static void main(String[] args) {
        // Ingreso de valores por teclado
        // declarar variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. edad i[16,78]
        int edad;
        // 3. costo_netflix, d[0,n]
        double costo_netflix;
        // 4. costo_youtube, d[0,n]
        double costo_youtube;
        // 5. costo_dropbox, d[0,n]
        double costo_dropbox;
        // 6. costo_spotify, d[0,n]
        double costo_spotify;
        // 7. suma, d[0,n]
        double suma;
        // 8. descuento, d[0,n]
        double descuento;
        // 9. valor_con_descuento, d[0,n]
        double valor_con_descuento;
        
        // pedir datos por teclado - entradas
        // 10. Escribir "Ingresar edad del usuario"
        System.out.println("Ingresar edad del usuario");
        // 11. Leer edad
        edad = entrada.nextInt();
        // 12. Escribir "Ingresar costo del servicio digital Netflix"
        System.out.println("Ingresar costo del servicio digital Netflix");
        // 13. Leer costo_netflix
        costo_netflix = entrada.nextDouble();
        // 14. Escribir "Ingresar costo del servicio digital Youtube Premium"
        System.out.println("Ingresar costo del servicio digital Youtube Premium"
                + "Premium");
        // 15. Leer costo_youtube
        costo_youtube = entrada.nextDouble();
        // 16. Escribir "Ingresar costo del servicio digital Dropbox"
        System.out.println("Ingresar costo del servicio digital Dropbox");
        // 17. Leer costo_dropbox
        costo_dropbox = entrada.nextDouble();
        // 18. Escribir "Ingresar costo del servicio digital Spotify"
        System.out.println("Ingresar costo del servicio digital Spotify");
        // 19. Leer costo_spotify
        costo_spotify = entrada.nextDouble();
        
        // proceso
        // 20. suma <-- costo_netflix + costo_youtube + costo_dropbox 
        // + costo_spotify
        suma = costo_netflix + costo_youtube + costo_dropbox + costo_spotify;
        // 21. descuento <-- suma * 20%
        descuento = suma * 0.2;
        // 22. valor_con_descuento <-- suma - descuento
        valor_con_descuento = suma - descuento;
        
        
        /*
        //Se puede utilizar solo el condicional if
        
        // salida
        // 23. Si edad <30 Entonces
        if(edad <30)
            // 24. Escribir "El valor total a pagar con el 20% de descuento 
            // es: " + valor_con_descuento
            System.out.printf("El usuario es menor a 30 años.\n"
                    + "El valor total a pagar con el 20%% de "
                    + "descuento es: $%.2f\n",
                    valor_con_descuento);
        // 25. Sino
        if(edad >=30)
            // 26. Escribir "El valor total a pagar es: " + suma
            System.out.printf("El valor total a pagar es: $%.2f\n", suma);
        // 27. FinSi
        */
        
        
                            // ó
        
        
        //Se puede utilizar el condicional if else
                
        // salida
        // 23. Si edad <30 Entonces
         if (edad <30) {
             // 24. Escribir "El valor total a pagar con el 20% de descuento
             // es: " + valor_con_descuento
             System.out.printf("El usuario es menor a 30 años.\n"
                    + "El valor total a pagar con el 20%% de "
                    + "descuento es: $%.2f\n",
                    valor_con_descuento);
         } else { // 25. Sino
             // 26. Escribir "El valor total a pagar es: " + suma
             System.out.printf("El valor total a pagar es: $%.2f\n", suma);
         } // 27. FinSi
                        
     } // 28. Fin
}
