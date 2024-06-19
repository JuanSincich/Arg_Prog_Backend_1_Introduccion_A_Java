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
public class ejer2 {

    /**
     * Diseñe una función que pida el nombre y la edad de N personas e 
     * imprima los datos de las personas ingresadas por teclado e indique 
     * si son mayores o menores de edad. Después de cada persona, el programa 
     * debe preguntarle al usuario si quiere seguir mostrando personas y frenar 
     * cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc;
        do {            
            Persona();
            System.out.println("¿Desea seguir cargando datos. Responda S/N?");
            opc = leer.next();
            while(!opc.equalsIgnoreCase("s")&&!opc.equalsIgnoreCase("n") ){
                System.out.println("Ingreso inválido, ingrese S/N");
                opc = leer.next();
            }
        } while (opc.equalsIgnoreCase("s"));
        System.out.println("¡Muchas gracias!");
        
        
        
                   
    }
    public static void Persona(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre de la persona:");
        String name = leer.next();
        System.out.println("Ingrese edad de la persona:");
        int age = leer.nextInt();
        
        String adulto = "";
        if (age >= 18){
            adulto = "Es mayor de edad.";
        }else{ 
            adulto = "Es menor de edad.";
        }
        
        System.out.println("Nombre: "+ name);
        System.out.println("Edad: "+ age);
        System.out.println("Mayoría de edad: "+ adulto);
        
    }
}
