/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intro_java;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejer5 {

    /**
     * Escribir un programa que lea un número entero por 
     * teclado y muestre por pantalla el doble, el triple 
     * y la raíz cuadrada de ese número. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero positivo");
        int num = leer.nextInt();
        
        System.out.println("El doble de "+ num + " es " + (num+2));
        System.out.println("El triple de "+ num + " es " + (num*3));
        System.out.println("La raíz cuadrada de "+ num + " es " +Math.sqrt(num));
        
    }
    
}
