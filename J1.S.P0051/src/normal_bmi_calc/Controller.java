
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minh Thanh
 */
public class Controller {

    public static void normalCalculator() {
        double memory;
        //System.out.print("Enter number: ");
        memory = inputNumber();
        while (true) {
            System.out.print("Enter operator: ");
            String operator = GetInput.getInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("/")) {
                while (true) {
                    double check = inputNumber();
                    if (check == 0) {
                        System.out.println("khac 0");
                    } else {
                        memory /= check;
                        System.out.println("Memory: " + memory);
                        break;
                    }
                }
            } else if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            } else if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "UNDER - STANDARD";
        } else if (bmi >= 19 && bmi < 25) {
            return "STANDARD";
        } else if (bmi >= 25 && bmi < 30) {
            return "OVERWEIGHT";
        } else if (bmi >= 30 && bmi < 40) {
            return "FAT - SHOULD LOSE WEIGHT";
        } else {
            return "VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY";
        }
    }

    //allow user BMI calculator
    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = GetInput.getInputDouble(1, 1000,
                "BMI must be number", "Enter Weight(kg): ");
        System.out.print("Enter Height(cm): ");
        double height = GetInput.getInputDouble(1, 500,
                "BMI must be number", "Enter Height(cm): ");
        double bmi = weight / (height * height) * 10000;
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }

    //allow user input number
    public static double inputNumber() {
        System.out.print("Enter number: ");
        double number = GetInput.getInputDouble(-Double.MAX_VALUE, Double.MAX_VALUE,
                "Must input number", "Enter number: ");
        return number;
    }

    public static int mennu() {
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = GetInput.getInputIntLimit(1, 3);
        return choice;
    }
}
