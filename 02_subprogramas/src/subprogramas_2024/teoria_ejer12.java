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
public class teoria_ejer12 {

    /**
     * Crea un procedimiento EsMultiplo que reciba los 
     * dos números pasados por el usuario, validando que 
     * el primer número múltiplo del segundo e imprima si 
     * el primer número es múltiplo del segundo, sino 
     * informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros enteros positivos:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
        
        
    }
    public static void EsMultiplo(int num1, int num2){
        if (num1%num2 == 0){
            System.out.println(num1 + " es multiplo de " + num2);
        } else{
            System.out.println(num1 + " NO es multiplo de " + num2);
        }
    }
}
