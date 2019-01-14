
package ingswoct2018;
import java.util.Scanner;
import java.util.Formatter;
import java.io.FileNotFoundException;
public class calculaFactorial {
   public static void main(String[]args){
       Scanner leer = new Scanner(System.in);
       int factorial = 1;
       try{
       Formatter outArchivo = new Formatter("Mostrar factorial.csv");    
       outArchivo.format("numero;factorial\n");
       System.out.printf("Ingrese un numero: ");
       int numero = leer.nextInt();
       outArchivo.format("%d;",numero );
       while(numero != 0){
       factorial *= numero;
       numero--;
   }
    System.out.printf("El factorial es: %d\n", factorial);
    outArchivo.format("%d",factorial);
     outArchivo.close();
       }catch(FileNotFoundException e){
      System.out.print(e);
       }
   }  
}
