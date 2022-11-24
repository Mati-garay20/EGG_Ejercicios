
package Ejercicios_Extras;

import java.util.Scanner;

public class Extra_4 {
    /*
        4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ingrese un número entre 1 y 10");
                num = leer.nextInt();
            
                switch(num){
                    case 1: 
                        System.out.println(" 1 es I en romano");
                        break;
                    case 2:
                        System.out.println(" 2 es II en romano");
                        break;
                    case 3:
                        System.out.println(" 3 es III en romano");
                        break;
                    case 4:
                        System.out.println(" 4 es IV en romano");
                        break;
                    case 5:
                        System.out.println(" 5 es V en romano");
                       break;
                    case 6:
                        System.out.println(" 6 es VI en romano ");
                        break;
                    case 7:
                        System.out.println(" 7 es VII en romano");
                        break;
                    case 8:
                        System.out.println(" 8 es VIII en romano");
                        break;
                    case 9:
                        System.out.println(" 9 es IX en romano");
                        break;
                    case 10:    
                        System.out.println(" 10 es X en romano");
                        break;
                    default:
                        System.out.println("-- El número esta fuera del límite --");
                }
                
        }while(num<10);
        
        
    }
}
