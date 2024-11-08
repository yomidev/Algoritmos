/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopropuesto;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class EjercicioPropuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realiza el algoritmo de FizzBuzz pero debe de cumplir las siguientes condiciones:
        * El usuario debe de indicar el rango
        * Estos numeros deben de ser diferentes a cero, si el usuario ingresa el cero, el programa le debe de solicitar el numero hasta que ingrese el correcto
        * El numero final siempre debe de ser mayor que el rango inicial, si el usuario pone el mismo numero que el rango inicial o menor que este se le debe de estar solicitando el numero hasta que ingrese el correcto
        * Debe de cumplir con las condiciones de FizzBuzz:
           * Multiplos de 3 y 5 se debera de escribir FizzBuzz
           * Multiplos de 3 se debera de escribir Fizz
           * Multiplos de 5 se debera de escribir Buzz
        * El programa debe de preguntarle al usuario una vez que termine el proceso si quiere realizar nuevamente el proceso, en caso de que sea favorable, se debe repetir, en caso de que no el programa debera de terminar mostrando la leyenda "Programa Finalizado"
        */

        int numeroInicial, numeroFinal;
        String respuesta;
        Scanner teclado = new Scanner(System.in);

        //Ciclo
        do{
            //Numero Inicial
            do { 
                System.out.println("Ingresa el numero Inicial: ");
                numeroInicial = teclado.nextInt();
            } while (numeroInicial <= 0);
            //Numero Final
            do { 
                System.out.println("Ingresa el numero final");
                numeroFinal = teclado.nextInt();
            } while (numeroFinal <= 0 || numeroFinal <= numeroInicial);
            System.out.println("\n" + "Imprimiendo..." + "\n");
            for (int i = numeroInicial; i <= numeroFinal; i++) {
                if(i%3 == 0 && i%5 == 0){
                    System.out.println("FizzBuzz");
                }else if(i%3 == 0){
                    System.out.println("Fizz");
                }else if(i%5 == 0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
            System.out.println("Quieres continuar? (S/N)");
            respuesta = teclado.next();
        }while(!respuesta.toUpperCase().equals("N"));
        System.out.println("Programa Finalizado");
    }
    
}
