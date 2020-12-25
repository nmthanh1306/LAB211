/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Minh Thanh
 */
public class FiboCalculator {

    public int fibonacciHelper(int term, int higher, int lower) {
        if (term > 45) {
            return 0;
        } else if (term < 45) {
            //System.out.println("STT " + term + ": " + lower);
            System.out.print(lower + ", ");

        } else {
            //System.out.print(lower);
            System.out.println("STT " + term + ": " + lower);
        }
        return fibonacciHelper(term + 1, lower, lower + higher);
    }

    public int findFiboSequences(int n) {
        if (n == 0 || n == 1) {
            return n;
        }else{
            n = findFiboSequences(n - 2) + findFiboSequences(n - 1);
        }
        return n;
    }

}
