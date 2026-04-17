
package com.lista.app;

import javax.swing.JOptionPane;

import models.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Entrada dos valores
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número:"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número:"));
        
        Calculadora calcula = new Calculadora(valor1, valor2);

        // Array de opções
        String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão", "Sair"};
        String opcao = "";
        
        do {
            opcao = (String) JOptionPane.showInputDialog(
                null,
                "Selecione uma operação:",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );
            
            if (opcao == null || opcao.equals("Sair")) {
                break;
            }
            
            String resultado = "";
            
            switch (opcao) {
                case "Soma":
                    resultado = "Resultado: " + calcula.somar();
                    break;
                case "Subtração":
                    resultado = "Resultado: " + calcula.subtrair();
                    break;
                case "Multiplicação":
                    resultado = "Resultado: " + calcula.multiplicar();
                    break;
                case "Divisão":
                    resultado = "Resultado: " + calcula.dividir();
                    break;
                default:
                    resultado = "Opção inválida!";
            }
            
            JOptionPane.showMessageDialog(null, resultado);
            
        } while (!opcao.equals("Sair"));
        
        JOptionPane.showMessageDialog(null, "Calculadora encerrada!");
    }
}