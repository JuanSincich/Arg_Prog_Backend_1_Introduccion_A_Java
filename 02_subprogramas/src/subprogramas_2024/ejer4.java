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
public class ejer4 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número
     * primo, debe devolver true si es primo, sino false. Un número primo es
     * aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es
     * primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
     *
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero natural:");
        int num = leer.nextInt();
        if(esPrimo(num)){
            System.out.println(num + " es primo");
        }else{
            System.out.println(num + " NO es primo");
        }
        
    }
    public static boolean esPrimo(int num){
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                return false;
            }            
        }
        return true;
        
    }
}
