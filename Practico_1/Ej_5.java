/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 5 *************");
        System.out.println("Numero invertido:" + numerosInvertidos(1234));

    }

//    Ejercicio 5 
//Implemente un método que reciba un número entero y retorne su versión invertida. 
//Ejemplo: 1234 → 4321 
    
    public static int numerosInvertidos(int num)
    {
        int valor = 0;
                while (num > 0)
                {
                    int digito = num % 10;
                    valor = valor * 10 + digito;
                    num = num / 10;
                }
                return valor;
    }
    
}
