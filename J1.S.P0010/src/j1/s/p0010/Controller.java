/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Thanh
 */
public class Controller {

    public void displayArray(int[] a) {
        List list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        System.out.print("The array: ");
        System.out.println(list);
    }

    public void linearSearch(int[] a, int n) {
        boolean check = false;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == n) {
                System.out.print("Found " + n + " at index: ");
                check = true;
                break;
            }
        }
        if (check) {
            for (int j = i; j < a.length; j++) {
                if (a[j] == n) {
                    System.out.print(j + " ");
                }
            }
        }else{
            System.out.println("Not found " + n + " in array");
        }
    }
}
