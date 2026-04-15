package models;

import repository.ICalculadora;

public class Calculadora implements ICalculadora {
    private double x;
    private double y;

    public Calculadora(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double somar() {
        return x + y;
    }

    @Override
    public double subtrair() {
        return x - y;
    }

    @Override
    public double multiplicar() {
        return x * y;
    }

    @Override
    public double dividir() {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }
}