
package ingswoct2018;

import javax.swing.JOptionPane;

public class Practicas1 {

    
    public static void main(String[] args) {
        int año_actual, año_nacimiento,edad;
         año_actual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año Actual: "));
         año_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año que nacio: "));
        edad = año_actual - año_nacimiento;
         if(edad > 90 || edad < 0){
       JOptionPane.showMessageDialog(null," ingresae datos nuevamente:");
    }else {
        JOptionPane.showMessageDialog(null, "Su Edad es:" +edad);
         }
        System.out.print("Version 1.0");  
    }
    
}
