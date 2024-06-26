/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

import java.util.Scanner;

/**
 *
 * Realizar un programa que solo permita introducir solo frases o 
 * palabras de 8 de largo. Si el usuario ingresa una frase o palabra 
 * de 8 de largo se deberá de imprimir un mensaje por pantalla que diga 
 * “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
 * Nota: investigar la función Lenght() en Java.
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println(" Ingrese una palabra de 8 caracteres");
        
        String frase = leer.next();
     
        while (frase.length()!=8){
            System.out.println("Incorrecto. Ingrese una palabra de 8 caracteres");
            frase = leer.next();
        }
        
        System.out.println("Correcto");
    }
    
}
