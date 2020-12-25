/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorizing_method;

import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class FiboView {

    FiboCalculator fibo = new FiboCalculator();
    Scanner sc = new Scanner(System.in);

    public void displayFiboSequences(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "\n");
            }

        }
    }

    public void displayFiboSequences2() {
        int n = 45;
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                System.out.print(fibo.fib2(i) + ",");
            } else {
                System.out.print(fibo.fib2(i) + "\n");
            }

        }
    }
}
