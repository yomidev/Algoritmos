/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesbasicas;

/**
 *
 * @author Yomi
 */
public class OperacionesBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = (int)Math.random()*100;
        int b = (int)Math.random()*100;

        //Operaciones Basicas

        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;
        int division = a/b;
        int residuo = a%b;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("El residuo es: " + residuo);

        //Operaciones Relacionales

        boolean identico = (a==b);
        boolean mayorque = (a>b);
        boolean menorque = (a<b);
        boolean mayorigual = (a>=b);
        boolean menorigual = (a<=b);
        boolean diferente = (a!=b);

        System.out.println("\n");
        System.out.println("Identico: " + identico);
        System.out.println("Mayor que: "+ mayorque);
        System.out.println("Menor que: " + menorque);
        System.out.println("Mayor igual que: "+ mayorigual);
        System.out.println("Menor igual que: "+ menorigual);
        System.out.println("Diferente: "+ diferente);

        //Operaciones de Asignación
        int suma2 = a+=b; //a = a+b
        int resta2 = a-=b;
        int multiplicacion2 = a*=b;
        int division2 = a/=b;
        int residuo2 = a%=b;

        System.out.println("La suma es: " + suma2);
        System.out.println("La resta es: " + resta2);
        System.out.println("La multiplicación es: " + multiplicacion2);
        System.out.println("La division es: " + division2);
        System.out.println("El residuo es: " + residuo2);

        //Opeaciones Logicas
        boolean and = (a>b && b<a);
        boolean or = (a>b || b<a);
        boolean not = (!(a>b));

        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);
    

    }
    
}
