/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exponente;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Exponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, exponente;
        double resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        System.out.println("Ingresa el exponente: ");
        exponente = teclado.nextInt();
        if(exponente > 0){
            resultado = Math.pow(numero, exponente);
            System.out.println("El resultado es: " + resultado);
        }else if(exponente == 0){
            System.out.println("El resultado es 1");
        }else{
            resultado = Math.pow(numero, exponente);
            System.out.println("El resultado es: " + resultado);
        }
    }
    
}
