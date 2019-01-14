
package ingswoct2018;
import java.io.FileNotFoundException;
import java.util.Formatter;
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
        try{
           Formatter outArchivo = new Formatter("Los numeros de la serie.csv");
                 outArchivo.format("La serie es:\n");
                outArchivo.format("%d;",num1);
                outArchivo.format("%d;",num2);
        while (post <= tope) { 
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
            outArchivo.format("%d;",num2); 
           System.out.print(","+num2);
           post++;
        }
        outArchivo.close();
    }
        catch(FileNotFoundException e){
        System.out.println(e);    
        }
        System.out.println();
    }
}
