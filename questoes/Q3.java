/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.*;
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
        //JSONObject my_obj = null;
        //my_obj.
        Object obj = new JSONParser().parse(new FileReader("questoes/dados.json"));
        JSONObject my_obj = (JSONObject) obj;
        
        double faturamento = my_obj.getDouble("valor");
        
        System.out.println(faturamento);
    }
}
