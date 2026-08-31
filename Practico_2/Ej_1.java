/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_2;

/**
 *
 * @author Ernesto
 */
public class Ej_1 {

    public static void main(String[] args) {
        int[] unVector = {6, 3, 5, 1, 8, 7, 2, 4};
        int[] unVector2 = {1, 3, 5, 7, 12, 20};
        System.out.println("Mostrar contenido: " + mostrarContenido(unVector));

        System.out.println("El mayor del vector1 es: " + maxVec1(unVector));
        System.out.println("El mayor del vector2 es: " + maxVec2(unVector2));

        System.out.println("La posicion del valor maximo del vector es: " + posMaxVec(unVector));
        System.out.println("La posicion del valor minimo del vector es: " + posMinVec(unVector));

    }

//  Ejercicio 1 
//     Implementar los siguientes algoritmos que reciba un array y: 
//  a) Muestre su contenido: 
//      Vector ejemplo int[] v = {6,3,5,1,8,7,2,4 ; 
//      Firma: public String mostrarContenido( int[] v ); 
//      Resultado esperado: 6 - 3 – 5 – 1 – 8 – 7 – 2 – 4 
//  b) Retorne el valor máximo del array. Para realizarlo debes considerar 2 casos:  
//       En el primer caso se asume que el array no está vacío y no esta ordenado 
//       En el segundo caso que el array no está vacío y esta ordenado en forma 
//      ascendente. 
//      Utilizar las siguientes firmas: 
//       public int maxVec1(int[] v); 
//       public int maxvecV2(int[] v); 
//  c) Retornen la posición donde se encuentra el valor máximo o el valor mínimo según sea el 
//      caso. 
//       public int posMaxVec(int[] v); 
//       public int posMinVec(int[] v); 
    //1.a)
    // Pre-Condicion: Recibir un vector != null.
    // Post-Condicion: Devolver todos los elementos del vector dado separados por un guion.
    public static String mostrarContenido(int[] unVector) {
        String resultado = "";

        for (int i = 0; i < unVector.length; i++) {
            if (i == unVector.length - 1) {
                resultado += unVector[i];
            } else {
                resultado += unVector[i] + "-";
            }

        }

        return resultado;

    }

// 1.b)
// Caso 1: Vector NO ordenado
// Pre-Condición: El vector recibido no es null y tiene al menos un elemento.
// Post-Condición: Retorna el valor máximo contenido en el vector.
    public static int maxVec1(int[] unVector) {

        int mayor = unVector[0];

        for (int i = 1; i < unVector.length; i++) {

            if (mayor < unVector[i]) {
                mayor = unVector[i];
            }

        }

        return mayor;
    }

// Caso 2: Vector ordenado ascendentemente
// Pre-Condición: El vector recibido no es null, tiene al menos un elemento
//                y está ordenado de forma ascendente.
// Post-Condición: Retorna el valor máximo contenido en el vector.
    public static int maxVec2(int[] unVector) {

        return unVector[unVector.length - 1];
    }

// 1.c)
// Pre-Condición: El vector recibido no es null y tiene al menos un elemento.
// Post-Condición: Retorna la posición donde se encuentra el valor máximo del vector.
    public static int posMaxVec(int[] unVector) {

        int mayor = unVector[0];
        int posicion = 0;

        for (int i = 1; i < unVector.length; i++) {

            if (mayor < unVector[i]) {
                mayor = unVector[i];
                posicion = i;
            }
        }

        return posicion;
    }

// Pre-Condición: El vector recibido no es null y tiene al menos un elemento.
// Post-Condición: Retorna la posición donde se encuentra el valor mínimo del vector.
    public static int posMinVec(int[] unVector) {

        int minimo = unVector[0];
        int posicion = 0;

        for (int i = 1; i < unVector.length; i++) {

            if (minimo > unVector[i]) {
                minimo = unVector[i];
                posicion = i;
            }
        }

        return posicion;
    }

}
