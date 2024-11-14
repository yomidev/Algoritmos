/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Yomi
 */
public class Arrays1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO Inicialización Manual
        int [] numeros = {123,345,567,0,98,1};
        String [] carreras = {"Industrial","TICS","Materiales"};

        System.out.println(numeros[3]);
        System.out.println(carreras[1]);

        //TODO Llenado por indices
        String [] blackpink = new String[4];
        blackpink[0] = "JISOO";
        blackpink[1] = "JENNIE";
        blackpink[2] = "LISA";
        blackpink[3] = "ROSÉ";
        System.out.println(Arrays.toString(blackpink));

        //TODO Figura Irregular
        int nlados;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el numero de lados de tu figura: ");
        nlados = teclado.nextInt();
        int lados [] = new int[nlados];
        
        for(int i = 0; i<lados.length;i++){
            System.out.println("Ingresa el valor del lado "+ (i+1)+":");
            lados[i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(lados));

        //TODO Calcular Perimetro de la figura Irregular
        int perimetro = 0;
        for (int i = 0; i < lados.length; i++) {
            perimetro = perimetro + lados[i];
        }
        System.out.println("El perimetro de la figura es: " + perimetro);

        //TODO Figura Regular
        int nlados2;
        System.out.println("Ingresa el numero de lados de tu figura: ");
        nlados2 = teclado.nextInt();
        int [] Fregular = new int [nlados2];
        for (int i = 0; i < Fregular.length; i++) {
            System.out.println("Lado " + (i+1) + ":");
            Fregular[i] = teclado.nextInt();
        }
        //TODO Calcular Perimetro
        System.out.println(Fregular[0]*Fregular.length);

        //Arrays para trabajar
        String [] anime;
        anime = new String[10];
        String [] kpop = { "BLACKPINK", "STRAY KIDS", "TWICE", "(G)I-DLE", "NEWJEANS",
                "TOMORROW x TOGETHER", "ENHYPEN", "BTS", " ", "SEVENTEEN", " ", " ", "REDVELVET",
                " ","LE SSERAFIM"
        };
        String[] songs;

        String [] actores = { "Timothée Chalamet", "Florence Pugh", "Margot Robin",
            "Cate Blanchet", "Jennifer Lawrence", " ", "Anna Taylor Joy", " ", " ", "Ryan Gosling"
        };

    }
    
}
