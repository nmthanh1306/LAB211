/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author Minh Thanh
 */
public class FiboView {

    FiboCalculator fibo = new FiboCalculator();
    Scanner sc = new Scanner(System.in);

    public void fiboSequences() {
        int maxNumber = Integer.parseInt(sc.nextLine());
        //int maxNumber = 5;
        for (int i = 0; i < maxNumber; i++) {
            if (i < maxNumber - 1) {
                System.out.print(fibo.findFiboSequences(i) + ", ");
            }else{
                System.out.println(fibo.findFiboSequences(i) + "\n");
            }
        }
    }
}
