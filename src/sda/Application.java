package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {

    public static void main(String[] args) {
        System.out.println("hello");

        Calculator calc = new Calculator();
        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(calc.sum(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(calc.sub(15, 10));
    }
}
