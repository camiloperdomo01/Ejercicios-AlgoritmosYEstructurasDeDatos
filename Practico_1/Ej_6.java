/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practico_1;

/**
 *
 * @author Ernesto
 */
public class Ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("************* Ejercicio 6 *************");
        System.out.println("Palindromo:" + palabraPalindromo("casa"));
        System.out.println("Palindromo:" + palabraPalindromo("radar"));

    }

//    Ejercicio 6 
//Implemente un método que reciba una palabra (String) y retorne un valor booleano, 
//indicando si la palabra es un palíndromo. 
    public static boolean palabraPalindromo(String palabra) {
        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }

}
