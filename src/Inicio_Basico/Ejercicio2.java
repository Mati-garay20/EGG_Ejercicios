package Inicio_Basico;

import java.util.Scanner;
        
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        
        System.out.println("Hola Mundo mi Nombre es "+ nombre);
        System.out.println("¡Gracias por utilizar el programa! ");
        
    }
    
}