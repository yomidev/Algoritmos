/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdefidelidad;

import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class TestDeFidelidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String infiel;
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Test de Fidelidad de tu pareja");
        System.out.println("Instrucciones: Contesta con V para verdadero o F para falso dependiendo de tu experiencia");
        System.out.println();
        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("5. No te deja que mires la agenda de su teléfono móvil?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("9. Has notado que últimamente se perfuma más?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 3;
        }
        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
        infiel = teclado.nextLine();
        if(infiel.toLowerCase().equals("v")){
            contador = contador + 5;
        }
        System.out.println();
        System.out.println("Deacuerdo con tus respuestas, se ha concluido que: ");
        //Agregar las condiciones
        /*
         * Puntaje entre 0 y 10
         *     Imprimir ¡Felicidades! tu pareja parece ser totalmente fiel
         * Puntaje entre 11 y 22
         *      Imprimir Quizás exista el peligro de que haya otra persona en su vida o su mente, aunque seguramente será algo sin importancia
         * Puntaje entre 22 y 30
         *      Imprimir Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigues que es lo que esta pasando por su cabeza 
         */

    }
    
}
