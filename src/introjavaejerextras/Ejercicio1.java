/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaejerextras;

import java.util.Scanner;

/**
 *
 * @author ginon
 */

//  Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
//  usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de minutos: ");
        float min = sc.nextInt();
        
        System.out.println("La cantidad de horas es: " + calcularHoras(min));
        System.out.println("La cantidad de dias es: " + calcularDias(min));
    }
    
    
    public static float calcularHoras(float min){
        
        float horas = min/60;
        
        while( horas>=24 ){
            
            horas = horas % 24;
            
            
        }
        
        
        
        return horas;
    }
    
    public static double calcularDias(float min){
        
        double dias = Math.floor(min/1440);
        return dias;
        
        
        
        
    }
    
}
