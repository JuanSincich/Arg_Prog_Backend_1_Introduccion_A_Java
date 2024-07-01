/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class guia_ejer14 {

    /**
     * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
     * compañeros de equipo
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
       String[] equipo = new String[5];
        System.out.println("Ingrese el nombre de sus ñeris");
        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = leer.next();
        }

        for (int i = 0; i < equipo.length; i++) {
            System.out.print("[" +equipo[i]+"]");
        }

    }

}
