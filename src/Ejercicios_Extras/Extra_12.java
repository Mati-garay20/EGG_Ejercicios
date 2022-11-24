
package Ejercicios_Extras;


public class Extra_12 {
    /*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
    */
    public static void main(String[] args) {
        System.out.println("Mostrar números desde 0 a 9, reemplazando 3 por E");
        
        int a, b, c;
        String a3 , b3, c3, codigo;
        
        codigo = "";
        
        for ( a = 0; a < 10; a++) {
            for ( b = 0; b < 10; b++) {
                for ( c = 0; c < 10; c++) {
                    
                    a3 = String.valueOf(a);
                    b3 = String.valueOf(b);
                    c3 = String.valueOf(c);
                    
                    if (a3.equals("3")){
                        a3 = "E";
                    }
                    if (b3.equals("3")){
                        b3 = "E";
                    }
                    if (c3.equals("3")){
                        c3 = "E";
                    }
                    
                    codigo = "  " +a3+ "-" +b3+ "-" +c3;
                    System.out.println(codigo);
                    
                }
            }
            
        }
        
    }
}
