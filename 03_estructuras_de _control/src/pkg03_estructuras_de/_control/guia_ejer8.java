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
public class guia_ejer8 {

    /**
     * Escriba un programa que valide si una nota 
     * está entre 0 y 10, sino está entre 0 y 10 
     * la nota se pedirá de nuevo hasta que la nota 
     * sea correcta.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una nota entre 1 y 10");
        
        int num = leer.nextInt();
        
        while(num <1 || num>10){
            System.out.println("Error. Ingrese un número entre 1 y 10");
            num = leer.nextInt();
        }
        
        System.out.println("Ingresó el número " + num + ". ¡Muchas gracias!");
        
        
    }
    
}
