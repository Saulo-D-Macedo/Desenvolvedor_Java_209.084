package com.atividade08.models;

public class Pessoa { 

    // Atributos 
    private String Nome; 
    private int idade;  

    // Construtor 

    public Pessoa(String Nome, int idade) {
        this.Nome = Nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
     
    public String resultIdade() { 

        if(idade >= 18) {
            return "Maior de Idade" ; 


        }else 
            return "Menor de idade";




    }

}
