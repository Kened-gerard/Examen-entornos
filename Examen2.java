/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2;
import java.util.Scanner;
/**
 *
 * @author kenmonfaj
 */
public class Examen2 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int opcion = 0; 
        String palabra, palabra2, resultado, frase;
        int contador;
        char l1;

        do {
            System.out.println("<<< Menú de opciones >>>");
            System.out.println("1 - Concatenar dos palabras");
            System.out.println("2 - Visualizar el número de palabras de una frase");
            System.out.println("3 - Contar cuántas veces aparece una letra en una frase");
            System.out.println("4 - Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir salto de línea tras leer el entero

            switch (opcion) {
                case 1:
                     System.out.println("Dime una primera palabra para concatenar:");
                    palabra = sc.nextLine();
                    System.out.println("Dime una segunda palabra:");
                    palabra2 = sc.nextLine();
                    resultado = palabra + " " + palabra2; 
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    System.out.println("Ingrese la frase para contar las palabras:");
                    frase = sc.nextLine();
                    String[] palabras = frase.trim().split("\\s+");
                    System.out.println("El número total de palabras es: " + palabras.length);
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                default:
                    
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}