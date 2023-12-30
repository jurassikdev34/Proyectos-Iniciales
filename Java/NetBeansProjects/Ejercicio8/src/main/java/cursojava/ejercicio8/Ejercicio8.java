/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cursojava.ejercicio8;

/**
 *
 * @author Alejandro
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double a,b,c,resultado1,resultado2;
        
        System.out.println("Digite el valor de a");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b");
        b = entrada.nextDouble();
        System.out.println("Digite el valor de c");
        c = entrada.nextDouble();
        
        resultado1 = (-b+Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        resultado2 = (-b-Math.sqrt(Math.pow(b,2) - (4*a*c))-(-b)) / (2*a);
        
        System.out.println("La primera respuesta es: "+resultado1);
        System.out.println("La segunda respuesta es: "+resultado2);
        
        
    }
}
