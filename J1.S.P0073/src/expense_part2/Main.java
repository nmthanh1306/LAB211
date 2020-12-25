/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense_part2;

import java.util.List;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    public static void main(String[] args) {

        DataInput in = new DataInput();
        ExpenseView view = new ExpenseView();
        ExpenseManager ma = new ExpenseManager();

        int choice;
        while (true) {
            displayMenu();
            choice = in.inputChoice("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    Expense expense = view.createAnExpense();
                    ma.addAnExpense(expense);
                    break;
                case 2:
                    List<Expense> listExpense = ma.getListData();
                    view.displayAllExpense(listExpense);
                    break;
                case 3:
                    System.out.println("------Delete an expense------");
                    if (ma.getListData().isEmpty()) {
                        System.out.println("List is empty");
                        break;
                    }
                    int id = in.inputChoice("Enter id: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                    view.displayResultDelete(ma.deleteAnExpense(id));
                    break;
                case 4:
                    ma.writeToFile();
                    System.exit(0);
            }
        }
    }

    private static void displayMenu() {

        System.out.println("1. Add an expense");
        System.out.println("2. Display all expense");
        System.out.println("3. Remove an expense");
        System.out.println("4. Exit");
    }

}
