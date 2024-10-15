/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usodeif;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class UsoDeIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();
        if(edad >= 0 && edad <= 11){
            System.out.println("Eres niño");
        }else if(edad >=12 && edad<=17){
            System.out.println("Eres adolescente");
        }else if(edad >=18 && edad<=29){
            System.out.println("Eres joven");
        }else if(edad >=30 && edad<=59){
            System.out.println("Eres adulto");
        }
        else{
            System.out.println("Eres anciano");
        }
    }
    
}
