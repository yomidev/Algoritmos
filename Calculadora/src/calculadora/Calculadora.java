/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, resultado;
        String operacion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero 1");
        num1 = teclado.nextDouble();
        System.out.println("Ingresa el numero 2: ");
        num2 = teclado.nextDouble();
        System.out.println("Ingresa la operación a realizar (+,-,*,/)");
        operacion = teclado.next();
        switch(operacion){
            case "+":
                resultado = num1+num2;
                System.out.println(resultado);
            break;
            case "-":
                resultado = num1-num2;
                System.out.println(resultado);
            break;
            case "*":
                resultado = num1*num2;
                System.out.println(resultado);
            break;
            case "/":
            if(num2 ==0){
                System.out.println("No se puede dividir entre 0");
            }
            else{
                resultado = num1/num2;
                System.out.println(resultado);
            }
                
            break;
            default:
                System.out.println("La opcion no existe");
            break;
        }
    }
    
}
