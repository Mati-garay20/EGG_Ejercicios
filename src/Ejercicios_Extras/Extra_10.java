
package Ejercicios_Extras;

import java.util.Scanner;

public class Extra_10 {
    /*
    10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int multi = num1*num2;
        int ingreso;
        
        do{
            
            System.out.println("Ingrese un número para adivinar si es correcto");
            ingreso = leer.nextInt();
            
            if(ingreso == multi) {
                System.out.println("El número " + ingreso + " es igual a la multiplicación de los números aleatorios");
            }else{
                System.out.println("¡El número " + ingreso + " no es igual a la multiplicación! "+ multi);
                System.out.println("- Intente nuevamente -");
               
            }
            
        }while (ingreso != multi);
        
    }
}
  