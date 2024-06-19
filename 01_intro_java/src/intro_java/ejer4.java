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
public class ejer4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar
     * su equivalente en grados Fahrenheit. La fórmula 
     * correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" Ingrese la temperatura en gardos Celcius:");
        double temp = leer.nextDouble();
        System.out.println("La temperatura en grados Fahrenheit es "+ (32 + (9 * temp / 5)));
    }
    
}
