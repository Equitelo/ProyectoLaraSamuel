/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class CiclosProgra {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        String cadena;
        
        System.out.println("Ingresar cadena de caracteres: ");
        cadena=lea.next();
        
        for(int contador=0; contador<cadena.length(); contador++){
            System.out.println("["+contador+"]: "+cadena.charAt(contador));
        }
    }
}
