
package ingswoct2018;

public class calculaFactorial {
   public static void main(String[]args){
       int factorial = 1;
       int numero = 5;
       while(numero != 0){
       factorial *= numero;
       numero--;
   }
    System.out.printf("El factorial es: %d\n", factorial);
   } 
}
