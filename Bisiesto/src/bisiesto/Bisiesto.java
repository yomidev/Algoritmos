/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bisiesto;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int year;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa un año: ");
       year = teclado.nextInt();
       if(year%4 == 0){
            System.out.println("Es bisiesto");
       }else{
            System.out.println("No es bisiesto");
       }
    }
    
}
