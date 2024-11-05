/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabrawhile;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class PalabraWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        palabra = teclado.nextLine();
        while (true) { 
            if(palabra.equals("salir")){
                break;
            }else{
                System.out.println("Ingresa una palabra: ");
                palabra = teclado.nextLine();
            }
        }
    }
    
}
