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
        int lados [] = new int[5];
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i<lados.length;i++){
            System.out.println("Ingresa el valor del lado "+ (i+1)+":");
            lados[i] = teclado.nextInt();
        }
        System.out.println(Arrays.toString(lados));

        //TODO Calcular Perimetro de la figura Irregular
        //TODO Figura Regular
        //TODO Calcular Perimetro y Area de la Figura Regular
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
