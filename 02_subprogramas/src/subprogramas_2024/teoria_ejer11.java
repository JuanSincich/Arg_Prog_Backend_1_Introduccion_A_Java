/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subprogramas_2024;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class teoria_ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frase:");
        String frase = leer.next();
        System.out.println(  cambio(frase));
       
    }
    public static String cambio (String frase){
        String fraseFinal = "";
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                case 'A':
                    fraseFinal += "@";                  
                    break;
                case 'e':
                case 'E':
                    fraseFinal += "#";                  
                    break;
                case 'i':
                case 'I':
                    fraseFinal += "$";                  
                    break;
                case 'o':
                case 'O':
                    fraseFinal += "%";                  
                    break;
                case 'u':
                case 'U':
                    fraseFinal += "*";                  
                    break;
                    
                default:
                    fraseFinal += frase.charAt(i);


            }
        }
        return fraseFinal;
        
    }
    
}
