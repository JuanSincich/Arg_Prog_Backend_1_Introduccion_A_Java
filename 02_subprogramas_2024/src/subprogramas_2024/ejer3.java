/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subprogramas_2024;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejer3 {

    /**
     * Crea una aplicación que a través de una función nos convierta una
     * cantidad de euros introducida por teclado a otra moneda, estas pueden ser
     * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad
     * de euros y la moneda a convertir que será una cadena, este no devolverá
     * ningún valor y mostrará un mensaje indicando el cambio (void).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de euros a convertir:");
        int euros = leer.nextInt();
        System.out.println("Ingrese el tipo de cambio que desea realizar:\n"
                + "1- Dólar\n"
                + "2- Yen\n"
                + "3- Libra esterlina");
        int change = leer.nextInt();
        while (change != 1 && change != 2 && change != 3) {
            System.out.println("Ingreso inválido. Ingrese 1,2 o 3:");
            change = leer.nextInt();
        }
        change(euros, change);

    }

    public static void change(int euros, int change) {
        switch (change) {
            case 1:
                System.out.println("Cambio en dolares: " + (1.28611 * euros));
                break;
            case 2:
                System.out.println("Cambio en yenes: " + (129.852 * euros));
                break;
            case 3:
                System.out.println("Cambio en libras esterlinas: " + (0.86 * euros));
                break;
            default:
                throw new AssertionError();
        }

    }

}
