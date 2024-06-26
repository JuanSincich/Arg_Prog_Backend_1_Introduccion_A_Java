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
public class ejer4 {

    /**
     * Escriba un programa que pida una frase o palabra y valide 
     * si la primera letra de esa frase es una ‘A’. Si la primera 
     * letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
     * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
     * Nota: investigar la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println( "Ingrese una frase que empiece con la letra \"A\""  );
        
        String frase = leer.next();
     
        while (!frase.substring(0, 1).toUpperCase().equals("A")){
            System.out.println("Incorrecto. Ingrese una frase que empiece con la letra \"A\"" );
            frase = leer.next();
        }
        System.out.println("Correcto");
    }
    
}
