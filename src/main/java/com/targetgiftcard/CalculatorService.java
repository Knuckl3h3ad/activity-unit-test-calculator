package com.targetgiftcard;

import java.util.Scanner;

public class CalculatorService {

    private Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int execute(String operation, int a, int b) {

        switch(operation) {
            case "add":
                return calculator.add(a, b);

            case "subtract":
                return calculator.subtract(a, b);

            case "multiply":
                return calculator.multiply(a, b);

            case "divide":
                return calculator.divide(a , b);

            default:
                throw new IllegalArgumentException();
        }
    }

    // vararg
    public int execute(String operation, int a, int... b) {

        if("add".equals(operation)) {
            return calculator.add(a, b);
        }
        throw new IllegalArgumentException();
    }

    // smoke test
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String m = scan.nextLine();
            int i1 = scan.nextInt();
            int i2 = scan.nextInt();

            CalculatorService cs = new CalculatorService(new Calculator());


            System.out.println(cs.execute(m, i1, i2));
        }

    }
}