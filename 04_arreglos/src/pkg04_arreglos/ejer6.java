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
public class ejer6 {

    /**
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al
     * 9 donde la suma de sus filas, sus columnas y sus diagonales son
     * idénticas. Crear un programa que permita introducir un cuadrado por
     * teclado y determine si este cuadrado es mágico o no. El programa deberá
     * comprobar que los números introducidos son correctos, es decir, están
     * entre el 1 y el 9.
     *
     * @param args the command line arguments
     */
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        int[][] cuadrado = new int[3][3];

        cargarCuadrado(cuadrado);
        imprimirCuadrado(cuadrado);

        // Calculamos suma magica
        int sumaDiagonal = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        System.out.println(sumaDiagonal);
        
        verificación(cuadrado, sumaDiagonal);
        
    }
    // Cargamos el cuadrado con valores
    public static void cargarCuadrado(int[][] matriz) {
        System.out.println("Ingrese valores al cuadrado");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
    }
    // Imprimimos
    public static void imprimirCuadrado(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    // Comprobamos sumas de columna y fila
    public static void verificación(int [][] matriz, int diagonal){
        boolean esMagico = true;
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < 3; i++) {
            fila = 0;
            columna = 0;
            for (int j = 0; j < 3; j++) {
                fila += matriz [i][j];
                columna += matriz [j][i];
            }
            
        }
        if(fila == diagonal && columna == diagonal){
            System.out.println("es magico");
        }else {
            System.out.println("No es mágico");
        }
    }
}
//4 9 2
//3 5 7
//8 1 6

//8 1 6
//3 5 7
//4 9 2

//4 5 0 
//4 9 4 
//1 3 2 