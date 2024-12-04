/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones2;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Funciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double radio;
        System.out.println("Ingresa el radio de tu esfera: ");
        radio = teclado.nextDouble();
        System.out.println("El volumen de la esfera es: "+ volumen(radio));
        System.out.println("Es rectangulo: "+trianguloR(10, 6, 11));
        System.out.println("Ingresa un numero: ");
        int numero = teclado.nextInt();
        System.out.println("Tabla de Multiplicar de: "+ numero);
        multiplicar(numero);
        System.out.println("Factorial de "+numero+": "+factorial(numero));

    }

    //Volumen de Esfera
    public static double volumen(double r){
        double v = (4/3)*(Math.PI*Math.pow(r,3));
        return v;
    }

    //Triangulo Rectangulo
    public static boolean trianguloR(int a,int b, int c){
        return (Math.pow(a, 2)+Math.pow(b, 2)) == Math.pow(c, 2);
    }

    //Tabla de multiplicar
    public static void multiplicar(int a){
        int resultado;
        for (int i = 0; i <= 10; i++) {
            resultado = i*a;
            System.out.println(a+"*"+i+"="+resultado);
        }
    }

    public static int factorial(int a){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact*i;
        }
        return fact;
    }
    
}
