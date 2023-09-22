/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.manchas.operacion;

import java.util.Scanner;




/**
 * Evalua si una palabra o frase es un palíndromo o no.
 * @author arana
 */
public class Operacion {
           public static void main(String[] args)   {
        // Solicitar al usuario que ingrese una palabra o frase
        System.out.println("Ingrese una palabra o frase para verificar si es un palíndromo:");
        // Objeto Scanner para obtener la entrada del usuario desde la consola
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
      
        // Limpiar la frase para la verificación
        frase = frase.toLowerCase();
        frase = frase.replace(" ", "")
                .replace("á", "a") 
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u")
                .replace("¡", "")
                .replace("!", "")
                .replace(",", "")
                .replace(".", "");
        
               
        // Calcular la longitud de la frase y realizar la verificación de palíndromo
        int longitud = frase.length();
        boolean Palindromo = true;
        char[] caracteres = frase.toCharArray();
    
        // Comparamos los caracteres desde los extremos hacia el centro
        for (int i = 0; i < longitud / 2; i++) {
        if (caracteres[i] != caracteres[longitud - i - 1]) {
        Palindromo = false;
        break; // No es un palíndromo, podemos salir del bucle
            }
        }
        // Mostrar el resultado de la verificación
        if (Palindromo) {
            System.out.println("Sí es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }

       
    }
        
        
        
}      