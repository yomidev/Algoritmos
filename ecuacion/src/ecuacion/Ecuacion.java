/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ecuacion;

/**
 *
 * @author Yomi
 */
public class Ecuacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Solución de la ecuación 12x^2+6x-30 = 0" + "\n");

        int a = 12, b = 6,c = -30;
        double x1, x2;
        x1 = ((-1*b) + (Math.sqrt(Math.pow(b,2)-(4*(a*c)))))/(2*a);
        x2 = ((-1*b) - (Math.sqrt(Math.pow(b,2)-(4*(a*c)))))/(2*a);

        System.out.println("El valor de x1 es: " + x1);
        System.out.println("El valor de x2 es: " + x2);

    }
    
}
