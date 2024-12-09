/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesfinal;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class FuncionesFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Programa de RFC
        Scanner teclado = new Scanner(System.in);
        String rfc;
        System.out.println("Ingresa tu rfc:");
        rfc = teclado.nextLine();
        System.out.println("Resultado: \n"+ validarRFC(rfc));
    }

    //Funcion
    public static String validarRFC(String a){
        if(a.length() == 12 || a.length() == 13){
            if(a.length() == 12){
                return "Usted es una persona moral";
            }else{
                String e = a.substring(4, 6);
                int year = Integer.parseInt(e);
                if(year <= 9){
                    year = year + 2000;
                }else{
                    year = year + 1900;
                }
                int edad = 2024 - year;
                String resultado = "Eres una persona fisica y tienes " + edad;
                return resultado;
            }
        }else{
            return "Lo ingresado no es un RFC";
        }
    }
    
}
