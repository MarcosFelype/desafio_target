/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

/*
1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0;
Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
Imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?

 */
public class Q1 {
    static int INDICE = 13, SOMA = 0, K = 0;
    public static void main(String[] args) {
        while (K<INDICE){
            K = K +1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA);
    }
 
}
