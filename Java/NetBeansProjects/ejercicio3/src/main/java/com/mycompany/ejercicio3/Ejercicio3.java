/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author juras
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float guillermo,luis,juan,total;
        
        System.out.println("Cunato dinero tiene Guillermo");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (guillermo + luis)/2;
                
        total = guillermo + juan + luis;
        System.out.println("En total tienen"+total);
    }
}
