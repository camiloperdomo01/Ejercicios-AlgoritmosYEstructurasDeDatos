/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_2;

/**
 *
 * @author Ernesto
 */
public class Ej_2 {

    public static void main(String[] args) {
        int[] unVector = {6, 3, 5, 1, 8, 7, 2, 4};

        System.out.println("El mayor numero entre las posiciones es:" + maxVec(unVector, 1, 3));
    }

//    Ejercicio 2 
//Implemente los métodos del ejercicio 2 inciso (a), pero agregando 2 parámetros que 
//representan desde donde recorremos el arreglo y hasta donde recorreremos el arreglo. 
//Tomando como ejemplo el array 6 - 3 – 5 – 1 – 8 – 7 – 2 – 4 donde la posición 0 contiene el 
//valor 6 y la posición 7 del array contiene el valor 4. 
//Si queremos obtener el valor máximo del arreglo tomando como posición inicial (desde=1) y como 
//posición final (hasta=3) el algoritmo debería recorrer esa porción del arreglo para retornar el valor 
//máximo 6 - 3 – 5 – 1 – 8 – 7 – 2 – 4,  que para el ejemplo seria el valor 5 que se encuentra en la 
//posición 2 
//Firmas a utilizar 
//• public int maxVec (int[] v, int desde, int hasta);
    
    public static int maxVec(int[] unVector, int desde, int hasta) {
        int mayor = unVector[desde];

        for (int i = desde; i <= hasta; i++) {
            if (mayor < unVector[i]) {
                mayor = unVector[i];
            }
        }

        return mayor;
    }
}
