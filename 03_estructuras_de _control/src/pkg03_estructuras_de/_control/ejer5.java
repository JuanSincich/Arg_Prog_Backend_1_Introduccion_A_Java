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
public class ejer5 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario hasta que la suma de los 
     * números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un número límite de 4 dígitos:");
        int limit = leer.nextInt();
        int sum = 0;
        int num;
        System.out.println("Ingrese números hasta que la suma de estos supere el límite ingresado");
        do {
            num = leer.nextInt();
            sum += num;
            
            if (sum <= limit){
                System.out.println("Ingrese otro número");
            }
            
        } while (sum <=limit);
        
        System.out.println("la suma total de los números ingresados es " + sum);
    }
    
}
