/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejer3 {

    /**
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1
     * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese tamaño del vector, puede tener hasta 5 dígitos:");
        int size = leer.nextInt();

        int[] vector = new int[size];

        String str;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(19999);
            str = String.valueOf(vector[i]);
            
            if (str.length()==1){
                d1++;
            }
            if (str.length()==2){
                d2++;
            }
            if (str.length()==3){
                d3++;
            }
            if (str.length()==4){
                d4++;
            }
            if (str.length()==5){
                d5++;
            }

        }
        
        System.out.println("Cantidad de números de un dígito: "+ d1);
        System.out.println("Cantidad de números de dos dígito: "+ d2);
        System.out.println("Cantidad de números de tres dígito: "+ d3);
        System.out.println("Cantidad de números de cuatro dígito: "+ d4);
        System.out.println("Cantidad de números de cinco dígito: "+ d5);

//        for (int i = 0; i < vector.length; i++) {
//            System.out.println(vector[i]);;
//        }
    }

}
