
package Vectores_Matrices;

import java.util.Scanner;
public class Ejercicio19 {
    
    public static void main(String[] args) {
       /* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
*/
       //0 -2 4 2 0 2 -4 -2 0
       Scanner leer = new Scanner(System.in);
       int matriz[][] = new int [3][3];
       int i, j;
       boolean ver= true;
       
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.println("Ingrese los números para llenar la matriz");
                matriz[i][j]= leer.nextInt();
            }
        }
        System.out.println("-- Muestra la Matriz --");
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
        System.out.println("-- Muestra la Matriz Traspuesta--");
        for ( j = 0; j < 3; j++) {
            for ( i = 0; i < 3; i++) {
                System.out.print("["+ matriz[i][j] +"]");
            }
            System.out.println("");
        }
        
        for ( i = 0; i < 3; i++) {
            for ( j = 0; j < 3; j++) {
                
                if (!(matriz[i][j] == -matriz[j][i])){
                       ver=false;
                
                }
            }
        }
        if (ver = true){
           System.out.println("- La matriz es anti simetrica"); 
        }else
            System.out.println("- La matriz no es anti simetrica");
        
    }
}
