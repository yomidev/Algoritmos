/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbuja;

import java.util.Arrays;

/**
 *
 * @author Yomi
 */
public class MetodoBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int [] numeros = {5,8,1,0,2,24,16,3};
        int [] numeros = new int [20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1-i; j++) {
                if(numeros[j] < numeros[j+1]){
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));
    }
    
}
