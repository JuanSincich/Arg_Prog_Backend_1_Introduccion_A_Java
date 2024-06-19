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
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, num1;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        System.out.println("Ingrese otro número");
        num1 = leer.nextInt();

        System.out.println("El resultado de la suma de los números ingresados es"+ (num + num1));
    }
}
