/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.List;

/**
 *
 * @author Minh Thanh
 */
public class Main {

    public static void main(String[] args) {

        DataInput in = new DataInput();
        TaskManager ma = new TaskManager();
        TaskView view = new TaskView();

        int choice;
        while (true) {
            displayMenu();
            choice = in.checkInputInt("Enter your choice: ", 1, 4);
            switch (choice) {
                case 1:
                    Task task = view.createAnTask();
                    ma.addTask(task);
                    break;
                case 2:
                    System.out.println("---------- Delete Task ----------");
                    if(ma.getListData().isEmpty()){
                        System.out.println("List is empty");
                        break;
                    }
                    int id = in.checkInputInt("Enter id: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                    view.displayResultDelete(ma.deleteTask(id));
                    break;
                case 3:
                    List<Task> listTask = ma.getListData();
                    view.displayAllTask(listTask);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

    private static void displayMenu() {
        System.out.println("========== Task Program ==========");
        System.out.println("1. Add task");
        System.out.println("2. Delete task");
        System.out.println("3. Display task");
        System.out.println("4. Exit");
    }
}
