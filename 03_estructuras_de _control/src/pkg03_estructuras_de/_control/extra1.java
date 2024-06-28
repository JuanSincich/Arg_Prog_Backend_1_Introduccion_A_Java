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
public class extra1 {

    /**
     * Dado un tiempo en minutos, calcular su equivalente en días y horas.Por
 ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 equivalente: 1 día, 2 horas.
     * @param args
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese los minutos:");

        int input = leer.nextInt();

        int dias = input / (24 * 60);

        int horas = input % (24 * 60) / 60;

        int min = (input % (24 * 60) % 60);

        System.out.println("días: " + dias);
        System.out.println("horas: " + horas);
        System.out.println("min: " + min);

    }

}
