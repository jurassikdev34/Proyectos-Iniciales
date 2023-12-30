/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercico7;

import java.util.Scanner;

/**
 *
 * @author juras
 */
public class EJERCICO7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horastotales,semanas,dias,horas;
        
        System.out.println("Digite el numero de horas");
        horastotales = entrada.nextInt();
        
        semanas = horastotales / 168;
        dias = horastotales%168 / 24;
        horas = horastotales%24;
        
        System.out.println("\nEl equivaleste es:");
        System.out.println("Semans: "+semanas);
        System.out.println("Dias "+dias);
        System.out.println("Horas: "+horas);
        
        
        
    }
}
