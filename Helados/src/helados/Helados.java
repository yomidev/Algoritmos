/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helados;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Helados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op1, op2, resultado;
        String respuesta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona el sabor de tu helado: ");
        System.out.println(	"1. Limon");
        System.out.println("2. Mango");
        System.out.println("3. Fresa");
        op1 = teclado.nextInt();
        switch (op1) {
            case 1:
                System.out.println("¿Quieres agregar un topping a tu helado?: ");
                respuesta = teclado.next();
                if(respuesta.equals("si")){
                    System.out.println("Selecciona: ");
                    System.out.println("1. Gomitas");
                    System.out.println("2. Chamoy");
                    System.out.println("3. Chocolate");
                    op2 = teclado.nextInt();
                    switch(op2){
                        case 1:
                            resultado = 15 + 5;
                            System.out.println("El costo es: " + resultado);
                        break;
                        case 2:
                            resultado = 15 + 2;
                            System.out.println("El costo es: " + resultado);
                        break;
                        case 3:
                            resultado = 15 + 10;
                            System.out.println("El costo es: " + resultado);
                        break;
                        default:
                            System.out.println("La opcion no existe, el precio final es $15");
                        break;
                    }
                    }else{
                        System.out.println("El costo es $15");
                    }
            break;
            case 2:
            System.out.println("¿Quieres agregar un topping a tu helado?: ");
            respuesta = teclado.next();
            if(respuesta.equals("si")){
                System.out.println("Selecciona: ");
                System.out.println("1. Gomitas");
                System.out.println("2. Chamoy");
                System.out.println("3. Chocolate");
                op2 = teclado.nextInt();
                switch(op2){
                    case 1:
                        resultado = 20 + 5;
                        System.out.println("El costo es: " + resultado);
                    break;
                    case 2:
                        resultado = 20 + 2;
                        System.out.println("El costo es: " + resultado);
                    break;
                    case 3:
                        resultado = 20 + 10;
                        System.out.println("El costo es: " + resultado);
                    break;
                    default:
                        System.out.println("La opcion no existe, el precio final es $20");
                    break;
                }
                }else{
                    System.out.println("El costo es $20");
                }
            break;
            case 3:
            System.out.println("¿Quieres agregar un topping a tu helado?: ");
            respuesta = teclado.next();
            if(respuesta.equals("si")){
                System.out.println("Selecciona: ");
                System.out.println("1. Gomitas");
                System.out.println("2. Chamoy");
                System.out.println("3. Chocolate");
                op2 = teclado.nextInt();
                switch(op2){
                    case 1:
                        resultado = 18 + 5;
                        System.out.println("El costo es: " + resultado);
                    break;
                    case 2:
                        resultado = 18 + 2;
                        System.out.println("El costo es: " + resultado);
                    break;
                    case 3:
                        resultado = 18 + 10;
                        System.out.println("El costo es: " + resultado);
                    break;
                    default:
                        System.out.println("La opcion no existe, el precio final es $18");
                    break;
                }
                }else{
                    System.out.println("El costo es $18");
                }
            break;
            default:
                System.out.println("La opcion no existe");
            break;
        }
    }
    
}
