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
public class ejer1 {

    /**
     * Crea una aplicación que le pida dos números al usuario y este pueda
     * elegir entre sumar, restar, multiplicar y dividir. La aplicación debe
     * tener una función para cada operación matemática y deben devolver sus
     * resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese 2 nuemros:");
        double num = leer.nextDouble();
        double num1 = leer.nextDouble();
        Operacion(num1, num1);
    }

    public static void Operacion(double num1, double num2) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;

        do {
            System.out.println("Ingrese la operación que desea realizar:\n"
                    + "S- Sumar\n"
                    + "R- Restar\n"
                    + "M- Multiplicar\n"
                    + "D- dividir\n"
                    + "X- Salir"
            );
            opc = leer.next();

            while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("R") && !opc.equalsIgnoreCase("M") && !opc.equalsIgnoreCase("D")&& !opc.equalsIgnoreCase("x") ){
                System.out.println("Opcion incorrecta o no valida. ingrese opcion nuevamente:");
                opc = leer.next();
            }

            switch (opc) {
                case "S":
                case "s":
                    System.out.println("resultado de la suma: " + (num1 + num2));
                    break;
                case "R":
                case "r":
                    System.out.println("resultado de la resta: " + (num1 - num2));
                    break;
                case "M":
                case "m":
                    System.out.println("resultado de la multiplicación: " + (num1 * num2));
                    break;
                case "D":
                case "d":
                    System.out.println("resultado de la división: " + (num1 / num2));
                    break;
                case "X":
                case "x":
                    System.out.println("Chau soret!");
                    break;

            }

        } while (!opc.equalsIgnoreCase("x"));

    }

}
