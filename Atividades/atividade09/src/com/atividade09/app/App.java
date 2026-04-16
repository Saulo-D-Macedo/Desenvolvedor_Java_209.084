package com.atividade09.app;

import javax.swing.JOptionPane;
import com.atividade09.models.Combustivel;

public class App {
    public static void main(String[] args) {
        
        try {
            // Entrada dos preços
            double precoGasolina = Double.parseDouble(
                JOptionPane.showInputDialog("Preço da Gasolina (R$):")
            );
            
            double precoEtanol = Double.parseDouble(
                JOptionPane.showInputDialog("Preço do Etanol (R$):")
            );
            
            // Validação dos valores
            if (precoGasolina <= 0 || precoEtanol <= 0) {
                JOptionPane.showMessageDialog(null, 
                    "Os preços devem ser maiores que zero!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Cria o objeto Combustivel
            Combustivel combustivel = new Combustivel(precoGasolina, precoEtanol);
            
            // Obtém os resultados
            String resultado = combustivel.qualMelhor();
            double relacao = combustivel.getRelacao();
            
            // Mensagem de resultado
            String mensagem = String.format(
                "Preço da Gasolina: R$ %.2f\n" +
                "Preço do Etanol: R$ %.2f\n\n" +
                "Relação Etanol/Gasolina: %.1f%%\n" +
                "Limite recomendado: 70%%\n\n" +
                "%s",
                precoGasolina, precoEtanol, relacao, resultado
            );
            
            // Saída de Dados
            JOptionPane.showMessageDialog(null, 
                mensagem,
                "Calculadora de Combustível",
                JOptionPane.INFORMATION_MESSAGE);
                
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, 
                "Digite números válidos!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}