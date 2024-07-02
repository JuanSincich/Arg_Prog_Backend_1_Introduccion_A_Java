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
    private static final  Scanner leer = new Scanner(System.in);
public static void main(String[] args) {
                 
        System.out.println("Ingrese el tamaño de la matriz (n x n):");
        int n = leer.nextInt();
        
        int[][] matriz = new int[n][n];
        int[][] traspuesta = new int[n][n];
        System.out.println("Ingrese los elementos de la matriz:");
        
        cargarMatrices(matriz, traspuesta);
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
        System.out.println("Matriz negativa");
        matrizNegativa(traspuesta);
        
        // Verificar antisimetría
        if (esAntisimetrica(matriz, traspuesta)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }

    public static void cargarMatrices(int [][] matriz, int [][] traspuesta){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < traspuesta.length; j++) {
                matriz[i][j] = leer.nextInt();
                traspuesta[j][i] = matriz [i][j];
            }
        }
    }
    
    // Método para mostrar una matriz
    private static void mostrarMatriz(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    // metodo para ver una matriz cambiada de signo
    public static void matrizNegativa(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = -matriz[i][j];
            }
            
        }      
//  Aquí imprimo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Método para verificar si una matriz es antisimétrica
    private static boolean esAntisimetrica(int[][] matriz, int[][] traspuesta) {
              int n= matriz.length;  
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != -traspuesta[j][i]) {
                    return false;
                }
            }
        }     
        return true;
    }
    
}