/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacion;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Calificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion: ");
        num1= teclado.nextInt();
        if(num1>=0 && num1<=4){
            System.out.println("Insuficiente");
        }else if(num1==5){
            System.out.println("Suficiente");
        }else if (num1==6){
            System.out.println("Bien");
        }else if (num1==7 || num1==8){
            System.out.println("Suficiente");
        }else{
            System.out.println("Notable");
        }
    }
    
}
