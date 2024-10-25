/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cine;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia;
        double resultado;
        int numEntradas;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que dia es hoy?: ");
        dia = teclado.nextLine();
        switch (dia) {
            case "lunes":
                System.out.println("Ingrese el numero de entradas: ");
                numEntradas = teclado.nextInt();
                resultado = numEntradas * 90;
                System.out.println("El total es: " + resultado);
            break;
            case "martes":
            System.out.println("Ingrese el numero de entradas: ");
            numEntradas = teclado.nextInt();
            resultado = numEntradas * 90;
            System.out.println("El total es: " + resultado);
            break;
            case "miercoles":
            System.out.println("Ingrese el numero de entradas: ");
            numEntradas = teclado.nextInt();
            resultado = numEntradas * 70;
            System.out.println("El total es: " + resultado);
            break;
            case "jueves":
            System.out.println("Ingrese el numero de entradas: ");
            numEntradas = teclado.nextInt();
            resultado = (numEntradas * 90)/2;
            System.out.println("El total es: " + resultado);
            break;
            case "viernes":
            System.out.println("Ingrese el numero de entradas: ");
            numEntradas = teclado.nextInt();
            resultado = numEntradas * 90;
            System.out.println("El total es: " + resultado);
            break;
            case "sabado":
            System.out.println("Ingrese el numero de entradas: ");
            numEntradas = teclado.nextInt();
            resultado = numEntradas * 90;
            System.out.println("El total es: " + resultado);
            break;
            case "domingo":
            System.out.println("Ingrese el numero de entradas: ");
            numEntradas = teclado.nextInt();
            resultado = numEntradas * 90;
            System.out.println("El total es: " + resultado);
            break;
        
            default:
                System.out.println("La opcion no es valida");
            break;
        }
    }
    
}
