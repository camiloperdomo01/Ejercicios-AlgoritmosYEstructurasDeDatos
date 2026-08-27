/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 7 *************");
        triangulo(4);

    }

//Ejercicio 7 
//Implemente un método que reciba un N y muestre por pantalla un triángulo de N filas 
//con *: 
//Ej: para N = 4 
//* 
//** 
//*** 
//****
    public static void triangulo(int N) {

        for (int fila = 1; fila <= N; fila++) {

            for (int i = 1; i <= fila; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
