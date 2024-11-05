/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarnumerorandom;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class AdivinarNumeroRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int random = (int)Math.random()*100;
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero correcto: ");
        numero = teclado.nextInt();
        while(numero != random){
            System.out.println("Ingresa el numero correcto: ");
            numero = teclado.nextInt();
        }
        System.out.println("Adivinaste");
    }
    
}
