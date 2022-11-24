
package Ejercicios_Extras;

import java.util.Scanner;
public class Extra_1 {
    /*
        1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
    usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String elegir;
        int hora = 60;
        int dia = 1440;
        
        do{
            
        System.out.println("Ingrese la cantidad de minutos a calcular");
        int minuto = leer.nextInt();
       
        
        System.out.println("- En horas: " +minuto/hora);
        System.out.println("- En días: " +minuto/dia);
        System.out.println("¿Quiere continuar? (si - no)");
            elegir = leer.next();
            
        }while(!elegir.equals("no"));
        
        System.out.println(" Gracias por utilizar el programa!!");
    }
}
