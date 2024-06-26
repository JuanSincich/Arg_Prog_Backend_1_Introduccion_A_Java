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
public class ejer2 {

    /**
     * Crear un programa que pida una frase y si esa frase es igual a 
     * “eureka” el programa pondrá un mensaje de Correcto, sino mostrará 
     * un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println(" ingrese una palabra");
        
        String frase = leer.next();
     
        while (!frase.toLowerCase().equals("eureka")){
            System.out.println("Incorrecto.Ingrese una frase");
            frase = leer.next();
        }
        
        System.out.println("Correcto");
    }
    
}
