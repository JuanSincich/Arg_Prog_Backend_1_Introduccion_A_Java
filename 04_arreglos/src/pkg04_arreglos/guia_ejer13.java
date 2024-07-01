/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg04_arreglos;

/**
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de equipo
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus
 * nombres más adelante.
 *
 * @author Usuario
 */
public class guia_ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] equipo = new int[5];

        for (int i = 0; i < equipo.length; i++) {
            equipo[i] = 2 + i;
        }

        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);
        }

//        System.out.println("");
//        System.out.println("matriz");
//        System.out.println("");
//        int[][] matriz = new int[5][5];
//        int val = 0;
//        for (int i = 0; i < matriz.length; i++) {
//            
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = val++;
//            }
//            
//        }
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz[i].length; j++) {
//                System.out.print(matriz[i][j] + "/");
//            }
//            System.out.println("");
//        }

    }

}
