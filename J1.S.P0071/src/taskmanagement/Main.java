/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanagement;

import java.io.File;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Manager ma = new Manager();
        DataInput va = new DataInput();
        while (true) {
            ma.menu();
            int choice = va.checkInputInt("Enter your choice: ", "Please input [1-4]",
                    "input a digit", 1, 4);
            switch (choice) {
                case 1:
                    ma.addTask();
                    break;
                case 2:
                    ma.deleteTask();
                    break;
                case 3:
                    ma.displayTask();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
