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
public class guia_ejer6 {

    /**
     * Implementar un programa que le pida dos números enteros al usuario y 
     * determine si ambos o alguno de ellos es mayor a 25.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese dos números enteros");
        
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if(num1 > 25 && num2 >25){
            System.out.println("Ambos números son mayores a 25");
        }else if ( num1>25 || num2 >25){
            System.out.println("Alguno de los números es mayor a 25");
        }else{
            System.out.println("Ningún número es mayor a 25");
        }
        
    }
    
}
