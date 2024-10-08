/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pesosyenes;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class PesosYenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double TASA_DE_CAMBIO = 0.13;
        double peso, resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad a convertir: ");
        peso = teclado.nextDouble();
        resultado = peso/TASA_DE_CAMBIO;
        System.out.println("Tienes: " + resultado + " yenes");

    }
    
}
