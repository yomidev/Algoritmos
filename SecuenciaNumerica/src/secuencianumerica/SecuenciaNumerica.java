/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencianumerica;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class SecuenciaNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroInicial, numeroFinal, diferencia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el valor inicial: ");
        numeroInicial = teclado.nextInt();
        System.out.println("Ingresa el valor final: ");
        numeroFinal = teclado.nextInt();
        System.out.println("Ingresa la diferencia: ");
        diferencia = teclado.nextInt();
        do { 
            System.out.println(numeroInicial);
            numeroInicial = numeroInicial + diferencia;
        } while (numeroInicial <= numeroFinal);
    }
    
}
