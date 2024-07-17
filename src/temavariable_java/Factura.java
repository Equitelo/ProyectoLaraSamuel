/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

/**
 *
 * @author user
 */

import java.util.Scanner;

public class Factura {
    public static void main(String[] args){
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        int porcentaje=0, porcentajeEdad=0, porcentajeTotal=0;
        double subtotal, descuento=0, descuentoCompra=0, descuentoTotal=0, impuesto, total;
        System.out.println("Ingresar edad: ");
        int edad=lea.nextInt();
        
        System.out.println("Ingresar un numero de factura: ");
        int numeroFactura=lea.nextInt();
        System.out.println("Ingresar producto: ");
        String nombreProducto=lea.next();
        System.out.println("Ingresar el precio: $. ");
        double precio=lea.nextDouble();
        System.out.println("Ingresar una cantidad: ");
        double cantidad=lea.nextDouble();
        
        /*
        1 - 15% dsct para las compras - desde 1500 a 3500 $
        2 - 30% dsct para las compras - desde superior de 3500 hasta 5589.99 $
        3 - 40% dsct para las compras superior a 5589.99 $
        
        Se necesita mostrar la salida de pantalla de los siguientes puntos:
        - ****FACTURA****
        
        Producto:
        Precio: $.
        Cantidad:
        Subtotal:
        ISV - 15%: $.
        Descuento %: $. Solo usar un print para descuento.
        Total: $.
        */
        
        subtotal=precio*cantidad;
        
        if (subtotal>=1500 && subtotal<=3500){
            descuentoCompra=0.15;
            porcentaje=15;
        }
        else if (subtotal>=3500 && subtotal <=5589.99){
            descuentoCompra=0.3;
            porcentaje=30;
                }
        else if (subtotal>=5589.99){
            descuentoCompra=0.4;
            porcentaje=40;
        }
        
        if (edad>=65){
            descuento=0.40;
            porcentajeEdad=40;
        }
        
        porcentajeTotal=porcentaje+porcentajeEdad;
        descuentoTotal=(descuento+descuentoCompra)*subtotal;
        impuesto=subtotal*0.15;
        total=subtotal+impuesto-descuentoTotal;
        
        System.out.println("*****FACTURA*****");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + precio);
        System.out.println("Edad: " + edad);
        System.out.println("Subtotal: $." + subtotal);
        System.out.println("ISV - 15%: $." + impuesto);
        System.out.println("Descuento: %" + porcentajeTotal + " " + "$." + descuentoTotal);
        System.out.println("Total: $." + total);
    }
}
