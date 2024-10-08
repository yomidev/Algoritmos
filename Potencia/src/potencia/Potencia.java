/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potencia;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero1, numero2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero1=teclado.nextDouble();
        System.out.println("Ingresa la potencia: ");
        numero2 = teclado.nextDouble();
        resultado = Math.pow(numero1, numero2);
        System.out.println("El resultado es: "+ resultado);
    }
    
}
