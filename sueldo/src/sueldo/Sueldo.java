/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldo;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String puesto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es tu puesto?: ");
        puesto = teclado.nextLine();
        switch(puesto){
            case "product manager":
                System.out.println("Tu sueldo es $30,000");
            break;
            case "frontend developer":
                System.out.println("Tu sueldo es $25,000");
            break;
            case "backend developer":
                System.out.println("Tu sueldo es $40,000");
            break;
            case "cloud arquitec":
                System.out.println("Tu sueldo es $60,000");
            break;
            case "junior developer":
                System.out.println("Tu sueldo es $16,000");
            break;
            default:
                System.out.println("La opción ingresada no existe");
            break;
        }
    }
    
}
