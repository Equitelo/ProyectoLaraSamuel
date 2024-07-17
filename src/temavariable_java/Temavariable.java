/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class Temavariable {

    /*
    Variable: contenedor de datos
     */
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        
        lea.useDelimiter("\n");
        
        double pago=0, pagoAdicional=0, pagoFinal=0;
        
        System.out.println("Ingresar su nombre completo: ");
        String nombre=lea.next();
        
        System.out.println("Ingresar horas trabajadas: ");
        int hora=lea.nextInt();
        
        System.out.println("Ingresar horas extra: ");
        int extra=lea.nextInt();
        
        if (hora<=40){
            pago=hora*55.99;
        }
        
        else{
            System.out.println("No esta dentro de las horas laborales.");
        }
        
        if (extra<=20){
            pagoAdicional=extra*55.99;
        }        
        
        else{
            System.out.println("Superas el limite de horas extra.");
        }
        
        pagoFinal=pagoAdicional+pago;
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Tu pago laboral es de : $." + pago);
        System.out.println("Tu pago extra es de : $." + pagoAdicional);
        System.out.println("La suma de tus pagos es de: $." + pagoFinal);
        
    }
    
}
