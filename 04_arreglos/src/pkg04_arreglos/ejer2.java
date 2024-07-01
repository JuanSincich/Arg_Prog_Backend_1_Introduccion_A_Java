/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejer2 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N 
     * con valores aleatorios y le pida al usuario un número 
     * a buscar en el vector. El programa mostrará dónde se 
     * encuentra el numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese tamaño del vector:");
        int size = leer.nextInt();       
        int[] vector = new int[size];
       
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]+ "| ");
        }
        
        System.out.println("Ingrese número a buscar en el vector:");
        int search = leer.nextInt();
        boolean tobe = false;
        int count = 0;
        
        
        for (int i = 0; i < vector.length; i++) {
            if (search == vector[i]){
                System.out.println("Número encontrado");
                tobe = true;
                break;
            }       
        }
        for (int i = 0; i < vector.length; i++) {
            if (search == vector[i]){
                count++;
            }       
        }      
        if(tobe == false){
            System.out.println("El número ingresado no existe en el vector.");
        }else{
            System.out.println("El número se repite " + count + " veces.");
        }
    }
    
}
