/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosdos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EjemploDos {
    // 1. Inicio
    public static void main(String[] args) {
        
        // declaro las variables
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // 2. nombreComprador, x(30)[{a-z},{BS},{A-Z}]
        String nombreComprador;
        // 3. largo, d[0, n]
        double largo;
        // 4. ancho, d[0, n]
        double ancho;
        // 5. area, d[0, n]
        double area;
        // 6. costoMetro, d[0, n]
        double costoMetro;
        // 7. costoTerreno, d[0, n]
        double costoTerreno;
        
        
        
        // pido datos por teclado - entradas
        // 8. Escribir "Ingrese el largo del terreno"
        System.out.println("Ingrese el largo del terreno");
        // 9. Leer largo
        largo = entrada.nextDouble();
        // 10. Escribir "Ingrese el ancho del terreno"
        System.out.println("Ingrese el ancho del terreno");
        // 11. Leer ancho
        ancho = entrada.nextDouble();
        // 12. Escribir "Ingrese el costo del m2 del terreno"
        System.out.println("Ingrese el costo del m2 del terreno");
        // 13. Leer costoMetro
        costoMetro = entrada.nextDouble();
        
        System.out.println("Ingresar el nombre del comprador");
        entrada.nextLine();
        nombreComprador = entrada.nextLine();

        // proceso
        // 14. area <-- largo * ancho
        area = largo * ancho;
        // 15. costoTerreno <-- area * costoMetro
        costoTerreno = area * costoMetro;    
        
        // salida
        // 16. Escribir "El costo del terreno es :" + costoTerreno
        System.out.printf("El costo del terreno es : %.2f\n"
                + "Nombre del comprador: %s\n", 
                costoTerreno,
                nombreComprador);
    } // 17. Fin
}
