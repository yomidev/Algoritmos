/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesmath;

/**
 *
 * @author Yomi
 */
public class FuncionesMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Valor Absoluto: " + Math.abs(-123));
        System.out.println("Exponente: " + Math.pow(5,2));
        System.out.println("Raiz Cuadrada: " + Math.sqrt(2000));
        System.out.println("Mayor: " + Math.max(23,7));
        System.out.println("Menor: "+ Math.min(89,-8));
        System.out.println("Redondear: " + Math.round(7.8965));
        System.out.println("Random: " + Math.random());
        System.out.println("Seno: " + Math.sin(30));
        System.out.println("Coseno: " + Math.cos(30));
        System.out.println("Tangente: " + Math.tan(30));


        //String
        System.out.println("\n");
        String cadena = "Crea un programa que permita al usuario ingresar una fecha con el formato YYYY-MM-DD y, usando LocalDate, muestre la fecha una semana después y un mes antes";
        System.out.println("Longitud: " + cadena.length());
        System.out.println("Substring: " + cadena.substring(25));
        System.out.println("IndexOf: "+ cadena.indexOf("fecha"));
        System.out.println("Reemplazar:" + cadena.replace(',','-'));
        System.out.println("Mayusculas: "+ cadena.toUpperCase());
        System.out.println("Igual: "+ cadena.equals("hola"));
    }
    
}
