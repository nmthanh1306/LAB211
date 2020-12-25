/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class DataInput {

    private static final Scanner in = new Scanner(System.in);

    //check user input number limit
    public int getInputIntInRange(String msg, String err, int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg);
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }

    public double getInputDouble(String msg, String err) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg);
                double r = Double.parseDouble(in.nextLine().trim());
                return r;
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }

    public double inputBMINumber(String msg, String err) {
        double number = getInputDouble(msg, err);
        return number;
    }

    public double inputNumber() {
        double number = getInputDouble("Enter number: ", "Re-enter!");
        return number;
    }
//
//    public String inputOperator() {
//        while (true) {
//            System.out.print("Operator: ");
//            String result = in.nextLine().trim();
//            if (result.isEmpty()) {
//                System.err.println("Not empty");
//            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
//                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
//                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
//                return result;
//            } else {
//                System.err.println("Please input (+, -, *, /, ^)");
//            }
//            System.out.print("Enter again: ");
//        }
//    }

    public String inputOperator() {
        //loop until user input correct
        while (true) {
            System.out.print("Operator: ");
            String result = in.nextLine().trim();
            String operator = "+-*/^=";
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (operator.contains(result)) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }
}
