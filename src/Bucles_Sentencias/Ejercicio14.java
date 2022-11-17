
package Bucles_Sentencias;

import java.util.Scanner;


public class Ejercicio14 {
   /*
    Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
    */ 
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros que quiere convertir");
        float euro = leer.nextFloat();
        
        cambio(euro);
                
                
    }
    public static void cambio(float euro){
        
        System.out.println("El valor de Euro a Libras es: "+ (euro * 0.86));
        System.out.println("El valor en dolares es: $"+ (euro * 1.28611));
        System.out.println("El valor en Yenes es: "+ (euro * 129.852));
        
    }
}
