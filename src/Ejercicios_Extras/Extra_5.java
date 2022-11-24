
package Ejercicios_Extras;

import java.util.Scanner;

public class Extra_5 {
    /*
        Una obra social tiene tres clases de socios:
    - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
    todos los tipos de tratamientos.
    - Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
    los mismos tratamientos que los socios del tipo A.
    - Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
    tratamientos.
    - Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
    real que represente el costo del tratamiento (previo al descuento) y determine el
    importe en efectivo a pagar por dicho socio.
    */
    
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese una letra para elegir que tipo de socio es");
        System.out.println(" Tipo A - Tipo B - Tipo C ");
        String letra = leer.next();
        
        System.out.println("Ingrese el valor del tratamiento");
        int valor = leer.nextInt();
        
        if (letra.equalsIgnoreCase("a") ){
        
            System.out.println("- Los de Tipo A su descuento es del 50% ");
            System.out.println("Precio Final: $"+(valor/2) );
        }
        
        if (letra.equalsIgnoreCase("b")){
            
            System.out.println("- Los de tipo B su descuento es del 35% ");
            System.out.println("Precio Final: $"+(valor-(valor*35/100)));
        }
        
        if (letra.equalsIgnoreCase("c")){
            System.out.println("- Los de Tipo C no tienen descuentos. ");
            System.out.println("Precio Final: $"+valor);
            
        }
        
    }
    
}
