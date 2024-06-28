/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class extra4 {

    /**
     * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se
     * muestre su equivalente en romano.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un número entero positivo. \"\" para salir:");
        int num;

        do {
            num = leer.nextInt();

            while (num < 0 || num > 10) {
                System.out.println("Error.Ingrese un número entero positivo. \"0\" para salir:");
                num = leer.nextInt();
            }
            if (num != 0) {
                System.out.println(romano(num));
            } else {
                System.out.println("Muchas gracias.");
            }
        } while (num != 0);
    }

    public static String romano(int num) {

        switch (num) {
            case 1 -> {
                return "I";
            }
            case 2 -> {
                return "II";
            }
            case 3 -> {
                return "III";
            }
            case 4 -> {
                return "IV";
            }
            case 5 -> {
                return "V";
            }
            case 6 -> {
                return "VI";
            }
            case 7 -> {
                return "VII";
            }
            case 8 -> {
                return "VIII";
            }
            case 9 -> {
                return "IX";
            }
            case 10 -> {
                return "X";
            }
        }
        return null;
        

    }

}
