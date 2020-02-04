package com.kodilla;

public class Calculator {

    public void plusMethod(int a, int b) {
        int result1;
                result1 = a+b;
        System.out.println(result1);
    }
    public void minusMethod(int a, int b) {
        int result2;
                result2 = a-b;
        System.out.println(result2);
    }

    public static void main(String args[]) {
        int a;
        int b;
        Calculator calculator = new Calculator();
        calculator.plusMethod(5, 3);
        calculator.minusMethod(7, 2);
    }
}