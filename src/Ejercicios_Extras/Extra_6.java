
package Ejercicios_Extras;

import java.util.Scanner;


public class Extra_6 {
    /*
        6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
    debajo de 1.60 mts. y el promedio de estaturas en general.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas");
        double can = leer.nextInt();
       
        double debajoCont = 0, generalCont = 0, debajoSuma = 0, generalSuma = 0, promBajo, promGeneral;
        
        for (int i = 1; i <= can; i++) {
            
            System.out.println("Ingrese la altura de cada una");
            double altura = leer.nextInt();

            if (altura < 1.60){
               debajoCont += 1;
               debajoSuma = altura;

            }
            generalCont += 1;
            generalSuma += altura;
            
        }
            promBajo = debajoSuma / debajoCont;
            promGeneral = generalSuma / generalCont;
            
            System.out.println("El promedio de personas menor a 1.60 es de " +promBajo);
            System.out.println("El promedio en general es de "+promGeneral);
        
    }
    
}
