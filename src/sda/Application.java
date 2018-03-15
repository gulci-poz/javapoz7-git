package sda;

import sda.calculator.Calculator;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello");

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(10, 15));
        System.out.println(calculator.sub(15, 10));
    }
}
