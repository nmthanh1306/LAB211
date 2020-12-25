/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handyexpense;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Minh Thanh
 */
public class Manager {

    List<Expense> list = new ArrayList<>();
    GetInput validate = new GetInput();
    int id = 0;

    public void menu() {

        System.out.println("1. Add an expense");
        System.out.println("2. Display all expense");
        System.out.println("3. Remove an expense");
        System.out.println("4. Exit");
    }

    public void addExpense() {
        System.out.println("===============Add an expense==========");
//        int id = 1;
//        if (!list.isEmpty()) {
//            id = list.get(list.size() - 1).getId() + 1;
//        }
        id++;
//        Date getDate = validate.getDate("Enter date: ", "Please follow the format dd-MM-yyyy");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//        String date = sdf.format(getDate);
        String date = validate.getInputDate("Enter date: ", "Please follow the format dd-MMM-yyyy");
        double amount = validate.getInputDouble("Enter amount", "input a number > 0", 0, Double.MAX_VALUE);
        String content = validate.getInputString("Enter content: ", "Not empty!");
        list.add(new Expense(id, date, amount, content));
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("==========Display all expenses==========");
            double total = 0;
            System.out.printf("%-10s%-30s%-30s%-30s\n", "ID", "Date", "Amout of money", "Content");
            for (Expense expense : list) {
                System.out.printf("%-10d%-30s%-30.0f%-30s\n", expense.getId(), expense.getDate(),
                        expense.getNumber(), expense.getContent());
                total += expense.getNumber();
            }
            System.out.printf("Total: %.0f\n", total);
        }
    }

    public void deleteExpense() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            int iddelete = validate.getInputChoice("Enter ID you want to delete: ", "Can't found", 1, id);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == iddelete) {
                    list.remove(i);
                    System.out.println("Success!");
                    return;
                }
            }
            System.out.println("Not found!");

//                for (int i = iddelete - 1; i < list.size(); i++) {
//                    list.get(i).setId(i + 1);
//                }
//                System.out.println("Delete an expense successful");
//            } else {
//                System.out.println("Delete an expense fail");
//
//            }
        }
    }
}
