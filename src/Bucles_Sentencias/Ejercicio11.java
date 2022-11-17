
package Bucles_Sentencias;
import java.util.Scanner;
public class Ejercicio11 {
    /*
    Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:

        MENU
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Salir
        Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números enteros");
        int num1, num2;
               num1=leer.nextInt();
               num2=leer.nextInt();
        String salida = " ";
        int opcion = 0;
                
        do{
            System.out.println("-- MENU --");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion= leer.nextInt();
            switch (opcion){ 

                case 1: 
                    System.out.println("La suma de los números es: "+ (num1+num2) );
                    break;
                case 2:
                    System.out.println("La resta de los números es: "+ (num1-num2));
                    break;
                case 3: 
                    System.out.println("La multiplicación de los números"+ (num1*num2));
                    break;
                case 4: 
                    System.out.println("La division de los números es: "+ (num1/num2));
                    break;
                case 5:
                    System.out.println("¿Quiere salir del programa? (S/N)");
                    salida= leer.next();
                    break;
                default:
                    System.out.println("Opcion Incorrecta, intente de nuevo!!");
            }
         }while ((salida.equals("N")) && (opcion  >= 1 || opcion <= 5 ));
                
    }
}
