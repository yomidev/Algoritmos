/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosdel1al100;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class NumerosDel1al100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un limite: ");
        limite = teclado.nextInt();
        for(int i=0; i<=limite; i++){
            System.out.println(i);
        }
    }
    
}
