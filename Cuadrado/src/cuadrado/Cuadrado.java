/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadrado;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado, area, perimetro;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa la medida del lado del cuadrado: ");
        lado = teclado.nextDouble();

        area = Math.pow(lado,2);
        perimetro = lado + lado + lado + lado;

        System.out.println("El area del cuadrado es: " + area);
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    
}
