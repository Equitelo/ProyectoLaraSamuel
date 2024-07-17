/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package temavariable_java;

import java.util.Scanner;

public class EjercicioEnClaseWhile {
    
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in);
        lea.useDelimiter("\n");
        
        
        int cantidad, producto=0, ciclo=0;
        double subtotal=0, megaSubtotal=0, impuesto=0, precio, cantidadProducto;
        
        while(ciclo!=1){
        
            System.out.println("Cantidad de productos: ");
            cantidad=lea.nextInt();
            System.out.println(" ");

            if(cantidad>0){

                while(producto<cantidad){

                    producto=producto+1;
                    System.out.println("Producto #"+producto + ": ");
                    System.out.println("Ingresar nombre del producto: ");
                    String nombre=lea.next();

                    System.out.println("Ingresar precio: ");
                    precio=lea.nextDouble();

                    System.out.println("Ingresar cantidad de productos: ");
                    cantidadProducto=lea.nextDouble();

                    subtotal=cantidad*precio;
                    megaSubtotal=megaSubtotal+subtotal;

                    System.out.println("Nombre: "+nombre);
                    System.out.println("Precio: $."+precio);
                    System.out.println("Cantidad: "+cantidad);
                    System.out.println("Subtotal: $."+subtotal);

                    impuesto=megaSubtotal*0.15;
                    
                }
                
                System.out.println("Productos: ");
                System.out.println("Subtotal entre todo: $."+megaSubtotal);
                System.out.println("Impuesto-ISV: $."+impuesto);
                System.out.println("Total: $."+impuesto);
            }

            else{
                System.out.println("Ingresar un valor positivo.");
                System.out.println(" ");
            }
            
            System.out.println("ingresar 1 para cerrar sistema: ");
            ciclo=lea.nextInt();
            
        }
    }
}
