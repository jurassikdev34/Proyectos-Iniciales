/*Ejercicio 2. Hecer un programa que calcule e imprima el salario semanal
de un empleado a partir de sus horas semanales trabajadas y de su salario
por hora.*/

package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2_JOptionPane {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int horasTotales,horasSemana2,horaslunes2,horasmartes2,horasmiercoles2,horasjueves2,horasviernes2,horasSemana1,horaslunes1,horasmartes1,horasmiercoles1,horasjueves1,horasviernes1,horasSemana3,horaslunes3,horasmartes3,horasmiercoles3,horasjueves3,horasviernes3,horasSemana4,horaslunes4,horasmartes4,horasmiercoles4,horasjueves4;               
        float horas,salarioTotal;
        
        System.out.println("Digite las horas trabajadas el lunes de la primera semana: ");
        horaslunes1 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el martes de la primera semana");
        horasmartes1 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el miercoles de la primera semana");
        horasmiercoles1 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el jueves de la primera semana");
        horasjueves1 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el viernes de la primera semana");
        horasviernes1 = entrada.nextInt();
        
        horasSemana1 = horaslunes1 + horasmartes1 + horasmiercoles1 + horasjueves1 + horasviernes1;
        
        
        System.out.println("Digite las horas trabajadas el lunes de la segunda semana: ");
        horaslunes2 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el martes de la segunda semana");
        horasmartes2 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el miercoles de la segunda semana");
        horasmiercoles2 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el jueves de la segunda semana");
        horasjueves2 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el viernes de la segunda semana");
        horasviernes2 = entrada.nextInt();
        
         horasSemana2 = horaslunes2 + horasmartes2 + horasmiercoles2 + horasjueves2 +horasviernes2;
         
         
         
         
         System.out.println("Digite las horas trabajadas el lunes de la tercera semana: ");
        horaslunes3 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el martes de la tercera semana");
        horasmartes3 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el miercoles de la tercera semana");
        horasmiercoles3 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el jueves de la tercera semana");
        horasjueves3 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el viernes de la tercera semana");
        horasviernes3 = entrada.nextInt();
        
         horasSemana3 = horaslunes3 + horasmartes3 + horasmiercoles3 + horasjueves3 +horasviernes3;
         
         
         
         
         System.out.println("Digite las horas trabajadas el lunes de la cuarta semana: ");
        horaslunes4 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el martes de la cuarta semana");
        horasmartes4 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el miercoles de la cuarta semana");
        horasmiercoles4 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el jueves de la cuarta semana");
        horasjueves4 = entrada.nextInt();
        
        System.out.println("Digite las horas trabajadas el viernes de la cuarta semana");
        int horasviernes4 = entrada.nextInt();
        
         horasSemana4 = horaslunes4 + horasmartes4 + horasmiercoles4 + horasjueves4 +horasviernes4;
        
        
        
        
        
         
         horasTotales = horasSemana1 + horasSemana2 + horasSemana3 + horasSemana4;
         
        System.out.println("Digite el salario que gana por hora: ");
        horas = entrada.nextFloat();
        
        salarioTotal = horasTotales * horas;
        
        System.out.println("En total has trabajado:"+horasTotales);System.out.print("horas");
        
        System.out.println("\nEl salario mensual es: "+salarioTotal);
    }
}
