package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author alejandro
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
       int horasTotales,horasSemana2,horaslunes2,horasmartes2,horasmiercoles2,horasjueves2,horasviernes2,horasSemana1,horaslunes1,horasmartes1,horasmiercoles1,horasjueves1,horasviernes1,horasSemana3,horaslunes3,horasmartes3,horasmiercoles3,horasjueves3,horasviernes3,horasSemana4,horaslunes4,horasmartes4,horasmiercoles4,horasjueves4,horasviernes4;               
        float horas,salarioTotal;
        
        horaslunes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el lunes de la primera semana: "));
        
        horasmartes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el martes de la primera semana: "));
        
        horasmiercoles1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el miercoles de la primera semana: "));
        
        horasjueves1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el jueves de la primera semana: "));
        
        horasviernes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el viernes de la primera semana: "));
        
        horasSemana1 = horaslunes1 + horasmartes1 + horasmiercoles1 + horasjueves1 + horasviernes1;
        
        
        horaslunes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el lunes de la segunda semana: "));
        
        horasmartes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el martes de la segunda semana: "));
        
        horasmiercoles2 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el miercoles de la segunda semana: "));
        
        horasjueves2 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el jueves de la segunda semana: "));
        
        horasviernes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el viernes de la segunda semana: "));
        
         horasSemana2 = horaslunes2 + horasmartes2 + horasmiercoles2 + horasjueves2 +horasviernes2;
         
         
         
         
         horaslunes3 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el lunes de la tercera semana: "));
        
        horasmartes3 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el martes de la tercera semana: "));
        
        horasmiercoles3 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el miercoles de la tercera semana: "));
        
        horasjueves3 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el jueves de la tercera semana: "));
        
        horasviernes3 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el viernes de la tercera semana: "));
        
         horasSemana3 = horaslunes3 + horasmartes3 + horasmiercoles3 + horasjueves3 +horasviernes3;
         
         
         
         
         horaslunes4 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el lunes de la cuarta semana: "));
        
        horasmartes4 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el martes de la cuarta semana: "));
        
        horasmiercoles4 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el miercoles de la cuarta semana: "));
        
        horasjueves4 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el jueves de la cuarta semana: "));
        
        horasviernes4 = Integer.parseInt(JOptionPane.showInputDialog("Digite las horas trabajadas el viernes de la cuarta semana: "));
        
       
         horasSemana4 = horaslunes4 + horasmartes4 + horasmiercoles4 + horasjueves4 +horasviernes4;
        
        
        
        
        
         
         horasTotales = horasSemana1 + horasSemana2 + horasSemana3 + horasSemana4;
         
         horas = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario que gana por hora: "));
         
        salarioTotal = horasTotales * horas;
        
        JOptionPane.showMessageDialog(null, "Has trabajado "+horasTotales+" horas");
        
        JOptionPane.showMessageDialog(null, "EL sueldo expectado es "+salarioTotal+" euros");
    }
}

       
       
       
