/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_arreglos;

/**
 *
 * @author Usuario
 */
public class ejer1 {

    /**
     * Realizar un algoritmo que llene un vector con los 100 
     * primeros números enteros y los muestre por pantalla en 
     * orden descendente.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[100];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i]= i + 1;
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] +"|" );      
        }
        
    }
    
}
