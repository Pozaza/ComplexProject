package org.example;

public class Complex {
    double X, Y;

    public Complex(int x, int y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public String str() {
        return X + " + " + Y + "i";
    }
}
