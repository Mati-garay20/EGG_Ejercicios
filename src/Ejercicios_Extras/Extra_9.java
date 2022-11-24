
package Ejercicios_Extras;

import java.util.Scanner;

public class Extra_9 {
    /*
    9. Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
    */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resta = 0, cont = 0;
        int num1, num2;
        
        System.out.println("Ingrese dos numeros enteros");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
        
          
           do{
            
            resta = num1 - num2;
            cont ++;
            
            }while(resta < num2);
           
            System.out.println("Los Números que se restan son " + num1 + " - " + num2);
            System.out.println("El residuo es " + resta);
            System.out.println("El cociente es " + cont);
        
    }
}
