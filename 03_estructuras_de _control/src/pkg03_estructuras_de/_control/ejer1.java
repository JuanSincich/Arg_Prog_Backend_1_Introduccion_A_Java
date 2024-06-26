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
public class ejer1 {

    /**
     * Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int num;

        do {
            System.out.println("Ingrese un número entero:");
            num = leer.nextInt();
            if(num ==0){
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num + " Es un número par");
            } else {
                System.out.println(num + " Es un número impar");
            }
        } while (num != 0);
        System.out.println("Muchas gracias");
    }

}
