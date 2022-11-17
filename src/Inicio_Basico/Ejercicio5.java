
package Inicio_Basico;

import java.util.Scanner;

public class Ejercicio5 {
    /*
    Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        System.out.println("El Doble es: " + num *2); 
        System.out.println("El triple es: "+ num *3); 
        System.out.println("La raíz cuadrada es: " + Math.sqrt(num));
    }
}
