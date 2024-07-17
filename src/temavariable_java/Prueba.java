/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");

        System.out.println("Ingresa una cadena de texto: ");
        String palabra = leer.next().toLowerCase();

        int maxFrecuencia = 0;
        char caracterMasFrecuente = ' ';

        for (int i = 0; i < palabra.length(); i++) {
            char caracterActual = palabra.charAt(i);
            int frecuenciaActual = 0;

            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == caracterActual) {
                    frecuenciaActual++;
                }
            }

            if (frecuenciaActual > maxFrecuencia) {
                maxFrecuencia = frecuenciaActual;
                caracterMasFrecuente = caracterActual;
            }
        }

        System.out.println("El caracter mas frecuente es: '" + caracterMasFrecuente + "' con una frecuencia de: " + maxFrecuencia);
        
    }
}
