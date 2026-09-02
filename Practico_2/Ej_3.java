/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_2;

/**
 *
 * @author Ernesto
 */
public class Ej_3 {

    public static void main(String[] args) {
        int[] unVector = {6, 3, 5, 1, 8, 7, 2, 4};

        System.out.println("¿El numero 5 se encuentra en el vector?");
        System.out.println(buscarVec1(unVector, 5));

        System.out.println("¿En que posición se encuentra el número 5?");
        System.out.println(buscarPorPosicion(unVector, 5));
    }

//    Implementar un algoritmo que reciba el vector v y un elemento que debe buscar. 
//En este caso te vamos a pedir que consideres 2 casos. 
//a) En el primero retornaras un valor booleano que indique si el elemento se encuentra o 
//no en el arreglo 
//b) En el segundo caso retornaras la posición del arreglo donde se encuentra el elemento 
//buscado y en caso de que no se encuentre se retornara -1. 
//Firmas a utilizar: 
//a) public boolean buscarVec1(int[] v, int elemento); 
//b) public int buscarPorPosicion (int[] v, int elemento);
    public static boolean buscarVec1(int[] unVector, int elemento) {

        boolean seEncuentra = false;

        for (int i = 0; i < unVector.length; i++) {
            if (unVector[i] == elemento) {
                seEncuentra = true;
            }
        }

        return seEncuentra;

    }

    public static int buscarPorPosicion(int[] unVector, int elemento) {
        int posicion = -1;
        for (int i = 0; i < unVector.length; i++) {
            if (unVector[i] == elemento) {
                posicion = i;
            }
        }
        return posicion;
    }

}
