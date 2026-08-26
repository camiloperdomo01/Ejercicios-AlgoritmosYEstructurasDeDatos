/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 1 *************");
        System.out.println("La suma de los numeros impares es:" + sumaImpares());
        sumaImpares1();

    }

//Ejercicio 1 
//Implemente un método que imprima en consola la suma de todos los números impares entre 1 y 50 
//(inclusive). 
    //Variante 1
    public static int sumaImpares() {
        int suma = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }

        return suma;
    }

    //Variante 2
    public static void sumaImpares1() {
        int suma = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los numeros impares es:" + suma);
    }

}

// Ejercicio 6
