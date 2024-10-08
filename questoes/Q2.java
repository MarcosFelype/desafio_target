/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.util.Arrays;
import java.util.Scanner;

/**
2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
 * avisando se o número informado pertence ou não a sequência.
 */
public class Q2 {
    static int NUM, seq_fibonacci[];
    
    public static void main(String []args){
        System.out.println("Informe o número: ");
        Scanner teclado = new Scanner(System.in); //criando um scanner para ler o valor fornecido
        NUM = teclado.nextInt();
        
        seq_fibonacci = new int[NUM];
        seq_fibonacci[0] = 0;
        seq_fibonacci[1] = 1;
       
        
        for (int i=0; i<NUM; i++){
            if (i>=2){
                seq_fibonacci[i] = seq_fibonacci[i-1] + seq_fibonacci[i-2];
            }
        }
        
        System.out.println(Arrays.toString(seq_fibonacci));
        
        /*while(true){
            
        }*/
        
        
        for (int i=0; i<NUM; i++){
            
        }
        
    }
}
