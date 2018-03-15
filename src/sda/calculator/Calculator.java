package sda.calculator;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int factorial(int n) {
        int result = 1;

        while (n > 1) {
            result *= n;
            n--;
        }

        return result;
    }
}
