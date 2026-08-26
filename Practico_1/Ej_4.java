/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 4 *************");
        digitosSeparados(1523);

    }

    //Ejercicio 4 
//Implemente un método que reciba un número entero positivo e imprima en pantalla sus dígitos 
//por separado. 
//Pruebe el método con los siguientes valores: 5, 1523, 20, 100000. 
    public static void digitosSeparados(int num) {

        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
        }
    }

}
