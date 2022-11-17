
package Vectores_Matrices;

import java.util.Scanner;

public class Ejercicio16 {
    /*
    Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
    */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        double vector[]= new double[tam];
        int cont=0;
        int i,j;
        
        for (i = 0; i < tam; i++) {
            
            vector[i]=Math.floor(Math.random()*10);
        }
        
          System.out.println("Ingrese un número a buscar");
          int buscar = leer.nextInt();
        j=0;
        for (i = 0; i < tam; i++) {
            if (vector[i]==buscar ) {
                cont +=1;
                j=i;    
            }
          
        }
        System.out.println("El número se encuentra en la posición "+ j + " y la cantidad de veces que se repite es "+ cont);
       
        for (i = 0; i < tam; i++){
            System.out.println("["+vector[i]+"]");
        }
        
    }
    
}
