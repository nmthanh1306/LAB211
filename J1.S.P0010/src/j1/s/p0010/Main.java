/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0010;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GetInput input = new GetInput();
        Controller con = new Controller();

        int size = input.inputInt("Enter number of array:", "Please input a digit", 1, Integer.MAX_VALUE);
        int[] arr = input.RandomArray(size);
        int number = input.inputInt("Enter search value: ", "Please input a digit", 1, Integer.MAX_VALUE);
        con.displayArray(arr);
        con.linearSearch(arr, number);
    }

}
