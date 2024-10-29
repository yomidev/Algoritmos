/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablademultiplicar;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class TabladeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero, resultado;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa un numero: ");
       numero = teclado.nextInt();
       for (int i = 0; i <= 10; i++) {
           resultado = numero * i;
           System.out.println(numero + "x" + i + "=" + resultado);
       }
    }
    
}
