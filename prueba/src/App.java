import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.println("Hola Mundo");

        System.out.println("Ingresa tu nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Hola " + nombre);
    }
}
