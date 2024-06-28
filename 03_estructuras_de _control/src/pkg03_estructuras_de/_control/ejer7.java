/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg03_estructuras_de._control;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejer7 {

    /**
     *Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
     * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
     * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
     * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
* especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
* distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
* correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
* cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
     */
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        
        String frase;
        
        do {
            System.out.println("Ingrese cadena:");
         frase = leer.next();
         if("&&&&&".equals(frase)){
             System.out.println("Muchas gracias");
             break;
         }else if (frase.length()==5 && "x".equals(frase.substring(0, 1).toLowerCase())&& "o".equals(frase.substring(4,5 ).toLowerCase())){
             System.out.println("Correcto"); 
         }else {
             System.out.println("Incorrecto");
         }
         
        } while (true);
        
        
        
    }
    
}
