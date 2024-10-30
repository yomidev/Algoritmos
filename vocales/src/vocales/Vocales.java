/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocales;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palabra;
        int contador = 0;
        System.out.println("Ingresa una palabra: ");
        palabra = teclado.nextLine();
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.toLowerCase().charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u'){
                contador = contador + 1;
            }
        }
        System.out.println("El numero de vocales de la palabra es: " + contador);
    }
    
}
