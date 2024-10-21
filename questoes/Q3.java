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
import org.json.simple.JSONArray;
//import org.json.JSONArray;
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
        //Object obj = new JSONParser().parse(new FileReader("C:/Users/mfely/OneDrive/Documentos/NetBeansProjects/questoes_desafio_target/src/main/java/questoes/dados.json"));
        Object obj = new JSONParser().parse(new FileReader("C:/Users/mfely/OneDrive/Documentos/NetBeansProjects/questoes_desafio_target/src/main/java/questoes/dados.json"));
        org.json.JSONArray my_obj = (org.json.JSONArray) obj;
        //Object json_object = new FileReader("C:/Users/mfely/OneDrive/Documentos/NetBeansProjects/questoes_desafio_target/src/main/java/questoes/dados.json");
        //String string_json = (String) obj;
        //System.out.println(json_object);
        //JSONObject jsonObject = new JSONObject(my_obj);
        //System.out.println(obj);
        
        //org.json.JSONArray my_obj2 = (org.json.JSONArray) my_obj;
        
        System.out.println(my_obj);
         
        //JSONArray keys =  ;
        org.json.simple.JSONObject value = (org.json.simple.JSONObject) my_obj.get(0);
        
        //org.json.JSONObject convert_value = (org.json.JSONObject) value;
        
        //System.out.println("Valor 1:\n"+value.getDouble("valor"));
        
        //org.json.simple.JSONObject obj2 = (org.json.simple.JSONObject) value;
        
        
        
        //double valor_faturamento = (double) obj2.;
        
        //System.out.println("valor faturamento 1:\n"+valor_faturamento);
        
        //Imprimindo valor 1
        //Object value = obj;
        
        System.out.println("\n\n");
        //System.out.println(string_json);
        System.out.println("\n\n");
        //System.out.println(obj.getClass());
        //org.json.simple.JSONArray valor_faturamento_mensal = (org.json.simple.JSONArray) my_obj.get(0);
        //JSONObject firstJsonObject = my_obj.;
        //JSONArray my_obj = (JSONArray) obj;
        
        //double faturamento = jsonObject.getDouble("valor");
        //System.out.println(valor_faturamento_mensal);
        
        //System.out.println(faturamento);
        
        
        /*JsonReader reader = Json.createReader(new StringReader(json));
        JSONObject raiz = reader.readObject();
        String status = raiz.getString("_status");
        JsonArray titulosNaoConciliados = raiz.getJsonArray("_dados");*/
    }
}

