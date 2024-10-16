/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package division;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextDouble();
        if(num2 == 0){
            System.out.println("No se puede dividir entre cero");
        }else{
            resultado = num1/num2;
            System.out.println("El resultado de la division es: " + resultado);
        }
    }
    
}
