/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
//import org.json.JSONArray;

/**
 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

IMPORTANTE:
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */
public class Q3 {
   
    public static void main(String[] args) throws Exception {
        
        org.json.simple.JSONArray obj = (org.json.simple.JSONArray) new JSONParser().parse(new FileReader("C:/Users/mfely/OneDrive/Documentos/NetBeansProjects/questoes_desafio_target/src/main/java/questoes/dados.json"));
        //org.json.simple.JSONArray my_obj = (org.json.simple.JSONArray) obj;
        double array_valores[] = new double[30];
        int i = 0;
        for (Object o : obj){
            org.json.simple.JSONObject dia_valor = (org.json.simple.JSONObject) o;
            //double valor = dia_valor.;
            //array_valores[i] = valor;
            System.out.println("dia_valor: "+dia_valor);
           
            System.out.println(dia_valor.getClass());
            i++;
        }
        
        
        
    }
}

