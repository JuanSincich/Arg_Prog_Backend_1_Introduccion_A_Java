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
public class ejer3 {

    /**
     * Escribir un programa que pida una frase
     * y la muestre toda en mayúsculas y después toda en minúsculas. 
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa una frase");
        String frase = leer.next();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
