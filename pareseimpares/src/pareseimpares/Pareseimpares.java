/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pareseimpares;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Pareseimpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, par = 0, impar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa un numero: ");
        num2 = teclado.nextInt();
        for (int i = num1; i <= num2; i++) {
            if(i%2 == 0){
                par = par+1;
            }else{
                impar = impar + 1;
            }
        }
        System.out.println("Numeros pares: " + par);
        System.out.println("Numeros Impares: " + impar);
    }
    
}
