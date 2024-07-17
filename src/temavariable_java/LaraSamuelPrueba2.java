package temavariable_java;

import java.util.Scanner;
import java.util.Random;

public class LaraSamuelPrueba2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        //Objeto Random
        Random aleatorio=new Random();
        int numerosA;
        int numerosB;
        
        //Ingresar desde el teclado
        System.out.println("Ingrese el tamanio del arreglo A: ");
        int tamanioA=lea.nextInt();
        int arregloA[]=new int[tamanioA];
        
        System.out.println("Ingrese el tamanio del arreglo B: ");
        int tamanioB=lea.nextInt();
        int arregloB[]=new int[tamanioB];
        
        for(int a=0;a<tamanioA;a++){
            numerosA=aleatorio.nextInt(1, 200);
            arregloA[a]=numerosA;
            int divisibleA=numerosA/2;
            if(divisibleA!=numerosA)
                System.out.println("El numero guardado en el aregloA; casilla["+a+"]: "+numerosA);
        }
        System.out.println(" ");
        for(int b=0;b<tamanioB;b++){
            numerosB=aleatorio.nextInt(1, 200);
            arregloB[b]=numerosB;
            int divisibleB=numerosB/2;
            if(divisibleB!=numerosB)
                System.out.println("El numero guardado en el aregloB; casilla["+b+"]: "+numerosB);
            while(arregloA[b]!=arregloB[b]){
                System.out.println(" ");
                System.out.println("Los numeros del arreglo A que no estan en el arreglo B: "+arregloB[b]);
                break;
            }
        }
    }
}
