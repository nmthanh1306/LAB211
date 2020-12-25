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
public class ExpenseView {

    public void displayAllExpense(List<Expense> listExpense) {
        if (listExpense.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("==========Display all expenses==========");
            double total = 0;
            System.out.printf("%-10s%-30s%-30s%-30s\n", "ID", "Date", "Amout of money", "Content");
            for (Expense expense : listExpense) {
                System.out.println(expense.toString());
                total += expense.getNumber();
            }
            System.out.printf("Total: %.0f\n", total);
        }
    }

    public Expense createAnExpense() {

        DataInput in = new DataInput();
        Expense e = new Expense();

        System.out.println("===============Add an expense==========");
        String date = in.inputDate("Enter date: ", "Please follow the format dd-MMM-yyyy");
        e.setDate(date);

        double amount = in.getInputDouble("Enter amount: ", "input a number > 0", 0, Double.MAX_VALUE);
        e.setNumber(amount);

        String content = in.getInputString("Enter content: ", "Not empty!");
        e.setContent(content);

        return e;
    }
    
    public void displayResultDelete(boolean isDelete){
        if(isDelete){
            System.out.println("Delete an expense successfull");
        }else{
            System.out.println("Delete fail");
        }
    }

//    public void deleteAnExpense() {
//        int id = in.inputChoice("Enter id: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
//        if (ma.deleteAnExpense(id) == false) {
//            System.out.println("Delete fail");
//        } else {
//            System.out.println("Delete sucessfull");
//            displayAllExpense();
//        }
//    }
}
