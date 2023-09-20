/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.u1u2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExamenU1u2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       
        double bat = 1250.45;
        double bateriacomp = 899.89;

        double precioGuitarra = 3743.00;
        double precioCompGuitarra = 2673.50;

        double saxo = 2683.78;
        double precioCompSax = 1435.00;

        
        
        double gananciaBateria = ((bat - bateriacomp) / bateriacomp) * 100;
        double gananciaGuitarra = ((precioGuitarra - precioCompGuitarra) / precioCompGuitarra) * 100;
        double gananciaSax = ((saxo - precioCompSax) / precioCompSax) * 100;

        
        System.out.println("Porcentaje de ganancia para el primer instrumento: " + gananciaBateria + "%");
        System.out.println("Porcentaje de ganancia para el segundo instrumento: " + gananciaGuitarra + "%");
        System.out.println("Porcentaje de ganancia para el tercer instrumento: " + gananciaSax + "%");
        
    }
}







    
