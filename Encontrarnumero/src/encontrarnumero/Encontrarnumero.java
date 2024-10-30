/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encontrarnumero;

import java.util.Scanner;
public class Encontrarnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;

        boolean resultado = false;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa un numero: ");
        num2 = teclado.nextInt();
        System.out.println("Ingresa un numero: ");
        num3 = teclado.nextInt();
        for (int i = num1; i <= num2; i++) {
            if(i == num3){

                resultado = true;
                break;
            }else{
                resultado = false;
            }  
        }
        System.out.println(resultado);
    }
            
}
    
