
package ingswoct2018;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int temp;
        int post = 1;
        int tope = 0;
        
     //Pedimos al usuario que ingrese los numeros que desea visualizar
        System.out.print("Ingrese el numero de terminos fibonacci: ");
        tope = leer.nextInt();
        System.out.print(num1);
        post++;
        System.out.print(","+num2);
        post++;
        while (post <= tope) { 
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
           System.out.print(","+num2);
           post++;
        }
         System.out.println();
    }
}
