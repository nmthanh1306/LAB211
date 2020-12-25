/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorizing_method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class FiboCalculator {

    public int[] fib1(int n) {
        int[] fibo = null;
        if (n <= 0) {
            return fibo;
        } else if (n == 1) {
            fibo = new int[n];
            return fibo;
        } else {
            fibo = new int[n];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < n; i++) {

                // Add the previous 2 numbers 
                // in the series and store it 
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }

        }
        return fibo;
    }

    public int fib2(int n) {

        // Declare an array to store 
        // Fibonacci numbers. 
        // 1 extra to handle case, n = 0 
        if (n <= 0) {
            return n;
        }
        int f[] = new int[n];

        int i;

        // 0th and 1st number of 
        // the series are 0 and 1 
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i < n; i++) {

            // Add the previous 2 numbers 
            // in the series and store it 
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n - 1] + f[n - 2];
    }
}
