/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el lado 1: ");
        lado1 = teclado.nextInt();
        System.out.println("Ingresa el lado 2: ");
        lado2 = teclado.nextInt();
        System.out.println("Ingresa el lado 3: ");
        lado3 = teclado.nextInt();
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("El triangulo es equilatero");
        }else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Es isoceles");
        }else{
            System.out.println("Es escaleno");
        }
    }
    
}
