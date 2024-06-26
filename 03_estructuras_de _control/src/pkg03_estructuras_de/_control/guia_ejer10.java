/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia_ejer10 {

    /**
     * Realizar un programa que lea 4 números (comprendidos
     * entre 1 y 20) e imprima el número ingresado seguido de 
     * tantos asteriscos como indique su valor. 
     */
    
    //creamos un OBJETO scanner global para todas las funciones
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {  
//      Solicitamos los números y comprobamos que no sean <1 y >20
        System.out.println("Ingrese 4 números entre 1 y 20");
       double num1 = checkNum(leer.nextDouble());
       double num2 = checkNum(leer.nextDouble());
       double num3 = checkNum(leer.nextDouble());
       double num4 = checkNum(leer.nextDouble());

//      Llamamos al método que va a imprimir los asteriscos
//      enviandole como argumentos el numero 
        asterikGenerator(num1);
        asterikGenerator(num2);
        asterikGenerator(num3);
        asterikGenerator(num4);
         
    }
    //creamos método para comprobar que los números ingresados son correctos
    public static double checkNum(double num){
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        while (num < 1 || num>20   ){
            System.out.println("Error. Ingrese nuevamente un número entre 1 y 20 ");
            num = leer.nextDouble();
        }
        
        return num;
            
    }
//  Creamos el método que imprime los asteriscos
    public static void asterikGenerator(double num){
        for (double i = 0; i < num; i++) {   
            System.out.print("*" );
            
        }
        System.out.println("");
    }
}
