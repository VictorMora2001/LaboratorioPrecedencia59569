/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioprecedencia59569;

/**
 *
 * @author amigo
 */
public class LaboratorioPrecedencia59569 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera parte: Precedencia de Operadores
        double x = 9 + 10 / 2 * 6 % 2;
        System.out.println("El valor de x es: " + x);
        
        x = (9 + 10 / 2)*(6 % 2);
        System.out.println("El nuevo valor de x es: " + x);
        // Segunda parte - Ejercicios
        Scanner leer = new Scanner(System.in);
        
        x = 9 / 2 * 2;
        System.out.println("x = * / 2 * 2");
        System.out.println("¿Cuál es el valor de x?: ");
        leer.nextline();
        System.out.println("El valor de x es: " + x);
        boolean b = (6 * 6 > (5 +10) +20);
        System.out.println("b= (6 * 6 > (5+10) + 20)");
        System.out.println("¿Cuál es el valor de b? : ");
        leer.nextline();
        System.out.println("El valor de b es: " + b);
        
        int[] arreglo = {4 , 4};
        int i = 1;
        arreglo[i] = i = 0;
        System.out.println("arreglo = {4 , 4}");
        System.out.println("arrelgo[i] = i = 0 ");
        System.out.println("¿Qué posición del arreglo se modificó? " + "¿Y con qué valor?");
        leer.nextline();
        System.out.println("El arreglo quedó así: { " + arreglo[0] + "," + arreglo[1] + "}");
        b = ! (2 * (3 + 3) / 8 - 2 > 0) && (6 +(2 * 2) > (3 * 3));
        System.out.println("b = ! (2* (3 +3) / 8 - 2 > 0)" + "&& (6 + (2 * 2) > (3 * 3))");
        System.out.println("¿Cuál es el valor de b?: ");
        leer.nextline();
        System.out.println("El valor de b es: " + b);
     
     
    }
    
}
