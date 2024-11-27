/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creararchivo;

/**
 *
 * @author Yomi
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File("ejemplo1.txt");
        try {
            if (archivo.createNewFile()) {
               System.out.println("Archivo creado: " + archivo.getName()); 
            }else{
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }

        try {
            FileWriter escribir = new FileWriter("ejemplo1.txt");
            escribir.write("Hola, esto es una prueba!!!");
            escribir.close();
            System.out.println("Se escribió en el archivo");
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }

    }
    
}
