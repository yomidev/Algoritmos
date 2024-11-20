/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays2;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Arrays2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingresa el numero de elementos del array: ");
        cantidad = teclado.nextInt();
        int [] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingresa el numero " + (i+1) +": ");
            numeros[i] = teclado.nextInt();
        }
        //Obtener num menor
        int menor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        //Obtener la suma
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        //Obtener el promedio
        double promedio = suma/numeros.length;
        //Invertir array
        int [] invertido = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length-1-i];
        }

        System.out.println("Array: " + Arrays.toString(numeros));
        System.out.println("Numero menor: " + menor);
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("Array Invertido: " + Arrays.toString(invertido));
    }
    
}
