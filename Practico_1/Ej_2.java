/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 2 *************");
        mostrar(20, 3);

    }

// Ejercicio 2 
//Implemente un método que, dado dos números enteros, muestre por pantalla: 
// Su promedio, con decimales. 
// La cantidad de números pares que existen entre ellos. 
    public static void mostrar(int num1, int num2) {
        // Se utiliza 2.0 y no 2 porque queremos que la división produzca un resultado decimal.
        double promedio = (num1 + num2) / 2.0;
        // cont va a almacenar la cantidad de números pares que encontremos.
        int cont = 0;

        /*
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        if (num1 > num2) {
            min = num2;
            max = num1;

        } else {
            max = num2;
            min = num1;
        }
        
         */
 /*
        
        int min = num1;
        int max = num2;
        if(num1 > num2)
        {
        min = num2;
        max = num1;
        }
        
         */
        // Math.min() devuelve el menor de los dos:
        int min = Math.min(num1, num2);
        // Math.max() devuelve el mayor:
        int max = Math.max(num1, num2);

        // Este for recorre todos los números desde min hasta max.
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                cont++;
            }
        }
        System.out.println("El promedio es:" + promedio);
        System.out.println("La cantidad de numeros pares es:" + cont);

    }

}
