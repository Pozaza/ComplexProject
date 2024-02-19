package org.example;
public class Main {
    public static void main(String[] args) {
        Complex complex = new Complex(10 ,10);
        Complex complex2 = new Complex(10, 10);

        ComplexUtils utils = new ComplexUtils();

        System.out.println("Комплексное число 1: " + complex.str());
        System.out.println("Комплексное число 2: " + complex2.str());

        System.out.println("Сложение: " + utils.add(complex, complex2).str());
        System.out.println("Разность: " + utils.sub(complex, complex2).str());
        System.out.println("Умножение: " + utils.mul(complex, complex2).str());

        Complex div = utils.div(complex, complex2);

        System.out.println("Деление: " + (div == null ? "На 0 делить нельзя!" : div.str()));
        System.out.println("Модуль: " + utils.module(complex));
        System.out.println("Совпадение: " + utils.equals(complex, complex2));
    }
}