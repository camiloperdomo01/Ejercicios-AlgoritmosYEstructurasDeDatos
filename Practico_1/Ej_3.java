/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 3 *************");
        mostrarImpares(8);

    }

//    Ejercicio 3 
//Implemente un método que, dado un número entero N, muestre los primeros N números  
//impares, comenzando desde 1. 
    public static void mostrarImpares(int num) {
        int impar = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println("Los impares son: " + impar);
            {
                impar += 2;
            }
        }

    }
}
