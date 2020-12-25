/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2_linear;

import java.util.Random;

/**
 *
 * @author Minh Thanh
 */
public class ArrayHandler {

    private int[] dataArr;

    public ArrayHandler(int arrSize) {
        if (arrSize <= 0) {
            arrSize = 0;
        }

        //Khởi tạo và sinh mảng gồm arrSize phần tử là các số ngẫu nhiên từ 0 đến arrSize
        dataArr = new int[arrSize];
        Random objRandom = new Random();
        for (int i = 0; i < arrSize; i++) {
            dataArr[i] = objRandom.nextInt(10);
        }
    }

    public int[] getDataArray() {
        return dataArr;
    }

    public void sortArray() {
        for (int i = 0; i < dataArr.length; i++) {
            for (int j = 0; j < dataArr.length - i - 1; j++) {
                if (dataArr[j] > dataArr[j + 1]) {
                    int temp = dataArr[j];
                    dataArr[j] = dataArr[j + 1];
                    dataArr[j + 1] = temp;
                }
            }
        }
    }

    // Search by linear
    public int searchValue(int searchVal) {
        for (int i = 0; i < dataArr.length; i++) {
            if (dataArr[i] == searchVal) {
                return i;
            }
        }
        return -1;
    }
}
