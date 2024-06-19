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
public class ejer2 {

    /**
     *  Escribir un programa que pida tu nombre, 
        lo guarde en una variable y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa tu nombre completo:");
        String name = leer.next();
        System.out.println("Hola "+ name);

    }
    
}
