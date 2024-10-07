/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1;
        double num2;
        double suma, resta, multiplicacion, division;
        //Esto se usa para poder ingresar datos por teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        num1 = teclado.nextDouble();
        System.out.println("Ingresa un numero 2: ");
        num2 = teclado.nextDouble();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);

    }
    
}
