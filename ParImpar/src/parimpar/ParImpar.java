/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        numero = teclado.nextInt();
        if(numero%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
    
}
