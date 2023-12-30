/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicico4;

import java.util.Scanner;

/**
 *
 * @author juras
 */
public class Ejercicico4 {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      
        
        
        final int salario = 1000;
        int nCarrosVend;
        float costecarro,salarioTotal;
        
        System.out.print("Digite el total de carros vendidos");
        nCarrosVend = entrada.nextInt();
        System.out.println("Digite el coste de los coches");
        costecarro = entrada.nextFloat();
        
        salarioTotal = salario + (nCarrosVend*150) + (0.05f*costecarro*nCarrosVend);
        
        System.out.println("\nEl salario del empleado es"+salarioTotal);
    }
}
