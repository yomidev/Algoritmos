/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grados;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Convertir grados Celsius a Farenheit
        //grados(9/5)+32
        final double DIVISION = 1.8;
        double grados, resultado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa los grados Celsius: ");
        grados = teclado.nextDouble();
        resultado = (grados*DIVISION)+32;
        System.out.println("El resultado es: " + resultado + " F");
    }
    
}
