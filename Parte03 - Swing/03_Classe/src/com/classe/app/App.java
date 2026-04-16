package com.classe.app; 

import javax.swing.JOptionPane; 

import com.classe.models.Pessoa;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception { 
        // instancia da classe pessoa  
        Pessoa pessoa = new Pessoa(null, null, null, 0, 0.0);

        // Entrada de dados 
        pessoa.setNome(JOptionPane.showInputDialog("Informe o nome")); 
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade;")));  
        pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura em metros")));  
        pessoa.setCPF(JOptionPane.showInputDialog("Informe o CPF:"));
        pessoa.setEmail(JOptionPane.showInputDialog("Informe o e-mail"));  

        // Saída de dados 

        JOptionPane.showConfirmDialog(null, 
            "Nome:" + pessoa.getNome() +
            "\nIdade:" +pessoa.getIdade() + 
            "\nAltura:" +pessoa.getAltura()+
            "m\nCPF:" + pessoa.getAltura() +
            "\nCPF:" + pessoa.getCPF()+
            "E-mail:" + pessoa.getClass()

        );
    }}