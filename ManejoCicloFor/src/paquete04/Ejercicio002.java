/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio002 {
     public static void main(String[] args) {
        double fahrenheit;
        double celcius;
        int contador = 0;
        
            
        for (fahrenheit = 20; fahrenheit<=100; fahrenheit +=4){
            celcius = (5./9.)*(fahrenheit-32);
            
            System.out.printf("Operacion (%d) Farenheit: %.2f ===> Celcius %.2f"
                            + "\n", contador, fahrenheit, celcius);
            
            contador++;
            
        }
    }
    
    
}
            

