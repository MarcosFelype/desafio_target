/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.Scanner;

/**
 5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */
public class Q5 {
    static String str, string_invertida = "";
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Sigite uma string:");
        str = teclado.nextLine();

        for (int i=str.length()-1; i>=0; i--){
            string_invertida += str.charAt(i);
        }
        System.out.println("String original: "+str);
        System.out.println("String invertida: "+string_invertida);
    }
}
