/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materia;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Materia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un dia: ");
        dia = teclado.nextLine();
        switch(dia){
            case "lunes":
             System.out.println("Te toca Calculo Integral");
            break;
            case "martes":
             System.out.println("Te toca Calculo Vectorial");
            break;
            case "miercoles":
             System.out.println("Te toca Higiene y Seguridad");
            break;
            case "jueves":
             System.out.println("Te toca Mercadotecnia");
            break;
            case "viernes":
             System.out.println("Te toca Taller de Etica");
            break;
            default:
            System.out.println("La opcion no existe");
            break;
        }
    }
    
}
