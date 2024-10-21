/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viaje;

/**
 *
 * @author Yomi
 */
import java.util.Scanner;
public class Viaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alumnos, total;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el numero de alumnos: ");
        alumnos = teclado.nextInt();
        if(alumnos >= 100){
            total = alumnos*65;
            System.out.println("El total a pagar es: "+total);
        }else if(alumnos >= 50 && alumnos <= 99){
            total = alumnos*70;
            System.out.println("El total a pagar es: "+total);
        }else if(alumnos >= 30 && alumnos <=49){
            total = alumnos*95;
            System.out.println("El total a pagar es: "+total);
        }else{
            System.out.println("Debe pagar 4000");
        }
    }
    
}
