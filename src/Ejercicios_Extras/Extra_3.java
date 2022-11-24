
package Ejercicios_Extras;

import java.util.Scanner;

public class Extra_3 {
    /*
        3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          String letra;
          
        do{
            System.out.println("Ingrese una letra para determinar si es vocal");
                letra = leer.next();

            if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
                    letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){

                System.out.println(" ¡Perfecto, la letra es Vocal!");

            }else{
                System.out.println("- La letra no es vocal");
            }
        }while(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
                    letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u"));    
        
        
    }
}
