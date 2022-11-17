
package Vectores_Matrices;

import java.util.Scanner;

public class Ejercicio17 {
    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
    */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int vector[]= new int [tam];
        int cont1, cont2, cont3, cont4, cont5;
        int i;
        String j;
        
        cont1= 0;
        cont2= 0;
        cont3= 0;
        cont4= 0;
        cont5= 0;
        
        for ( i = 0; i < tam; i++) {
            
            System.out.println("Ingrese números entre 1 y 5 digitos");
            vector[i]= leer.nextInt();
           
            
            j = String.valueOf(vector[i]);
          switch(j.length()){
              
            case 1:
                  cont1 += 1;
                  break;
            case 2:
                cont2 += 1;
                break;
            case 3:
                cont3 += 1;
                break;
            case 4:
                cont4 += 1;
                break;
            case 5:
                cont5 += 1;
                break;
            default:
                System.out.println("El número ingresado supera el limite");
                break;
          }
        }        
        
        System.out.println("- Los números de un digito son: "+ cont1);
        System.out.println("- Los números de dos digitos son: "+ cont2);
        System.out.println("- Los números de tres digitos son: "+ cont3);
        System.out.println("- Los números de cuatro digitos son: "+ cont4);
        System.out.println("- Los números de cirnco digitos son:"+ cont5);
        
    }
    
}
