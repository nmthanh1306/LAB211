
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minh Thanh
 */
public class GetInput {

    private static final Scanner in = new Scanner(System.in);

    //check user input number limit
    public static int getInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    System.err.println("Please input number in rage [" + min + ", " + max + "]");
                    System.out.print("Re-enter: ");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input a number");
                System.out.print("Enter again: ");
            }
        }
    }
    //allow user input number double
    public static double getInputDouble(double min, double max, String str1, String str2) {
        //loop until user input correct
        while (true) {
            try {
                double r = Double.parseDouble(in.nextLine().trim());
                if (r < min || r > max) {
                    System.out.print("Please input in range[" + min + ", " + max+"]: ");// in put in range
                } else {
                    return r;
                }
            } catch (NumberFormatException e) {
                System.err.println(str1);
                System.err.println(str2);

            }
        }
    }

    //allow user input operator
    public static String getInputOperator() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            String operator = "+-*/^=";
            if (result.isEmpty()) {
                System.err.println("Not empty");
            } else if (operator.contains(operator)) {
                return result;
            } else {
                System.err.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter again: ");
        }
    }

    //allow user calculator normal
    //display result BMI status
}
