package com.atividade08.app; 

import javax.swing.JOptionPane;

import com.atividade08.models.Pessoa; 



public class App {
    public static void main(String[] args) throws Exception {   

        Pessoa pessoa = new Pessoa (null, 0); 

        pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome:")); 
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:")));

        JOptionPane.showMessageDialog(null, pessoa.resultIdade()); 
        
    }
}
