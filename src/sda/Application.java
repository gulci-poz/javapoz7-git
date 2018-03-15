package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello");

        Calculator calculator = new Calculator();
        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(calculator.sum(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(calculator.sub(15, 10));
    }
}
