/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escribirarchivo;

/**
 *
 * @author Yomi
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EscribirArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion;
        Scanner teclado = new Scanner(System.in);

        System.out.println("a. Leer Archivo");
        System.out.println("b. Eliminar Archivo");
        System.out.println("Ingresa la opción a realizar");
        opcion = teclado.nextLine();
        switch (opcion) {
            case "a":
                try {
                    FileReader leer = new FileReader("ejemplo.txt");
                    BufferedReader buffer = new BufferedReader(leer);
                    String linea;
                    while((linea = buffer.readLine())!= null){
                        System.out.println(linea);
                    }
                    buffer.close();
                } catch (IOException e) {
                    System.out.println("Ocurrio un error");
                    e.printStackTrace();
                }
            break;
            case "b":
                File archivo = new File("ejemplo.txt");
                if(archivo.delete()){
                    System.out.println("El archivo fue eliminado con exito" + archivo.getName());
                }else{
                    System.out.println("El archivo no puede ser eliminado");
                }
            break;
            default:
                System.out.println("La opcion no existe");
            break;
        }
        
    }
    
}
