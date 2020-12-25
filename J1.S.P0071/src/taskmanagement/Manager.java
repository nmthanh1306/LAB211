/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh Thanh
 */
public class Manager {

    List<Task> list = new ArrayList<>();
    DataInput in = new DataInput();

    public void menu() {
        System.out.printf("1. Add Task\n2. Delete Task\n3. Display Task\n4. Exit\n");
    }

    public void writeToFile(List<Task> lt) {

        try {
            FileOutputStream fos;
            fos = new FileOutputStream("task.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lt);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readFromFile() {
        //list.clear();
        try {
            FileInputStream fis = new FileInputStream("task.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addTask() {
        System.out.println("===============Add Task==========");
        int id = 1;
        if (!list.isEmpty()) {// lay last size de tang len 1
            id = list.get(list.size() - 1).getId() + 1;
        }
        String Name = in.checkInputString("Enter Name: ", "Not empty!");

        int TaskTypeID = in.checkInputInt("Task type: ", "Please input[1 - 4]",
                "Please input a digit", 1, 4);

        String Date = in.checkInputDate("Enter date: ", "Please follow the format dd-MM-yyyy");

        String err = "Please input 8.0, 8.5, 9.0, 9.5 ... 17.0";

        double From = in.checkInputTimeDouble("From: ", err, 8.0, 17.0);

        String err2 = " Please input " + (From + 0.5) + " ... 17.5";

        double To = in.checkInputTimeDouble("To: ", err2, From + 0.5, 17.5);

        String Assignee = in.checkInputString("Assign: ", "Not empty!");

        String Reviewer = in.checkInputString("Reviewer: ", "Not empty!");

        list.add(new Task(id, Name, TaskTypeID, Date, From, To, Assignee, Reviewer));

        writeToFile(list);
    }

    public void deleteTask() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            int iddelete = in.checkInputInt("Enter ID you want to delete: ",
                    "Please input integer number", "Can't found", Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (iddelete >= 1 && iddelete <= list.size()) {
                list.remove(iddelete - 1);
                for (int i = iddelete - 1; i < list.size(); i++) {
                    list.get(i).setId(i + 1);
                }
                System.out.println("Delete an task successful");
            } else {
                System.out.println("Delete an task fail");
            }
        }

        writeToFile(list);
    }

    public void displayTask() {
        readFromFile();
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {

            System.out.println("==========Display all Task==========");
            System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
            for (Task task : list) {

                System.out.printf("%-10d%-20s%-20s%-20s%-20.1f%-20s%-20s\n", task.getId(),
                        task.getName(), in.changeTaskType(task.getTaskTypeId()),
                        task.getDate(), (task.getPlan_To() - task.getFromPlan()), task.getAssignee(), task.getReviewer());
            }
        }
    }
}
