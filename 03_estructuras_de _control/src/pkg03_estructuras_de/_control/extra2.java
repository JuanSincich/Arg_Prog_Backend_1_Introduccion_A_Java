/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

/**
 *
 * @author Usuario
 */
public class extra2 {

    /**
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor
     * diferente a cada una. A continuación, realizar las instrucciones
     * necesarias para que: B tome el valor de C, C tome el valor de A, A tome
     * el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
     * valores finales de cada variable. Utilizar sólo una variable auxiliar.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;  //4
        int b = 2;  //3
        int c = 3;  //1
        int d = 4;  //2
        int i = b;
       
        System.out.println("b = " + (b = c));
        System.out.println("c = " +(c = a));
        System.out.println("a = " +(a = d));
        System.out.println("d = " +(d = i));
       
    }

}
