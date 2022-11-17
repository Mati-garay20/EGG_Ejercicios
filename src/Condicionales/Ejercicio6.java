
package Condicionales;
import java.util.Scanner;
public class Ejercicio6 {
    /*
    Crear un programa que dado un numero determine si es par o impar.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        
        if (num%2==0) {
              System.out.println("Es un número par");
            
        }else{
            System.out.println("Es un número impar");
        }
            
          
    }
}
