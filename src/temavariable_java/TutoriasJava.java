/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class TutoriasJava {
    
    public static void main(String[] args) {
        String palabra="boleto";
        
        palabra=palabra.substring(0, 6);
        System.out.println(palabra);
        
        for(int i=0;i<palabra.length();i++){
            int cont=0;
            for(int j=0; j<palabra.length();j++){
                cont+=palabra.charAt(i)==palabra.charAt(j)?1:0;
            }
            
            System.out.println("letra "+palabra.charAt(i)+" "+"repitio: "+cont);
        }
    }
}
