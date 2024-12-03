/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesmath;

import java.time.LocalDate;
import java.util.Scanner;

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

        //Invertir cadena
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String palabra = teclado.nextLine();
        palabra = palabra.replaceAll(" ", "").trim();
        String invertida = "";
        for(int i = palabra.length()-1; i>=0;i--){
            invertida = invertida+palabra.charAt(i);
        }
        System.out.println("Palabra Invertida: " + invertida);
        //Fechas
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: "+ fechaActual);
        //Sumar dias
        LocalDate sumarDias = fechaActual.plusDays(10);
        //Sumar meses
        LocalDate sumarMeses = fechaActual.plusMonths(5);
        //Sumar Años
        LocalDate sumarYears = fechaActual.plusYears(1);
        System.out.println("Sumar Dias: " + sumarDias);
        System.out.println("Sumar Meses: "+sumarMeses);
        System.out.println("Sumar Años: "+ sumarYears);
        //Manipular fechas
        LocalDate fechaActualizada = fechaActual.minusMonths(3).plusDays(6).minusYears(4);
        System.out.println("Fecha Actualizada: "+fechaActualizada);
        //Obtener dia de la semana
        System.out.println("El dia de la semana en la fecha: "+ fechaActual +" es: "+ fechaActual.getDayOfWeek());
    }
    
}
