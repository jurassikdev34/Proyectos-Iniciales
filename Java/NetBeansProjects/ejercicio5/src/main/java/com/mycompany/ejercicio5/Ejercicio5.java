/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author juras
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen0, segundoExamen, ExamenFinal, notaFinal;
         
        System.out.println("Digite la nota de participacion");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial");
        primerExamen0 = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final");
        ExamenFinal = entrada.nextFloat();
        
        participacion *= 0.10f;
        primerExamen0 *= 0.25f;
        segundoExamen *= 0.25f;
        ExamenFinal *= 0.40;
        
        notaFinal = participacion + primerExamen0 + segundoExamen + ExamenFinal;
        
        System.out.println("La nota final del alumno/a es: "+notaFinal);
        
    }
}
