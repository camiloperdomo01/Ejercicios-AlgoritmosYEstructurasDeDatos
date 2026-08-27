/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 8 *************");
        fibonacci(6);

    }

//Ejercicio 8 
//Implemente un método que reciba un número entero positivo N y muestre por pantalla los primeros 
//N términos de la serie de Fibonacci. 
//Ejemplo para N = 6:   Salida: 0 1 1 2 3 5 
    public static void fibonacci(int N) {

        int anterior = 0;
        int actual = 1;

        for (int i = 1; i <= N; i++) {

            System.out.print(anterior + " ");

            int siguiente = anterior + actual;

            anterior = actual;
            actual = siguiente;
        }
    }

}
