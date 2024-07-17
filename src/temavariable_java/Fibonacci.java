/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int n = leer.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print("Serie de Fibonacci: ");

        if (n >= 1) {
            System.out.print(fib1 + " ");
        }
        if (n >= 2) {
            System.out.print(fib2 + " ");
        }

        for (int i = 3; i <= n; i++) {
            int fibN = fib1 + fib2;
            System.out.print(fibN + " ");
            fib1 = fib2;
            fib2 = fibN;
        }
    
        
    }
}
