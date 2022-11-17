package Inicio_Basico;

import java.util.Scanner;
public class Ejercicio4 {
    /*
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
    Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            float centigrados, farenheit;
        System.out.println("Ingrese la temperatura en centigrados");
        centigrados = leer.nextFloat();
        farenheit = 32 + (9 * centigrados / 5);
        System.out.println("La temperatura ingresa es " + farenheit + " farenheit");
        }
}

    
// Hacer de nuevo
