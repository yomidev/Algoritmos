/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        radio = teclado.nextDouble();
        area = Math.PI*(radio*radio);
        System.out.println("El area es: " + area);
    }
    
}
