/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = "password123";
        String userPassword;
        Scanner teclado = new Scanner(System.in);
        do { 
            System.out.println("Ingresa una contraseña: ");
            userPassword = teclado.nextLine();
        } while (!userPassword.equals(password));
        System.out.println("Contraseña correcta");

    }
    
}
