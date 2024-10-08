/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questoes;

import java.text.DecimalFormat;


/**
 *
 * @author felype
 */
public class Q4 {
    static double faturamentoSP = 67836.43, faturamentoRJ = 36678.66, faturamentoMG = 29229.88, faturamentoES = 27165.48, faturamento_outros = 19849.53, soma_faturamento;
    public static void main(String[] args) {
        //DecimalFormat DFORMAT = new DecimalFormat (" # % ");
        soma_faturamento = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamento_outros;
        
        String percSP_formatado = String.format("%.2f",(faturamentoSP/soma_faturamento) * 100);
        System.out.println("O faturamento de SP representa " +percSP_formatado+ "% do faturamento total.");
        
        
        String percRJ_formatado = String.format("%.2f",(faturamentoRJ/soma_faturamento) * 100);
        System.out.println("O faturamento do RJ representa "+ percRJ_formatado + "% do faturamento total.");
        
        
        String percMG_formatado = String.format("%.2f",(faturamentoMG/soma_faturamento) * 100);
        System.out.println("O faturamento de MG representa "+ percMG_formatado + "% do faturamento total.");
        
        
        String percES_formatado = String.format("%.2f",(faturamentoES/soma_faturamento) * 100);
        System.out.println("O faturamento do ES representa "+ percES_formatado + "% do faturamento total.");
        
        
        String percOutros_formatado = String.format("%.2f",(faturamento_outros/soma_faturamento) * 100);
        System.out.println("O faturamento dos outros estados juntos representam "+ percOutros_formatado + "% do faturamento total.");
    }   
}
