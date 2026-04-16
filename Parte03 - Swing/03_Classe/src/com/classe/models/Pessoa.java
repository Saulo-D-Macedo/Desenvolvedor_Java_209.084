package com.classe.models;

public class Pessoa {

    // Atributos 

    private String Nome; 
    private String CPF;
    private String email; 
    private int idade; 
    private double altura;  
  
    // Construtor

    public Pessoa(String Nome, String CPF, String email, int idade, double altura) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
    }
    

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
