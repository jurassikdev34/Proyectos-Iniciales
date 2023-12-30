/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio6;

import java.util.Scanner;

/**
 *
 * @author juras
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,resultado;
        
        System.out.println("Digite el valor de a");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b");
        b = entrada.nextDouble();
        
        resultado = Math.pow(a,2) + Math.pow(b, 2) + (2*a*b);
        
        System.out.println("\nEl resultado es: "+resultado);
    }
}
