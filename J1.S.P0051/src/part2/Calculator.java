/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Minh Thanh
 */
public class Calculator {

    public double normalCalculator(double number, double memory, String operator) {
        if (operator.equalsIgnoreCase("+")) {
            memory += number;
            return memory;
        } else if (operator.equalsIgnoreCase("-")) {
            memory -= number;
            return memory;
        } else if (operator.equalsIgnoreCase("*")) {
            memory *= number;
            return memory;
        } else if (operator.equalsIgnoreCase("/")) {
            if (number == 0) {
                throw new ArithmeticException();
            }
            memory /= number;
            return memory;
        } else if (operator.equalsIgnoreCase("^")) {
            memory = Math.pow(memory, number);
            return memory;
        }
        return number;
    }

    public double BMICalculate(double weight, double height) {
        double bmi = weight / (height * height) * 10000;
        return bmi;
    }
    
    public void getBMIStatus(double bmi) {
        if (bmi < 19) {
            System.out.println("UNDER - STANDARD");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("STANDARD");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("OVERWEIGHT");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("FAT - SHOULD LOSE WEIGHT");
        } else {
            System.out.println("VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY");
        }
    }
}
