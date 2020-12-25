/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2_linear;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    public static void main(String[] args) {
        DataInput in = new DataInput();
        
        int arrSize = in.inputInt("Enter number of array:", 1, Integer.MAX_VALUE);
        ArrayHandler array = new ArrayHandler(arrSize);
        printArray(array.getDataArray());

        int number = in.inputInt("Enter number to search: ", 0, Integer.MAX_VALUE);
        int index = array.searchValue(number);
        printFoundIndex(number, index, array.getDataArray());

    }

    private static void printArray(int[] arrData) {
        if (arrData == null) {
            return;
        }

        for (int i = 0; i < arrData.length; i++) {
            System.out.print(arrData[i] + " ");
        }
        System.out.println("");
    }

    private static void printFoundIndex(int number, int valueIndex, int[] Array) {

//        for (int i = 0; i < Array.length; i++) {
//            if (valueIndex != -1) {
//                System.out.print("Found " + number + " at index: " + valueIndex + " ");
//                System.out.println("");
//            }
//        }
        if (valueIndex != -1) {
            System.out.print("Found " + number + " at index: " + valueIndex + " ");
            System.out.println("");
        }else{
            System.out.println("Not found " + number);
        }
    }

}
