
package Ejercicios_Extras;

import java.util.Scanner;


public class Extra_23 {
    /*
    23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
    */
    
    public static void main(String[] args) {
        
       // String vector [] = new String [5];
        Scanner leer = new Scanner(System.in);
        String palabra;
        
        do{
            
        System.out.println("Ingrese 5 palabras, minimo de 3 y maximo 5 caracteres");
            palabra = leer.next();
            
        }while(palabra.length()<3 || palabra.length()>5 );
        
    }
}
