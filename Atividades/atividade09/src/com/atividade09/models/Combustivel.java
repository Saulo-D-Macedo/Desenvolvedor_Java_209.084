package com.atividade09.models;

public class Combustivel {
    
    // Atributos
    private double gasolina;
    private double etanol;

    // Construtor
    public Combustivel(double gasolina, double etanol) {
        this.gasolina = gasolina;
        this.etanol = etanol;
    }

    // Getters
    public double getGasolina() {
        return this.gasolina;
    }

    public double getEtanol() {
        return this.etanol;
    }

    // Setters
    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    // Método que faz a comparação
    public String qualMelhor() {
        if (etanol <= 0.70 * gasolina) {
            return "Abasteça seu veículo com ETANOL";
        } else {
            return "Abasteça seu veículo com GASOLINA";
        }
    }

    // Método que retorna a relação porcentagem
    public double getRelacao() {
        return (etanol / gasolina) * 100;
    }
}
