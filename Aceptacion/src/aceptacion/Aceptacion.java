/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptacion;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Aceptacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota,edad;
        String sexo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu sexo (M para masculino y F para femenino)");
        sexo = teclado.nextLine();
        System.out.println("Ingresa tu nota: ");
        nota = teclado.nextInt();
        System.out.println("Ingresa tu edad: ");
        edad = teclado.nextInt();
        if (nota > 5 && edad >=18 && (sexo.equals("M") || sexo.equals("F"))) {
            System.out.println("ACEPTADO");
        }else{
            System.out.println("DENEGADO");
        }

    }
    
}
