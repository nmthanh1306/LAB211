/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handyexpense;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();
        GetInput val = new GetInput();
        while (true) {
            manager.menu();
            int choice = val.getInputChoice("Enter your choice: ", "Please input [1-4]", 1, 4);
            switch (choice) {
                case 1:
                    manager.addExpense();
                    break;
                case 2:
                    manager.display();
                    break;
                case 3:
                    manager.deleteExpense();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

}
