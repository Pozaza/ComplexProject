package org.example;

public class ComplexUtils {
    public Complex add(Complex first, Complex second) {
        Complex complex = new Complex(0, 0);

        complex.setX(first.getX() + second.getX());
        complex.setY(first.getY() + second.getY());

        return complex;
    }

    public Complex sub(Complex first, Complex second) {
        Complex complex = new Complex(0, 0);

        complex.setX(first.getX() - second.getX());
        complex.setY(first.getY() - second.getY());

        return complex;
    }

    public Complex mul(Complex first, Complex second) {
        Complex complex = new Complex(0, 0);

        complex.setX(first.getX() * second.getX() - first.getY() * second.getY());
        complex.setY(first.getX() * second.getY() + second.getX() * first.getY());

        return complex;
    }

    public Complex div(Complex first, Complex second) {
        if (first.getX() == 0 || second.getX() == 0)
            return null;

        Complex complex = new Complex(0, 0);

        int cube = (int)(Math.pow(second.getX(), 2) + Math.pow(second.getY(), 2));

        complex.setX((first.getX() * second.getX() + first.getY() * second.getY()) / cube);
        complex.setY((first.getY() * second.getX() - first.getX() * second.getY()) / cube);

        return complex;
    }

    public double module(Complex complex)
    {
        return Math.sqrt(Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2));
    }

    public boolean equals(Complex first, Complex second) {
        return first.getX() == second.getX() && first.getY() == second.getY();
    }
}
