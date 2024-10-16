/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayorque;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class MayorQue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa otro numero: ");
        num2 = teclado.nextInt();
        if(num1 > num2){
            System.out.println("El numero " + num1 + " es mayor que" + num2);
        }else if (num1 < num2) {
            System.out.println("El numero " + num1 + " es menor que " + num2);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }
    
}
