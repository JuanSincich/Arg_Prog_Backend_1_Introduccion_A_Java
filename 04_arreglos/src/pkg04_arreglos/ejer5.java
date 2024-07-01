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
public class ejer5 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Solicitar tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz (n x n):");
        int n = leer.nextInt();
        
        // Crear y llenar la matriz
        int[][] matriz = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        
        // Mostrar la matriz ingresada
        System.out.println("Matriz ingresada:");
        mostrarMatriz(matriz);
        
        // Calcular la traspuesta
        int[][] traspuesta = obtenerTraspuesta(matriz);
        
        // Verificar antisimetría
        if (esAntisimetrica(matriz, traspuesta)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
    // Método para mostrar una matriz
    private static void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Método para obtener la traspuesta de una matriz
    private static int[][] obtenerTraspuesta(int[][] matriz) {
        int n = matriz.length;
        int[][] traspuesta = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        return traspuesta;
    }
    
    // Método para verificar si una matriz es antisimétrica
    private static boolean esAntisimetrica(int[][] matriz, int[][] traspuesta) {
        int n = matriz.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -traspuesta[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
