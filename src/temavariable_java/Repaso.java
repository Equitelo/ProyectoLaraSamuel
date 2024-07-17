/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        
        int entero;
        int contador=0, longitud=0, suma=0;
        String sumandos="";
        
        do{
        System.out.print("Ingresar un numero entero: ");
        entero=lea.nextInt();
        
        if (entero<0){
            System.out.println("Ingresar un valor mayor a cero.");
        }
        }while(entero<0);
        
        String enteroString=String.valueOf(entero);
        
        while(contador<=longitud){
            longitud=enteroString.length()-1;
            
            char numeroChar=enteroString.charAt(contador);
            int numerito=Integer.parseInt(Character.toString(numeroChar));
            
            sumandos+= numerito+" + ";
            
            suma+=numerito;
            
            contador+=1;
        }
        
        String subSumandos=sumandos.substring(0, sumandos.length()-2);
        System.out.println(subSumandos+"="+suma);
    }
}       
        
//        System.out.print("Enter a whole number: ");
//        int number = lea.nextInt();
//
//        int sum = 0;
//        while (number!= 0) {
//            int digit = number % 10;
//            sum += digit;
//            number /= 10;
//        }
//
//        System.out.println("The sum of the digits is: " + sum);
    
