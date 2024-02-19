package org.example;
public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex(2 ,7);
        Complex complex2 = new Complex(5, 4);

        ComplexUtils utils = new ComplexUtils();

        System.out.println(complex.str());
        System.out.println(complex2.str());

        System.out.println(utils.add(complex, complex2).str());
        System.out.println(utils.sub(complex, complex2).str());
        System.out.println(utils.mul(complex, complex2).str());

        Complex div = utils.div(complex, complex2);

        System.out.println(utils.equals(div, new Complex(0, 0)) ? "На 0 делить нельзя!" : div.str());
        System.out.println(utils.module(complex));
        System.out.println(utils.equals(complex, complex2));
    }
}