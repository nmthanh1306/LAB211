/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2_linear;

import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class DataInput {

    private Scanner sc = new Scanner(System.in);

    public int inputInt(String msg, int min, int max) {

        while (true) {
            try {
                System.out.print(msg);
                int value = Integer.parseInt(sc.nextLine());
                if (value < min || value > max) {
                    System.out.println("Please input in range[" + min + " - " + max + "]");
                }
                return value;
            } catch (NumberFormatException e) {
                System.err.println("Please input a digit");
            }
        }
    }
}
