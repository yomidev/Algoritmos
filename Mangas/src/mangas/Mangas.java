/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mangas;

/**
 *
 * @author Yomi
 */
import java.util.*;
public class Mangas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Selecciona la opción correspondiente: ");
        System.out.println("1. Demon Slayer");
        System.out.println("2. Jujutsu Kaisen");
        System.out.println("3. One Piece");
        System.out.println("4. Dragon Ball");
        System.out.println("5. Saylor Moon");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Kimetsu no Yaiba, también conocida bajo su nombre en inglés Demon Slayer, o en español Guardianes de la noche, es una serie de manga escrita e ilustrada por Koyoharu Gotōge, cuya publicación comenzó el 15 de febrero de 2016 en la revista semanal Shūkan Shōnen Jump de la editorial Shūeisha");
            break;
            case 2:
                System.out.println("Jujutsu Kaisen, también conocida como Jujutsu Kaisen: Guerra de hechiceros en Japón, es una serie de manga japonés escrita e ilustrada por Gege Akutami");
            break;
            case 3:
                System.out.println("One Piece ​ es un manga escrito e ilustrado por Eiichirō Oda. Comenzó a publicarse en la revista Japonesa Weekly Shōnen Jump el 22 de julio de 1997 y a la fecha se han publicado 109 volúmenes.​La obra narra las aventuras de Monkey D.");
            break;
            case 4:
                System.out.println("Dragon Ball es un manga escrito e ilustrado por Akira Toriyama. Fue publicado originalmente en la revista Shōnen Jump, de la editorial japonesa Shūeisha, entre 1984 y 1995");
            break;
            case 5:
                System.out.println("Pretty Soldier Sailor Moon, conocida como Sailor Moon, es una serie de manga escrita e ilustrada por Naoko Takeuchi en diciembre de 1991.");
            break;
            default:
                System.out.println("La opción ingresada no existe");
            break;
        }
    }
    
}
