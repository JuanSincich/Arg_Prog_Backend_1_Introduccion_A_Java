/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

/**
 *
 * @author Usuario
 */
public class ejer8 {

    /**
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
     * Por ejemplo, si el cuadrado tiene 4 elementos por lado se 
     * deberá dibujar lo siguiente:
        * * * *
        *     *
        *     *
        * * * *

     */
    public static void main(String[] args) {
       String x = "*";
       
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3){
                    System.out.print(x);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
