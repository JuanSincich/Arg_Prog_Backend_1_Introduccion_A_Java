/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_arreglos;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ejer4 {

    /**
     * Realizar un programa que rellene un matriz de size x size de valores aleatorios
     * y muestre la traspuesta de la matrizOriginal. La matriz traspuesta de una
     * matriz A se denota por B y se obtiene cambiando sus filas por columnas (o
     * viceversa).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int size = 3;

        int[][] matrizOriginal = new int[size][size];
        int[][] trasposicion = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrizOriginal[i][j] = random.nextInt(10);
                trasposicion[j][i] = matrizOriginal[i][j];
            }
        }
        
        System.out.println("Matriz original");
        imprimirMatriz(matrizOriginal, size);
        System.out.println("-------------");
        System.out.println("Matriz traspuesta");
        imprimirMatriz(trasposicion, size);
    }

    public static void imprimirMatriz(int[][] matriz, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
