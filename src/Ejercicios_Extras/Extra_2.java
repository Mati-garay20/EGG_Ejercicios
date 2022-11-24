
package Ejercicios_Extras;


public class Extra_2 {
    /*
        2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
    tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    */
    
    public static void main(String[] args) {
        
        int A=22, B=30, C=11, D=4;
        int ayudin;
        
        System.out.println("Los números alacenados son: ");
        System.out.println("A=" +A+ " B="+B+ " C="+C+ " D="+D);
        
        ayudin=B;
            B=C;
            C=A;
            A=D;
            D=ayudin;
            
            
        System.out.println("Vamos a cambiarlos de lugar");
        System.out.println("A=" +A+ " B="+B+ " C="+C+ " D="+D);
        
    }
}
