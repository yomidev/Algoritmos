/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplosde2;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Multiplosde2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int multiplo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        multiplo = teclado.nextInt();
        for (int i = 0; i <= 100; i++) {
            if(i%multiplo == 0){
                System.out.println(i);
            }
        }
    }
    
}
