/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = sumar(12, 26);
        System.out.println("Suma: " + suma);
        multiplicar(45, 3);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = teclado.nextLine();
        System.out.println("Es vocal?: " + esVocal(letra));
        System.out.println("Ingresa una palabra: ");
        String palabra = teclado.nextLine();
        System.out.println("Numero de veces a repetir: ");
        int repetir = teclado.nextInt();
        bucle(palabra, repetir);
    }

    //Sumar 2 numeros
    public static int sumar(int a, int b){
        int resultado = a + b;
        return resultado;
    }
    //Multiplicar
    public static void multiplicar(int a,int b){
        int resultado = a * b;
        System.out.println("Multiplicación: "+ resultado);
    }
    //Verificar si es vocal
    public static boolean esVocal(String a){
        if(a.equals("a")|| a.equals("e") || a.equals("i")|| a.equals("o")|| a.equals("u")){
            return true;
        }else{
            return false;
        }
    }

    //Repetir
    public static void bucle(String a, int b){
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    
}
