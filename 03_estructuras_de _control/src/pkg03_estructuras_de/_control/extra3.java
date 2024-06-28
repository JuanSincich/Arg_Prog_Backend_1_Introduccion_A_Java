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
public class extra3 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese una letra y 
     * se detecte si se trata de una vocal. Caso contrario mostrar 
     * un mensaje. Nota: investigar la función equals() 
     * de la clase String.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una letra:");
        String letra = leer.next();
        
        if (letra.toLowerCase().equals("a")||letra.toLowerCase().equals("e")||letra.toLowerCase().equals("i")||letra.toLowerCase().equals("o")||letra.toLowerCase().equals("u")){
            System.out.println(letra + " es una vocal");
        }else{
            System.out.println(letra + " NO es una vocal");
        }
    }
    
}
