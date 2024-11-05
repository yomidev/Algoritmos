/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication89;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class JavaApplication89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, contador = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        while(numero/10 != 0){
            contador = contador + 1;
            numero = numero/10;
        }
        System.out.println("El numero de digitos es: " + contador);
    }
    
}
