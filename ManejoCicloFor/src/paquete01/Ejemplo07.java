/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo07 {
    public static void main(String[] args) {
        int operacion;
        int suma;
        String sumafinal ="";
        String mensajeFinal = "";
        for (int i = 1; i <= 10; i++) { // for 01
            // System.out.printf("Tabla de multiplicar del número %d\n", i);
            mensajeFinal = String.format("%sTabla de multiplicar del número %d\n", 
                    mensajeFinal, i);
            sumafinal = String.format ("%sTabla de sumar del numero %d\n",
                    sumafinal, i);
            for (int contador = 1; contador <= 12; contador++) {
                operacion = i * contador;
                    mensajeFinal = String.format("%s%d x %d = %d\n", 
                        mensajeFinal, i, contador, operacion);
                // System.out.printf("%d x %d = %d\n", i, contador, operacion);
                suma = i + contador;
                sumafinal = String.format("%s%d + %d = %d\n", 
                        sumafinal, i, contador, suma);
                              
            }
                
            // System.out.println("\n");
            mensajeFinal = String.format("%s\n", mensajeFinal);
            sumafinal = String.format ("%s\n", sumafinal);
        } // termina for 01
        
        System.out.printf("%s\n %s\n", mensajeFinal, sumafinal);
    }
}
