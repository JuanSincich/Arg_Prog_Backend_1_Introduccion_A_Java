/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

import java.util.Scanner;

/**
 *Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos que se 
 * trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y
 * permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
oSi el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
oSi el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
oSi el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
oSi el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
oSi no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
 * 
 */


public class guia_ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         System.out.println("Elija el motor con números del 1 al 4 ");
         System.out.println("1 - Motor A ");
         System.out.println("2 - Motor B ");
         System.out.println("3 - Motor C ");
         System.out.println("4 - Motor D ");
         
         int opc = leer.nextInt();
         
         while(opc<1 || opc>4){
             System.out.println("Error. Elija el motor con números del 1 al 4 ");
          opc = leer.nextInt();
         }
         
         switch (opc) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
        }
        
    }
    
}
