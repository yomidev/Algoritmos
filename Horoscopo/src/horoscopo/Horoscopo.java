/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horoscopo;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Horoscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes;
        int dia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu mes de nacimiento: ");
        mes = teclado.nextLine();
        switch(mes){
            case "enero":
                System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 19){
                    System.out.println("Capricornio");
                }else{
                    System.out.println("Acuario");
                }
            break;
            case "febrero":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 18){
                    System.out.println("Acuario");
                }else{
                    System.out.println("Piscis");
                }
            break;
            case "marzo":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 20){
                    System.out.println("Piscis");
                }else{
                    System.out.println("Aries");
                }
            break;
            case "abril":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 19){
                    System.out.println("Aries");
                }else{
                    System.out.println("Tauro");
                }
            break;
            case "mayo":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 20){
                    System.out.println("Tauro");
                }else{
                    System.out.println("Geminis");
                }
            break;
            case "junio":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 21){
                    System.out.println("Geminis");
                }else{
                    System.out.println("Cancer");
                }
            break;
            case "julio":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 22){
                    System.out.println("Cancer");
                }else{
                    System.out.println("Leo");
                }
            break;
            case "agosto":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 22){
                    System.out.println("Leo");
                }else{
                    System.out.println("Virgo");
                }
            break;
            case "septiembre":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 22){
                    System.out.println("Virgo");
                }else{
                    System.out.println("Libra");
                }
            break;
            case "octubre":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 22){
                    System.out.println("Libra");
                }else{
                    System.out.println("Escorpio");
                }
            break;
            case "noviembre":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 21){
                    System.out.println("Escorpio");
                }else{
                    System.out.println("Sagitario");
                }
            break;
            case "diciembre":
            System.out.println("Ingresa tu dia de nacimiento: ");
                dia = teclado.nextInt();
                if(dia >= 1 && dia <= 21){
                    System.out.println("Sagitario");
                }else{
                    System.out.println("Capricornio");
                }
            break;
            default:
                System.out.println("La opcion ingresada no existe");
            break;

        }
    }
    
}
