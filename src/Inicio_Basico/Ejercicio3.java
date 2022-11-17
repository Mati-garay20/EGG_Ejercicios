
package Inicio_Basico;
import java.util.Scanner;
public class Ejercicio3 {
    /*
    Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
    en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String frase, fraseMin, fraseMay;
        System.out.println("Ingrese una frase:");
            frase = leer.nextLine();
            fraseMin = frase.toLowerCase();
            fraseMay = frase.toUpperCase();
        System.out.println(fraseMin);
        System.out.println(fraseMay);

    }
}
