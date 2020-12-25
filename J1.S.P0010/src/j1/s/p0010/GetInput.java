/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class GetInput {

    private final Scanner sc = new Scanner(System.in);

    public int inputInt(String msg, String err, int min, int max) {
        while (true) {
            try {
                System.out.println(msg);
                int choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    System.out.println("Please input in range[" + min + " - " + max + "]");
                }
                return choice;
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }

    public int[] RandomArray(int n) {
        Random ran = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ran.nextInt(10);
        }
        return arr;
    }
    
    
}
