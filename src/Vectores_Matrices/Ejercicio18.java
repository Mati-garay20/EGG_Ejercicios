
package Vectores_Matrices;

import java.util.Scanner;

public class Ejercicio18 {
    /*
    Realizar un programa que rellene una matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
    
    */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int matriz[][]= new int [4][4];
        int i,j;
        
        System.out.println("Matriz original");
        for ( i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                
                matriz[i][j]= (int)(Math.random()*10);
                System.out.print("["+ matriz[i][j] +"]");
                
            }
            System.out.println("");
        }
        
        System.out.println("Matriz Traspuesta");
        for ( j = 0; j < 4; j++) {
            for ( i = 0; i < 4; i++) {
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
        
    }
}
