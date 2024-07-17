/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int entero;
        int suma=0;
        String sumandos="";
        
        do{
        System.out.print("Ingresar un numero entero: ");
        entero=lea.nextInt();
        
            if (entero<0){
                System.out.println("Ingresar un valor mayor a cero.");
            }
        }while(entero<0);
                
                
        String enteroString=String.valueOf(entero);
        
        int longitud=enteroString.length()-1;
        for(int contador=0; contador<=longitud ;contador++){
            char numeroChar=enteroString.charAt(contador);
            
            int numero = Integer.parseInt(Character.toString(numeroChar));
            
            sumandos+= numero+" + ";
            suma+=numero;
        }
        String subSumandos=sumandos.substring(0, sumandos.length()-3);
        System.out.println(subSumandos+" = "+suma);
        
//        int numero=0;
//        
//        while(numero<5){
//        numero=numero+1;
//        System.out.println(numero);
//        break;
//        }
    }
}

