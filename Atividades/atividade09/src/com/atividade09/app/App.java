package com.atividade09.app;

import javax.swing.JOptionPane;

import com.atividade09.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel tanque = new Combustivel(0, 0);

        String[] opcoes = {"Etanol", "Gasolina", "Calcular", "Sair"};
        Object opcao;
        String opcaoEscolhida;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção:", 
                "Melhor combustível", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            opcaoEscolhida = (String) opcao;

            switch (opcaoEscolhida) {
                case "Etanol":
                    tanque.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol:").replace(",", ".")));
                    break;
                case "Gasolina":
                    tanque.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina:").replace(",", ".")));
                    break;
                case "Calcular":
                    JOptionPane.showMessageDialog(null, tanque.melhorCombustivel());
                    break;
            }
        } while (opcao != "Sair");
    }
}
