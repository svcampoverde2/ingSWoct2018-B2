
package ingswoct2018;
import java.util.Scanner;
public class calculaFactorial {
   public static void main(String[]args){
       Scanner leer = new Scanner(System.in);
       int factorial = 1;
       System.out.printf("Ingrese un numero: ");
       int numero = leer.nextInt();
       while(numero != 0){
       factorial *= numero;
       numero--;
   }
    System.out.printf("El factorial es: %d\n", factorial);
   } 
}
