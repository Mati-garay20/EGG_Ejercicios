
package Vectores_Matrices;

import java.util.Scanner;


public class Ejercicio20 {
    
    public static void main(String[] args) {
        /*
            20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.
        */
        
        Scanner leer = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        
        int diagon1 = 0, diagon2 = 0, sumacol = 0, sumafil = 0, sumaant = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                 System.out.println("Ingrese números del 1-9 para crear una matríz mágica");
               matriz[i][j] = leer.nextInt();  
                                                  
                    sumafil += matriz[i][j];
                    
                     if(i==j){   
                     diagon1 +=  matriz[i][j];      
                     }  if(j==(2-i)){                    
                        diagon2 += matriz[i][j];     
                                    
                 }
            }
            if(i == 0){
                sumaant = sumafil;
            }else{
               if(sumaant != sumafil){
                   sumaant = 0;
               } 
            }
             sumafil = 0;     
        }
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {   
                sumacol += matriz[i][j];    
            }  
            if(sumaant != sumacol){
                sumaant = 0;
            }  
            sumacol = 0;
        }
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                 System.out.print("[ " + matriz[i][j] + " ]" );
                    
            }
            System.out.println("");     
        }
       
        if((diagon1==diagon2) && (diagon1 == sumaant)){
            System.out.println("El cubo es mágico!!");
        } else{
            System.out.println("Volver a intentar");
        }
    
    }     
     
}
/*
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz[][]= new int[3][3];
        int[] cuadrado = new int [8];
        boolean confirmar = true;
        //3 f
        //3 c
        //2 d
        int num;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("["+i+"]"+"["+j+"]: ");  
                    num = leer.nextInt();
                } while (num>9 || num<1);
                //FILAS del 0 -2
                cuadrado[i] += num;  
                //COLUMNAS del 3 - 5
                cuadrado[j+3] += num;
                //DIAGONALES 6 y 7
                if(i==j){
                    cuadrado[6]+=num;
                }
                if(j==(2-i)){
                    cuadrado[7]+=num;
                }
            }
        }
        //15 15 15 15 15 15 15 15 15
        num = cuadrado[0];
        for (int i = 1; i < 8; i++) {
            System.out.print(cuadrado[i]+" ");
            if(num!=cuadrado[i]){
                confirmar = false;
                break;
            }
        }
        if(confirmar){
            System.out.println("Es mágico");
        }else{
            System.out.println("No es mágico");
        }        
    }
*/