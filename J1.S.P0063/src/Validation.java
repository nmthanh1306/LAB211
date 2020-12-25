
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
public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }
    
    public static double checkInputSalary() {
        // loop until user input valid value
        while (true) {
            try {
                double salary = Double.parseDouble(sc.nextLine().trim());
                if (salary <= 0) {
                    System.err.println("Salary is greater than zero");
                } else {
                    return salary;
                }
            } catch (NumberFormatException e) {
                System.err.println("You must input digit");
                System.out.println("Please input salary: ");
            }
        }
    }
    
    
}
