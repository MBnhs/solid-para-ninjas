package com.marcelo.cap6.antes;

public class Retangulo {

    private int x;
    private int y;

    public Retangulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculaArea() {
        return x * y;
    }
}
