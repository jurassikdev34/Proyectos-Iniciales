/**
Ejercicio 1: Hacer un programa que lea un
* numero entero y muestre si el numero es
* multiplo de 10
 */
package cursojavabloque3.condicionales;

import javax.swing.JOptionPane;


public class Ejercicio1 {
    
    int pija;
    
    pija = JOptionPane.showInputDialog("numero")
    
    if(pija%10 == 0) { 
        JOptionPane.showMessageDialog(null,"El numero "+pija+" es multiplo de 10");
        
}
    else{
    JOptionPane.showMessageDialog(null, "El numero "+pija+" no es multiplo de 10");
}
    
}
