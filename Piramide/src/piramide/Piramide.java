/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramide;

/**
 *
 * @author Yomi
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
