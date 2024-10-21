/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplo;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa el numero 2: ");
        num2 = teclado.nextInt();
        if(num1%num2 == 0){
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }
    
}
