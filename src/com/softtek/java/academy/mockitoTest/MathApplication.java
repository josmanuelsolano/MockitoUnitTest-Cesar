package com.softtek.java.academy.mockitoTest;

public class MathApplication {
    private CalculatorService calcService;

    public void setCalculatorService(CalculatorService calcService) {
        this.calcService = calcService;
    }

    public double add(double input1, double input2) {
        return calcService.add(input1, input2);
    }

    public double subtract(double input1, double input2) {
        return calcService.subtract(input1, input2);
    }

    public double multiply(double input1, double input2) {
        return calcService.multiply(input1, input2);
    }

    public double divide(double input1, double input2) {
        return calcService.divide(input1, input2);
    }
    
    public double squareMultipliedNumbers(double input1, double input2) {
        double result=calcService.multiply(input1, input2);
        return result*result;
    }
    
    public double multiplyResultBy100(double input1, double input2) {
        double result=calcService.multiply(input1, input2);
        return result*100;
    }
}