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
public class ejer6 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y
     * muestre por pantalla el siguiente menú:El usuario deberá elegir una
     * opción y el programa deberá mostrar el resultado por pantalla y luego
     * volver al menú. El programa deberá ejecutarse hasta que se elija la
     * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
     * vez de salir del programa directamente, se debe mostrar el siguiente
     * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
     * Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
     * contrario se vuelve a mostrar el menú.
     */
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.println("Ingrese dos números positivos");
        double num = checkNum(leer.nextDouble());
        double num1 = checkNum(leer.nextDouble());

        menú(num, num1);
    }

    public static void menú(double num, double num1) {
        int opc;

        do {
            System.out.println("Elija la opción que desea realizar:");
            System.out.println("1- Sumar números");
            System.out.println("2- Restar números");
            System.out.println("3- Multiplicar números");
            System.out.println("4- Dividir números");
            System.out.println("5- Salir");

            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma de " + num + " y " + num1 + " es " + (num + num1));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("La resta de " + num + " y " + num1 + " es " + (num - num1));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(num + " multiplicado por " + num1 + " es " + (num * num1));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(num + " dividido " + num1 + " es " + (num / num1));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Muchas gracias");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingreso incorrecto");
                    System.out.println("");
                    ;
            }

        } while (opc != 5);

    }

    public static double checkNum(double num) {

        while (num <= 0) {
            System.out.println("Error, el número ingresado no es positivo. Ingrese nuevamente");
            num = leer.nextDouble();
        }
        return num;

    }

}
