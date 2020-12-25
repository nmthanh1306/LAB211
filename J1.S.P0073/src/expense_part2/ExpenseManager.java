/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense_part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Thanh
 */
public class ExpenseManager {

    private static int maxId = 0;
    static List<Expense> list = new ArrayList<>();
    private final String fileName;

    public ExpenseManager() {
        fileName = "expense.txt";
        readFromFile();
    }

    public List getListData() {
        return list;
    }

    public void addAnExpense(Expense expense) {

        expense.setId(++maxId);
        list.add(expense);

    }

    public boolean deleteAnExpense(int id) {
        boolean check = false;
        for (Expense expense : list) {
            if (expense.getId() == id) {
                list.remove(expense);
                check = true;

                break;
            }
        }
        return check;
    }

    public void writeToFile() {
        Integer i = maxId;
        try {
            FileOutputStream fos;
            fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.writeObject(i);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        }
    }

    private void readFromFile() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List) ois.readObject();
            maxId = (int) ois.readObject();
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException | ClassNotFoundException ex) {

        }
    }

//    public void writeToFile() {
//        Expense e = new Expense();
//        e.setId(maxId);
//        list.add(e);
//        try {
//            FileOutputStream fos;
//            fos = new FileOutputStream(fileName);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(list);
//            oos.close();
//            fos.close();
//        } catch (FileNotFoundException ex) {
//
//        } catch (IOException ex) {
//
//        }
//    }
//    public void readFromFile() {
//        //list.clear();
//        try {
//            FileInputStream fis = new FileInputStream(fileName);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            list = (List) ois.readObject();
//            maxId = list.get(list.size() - 1).getId();
//            list.remove(list.size() - 1);
//            ois.close();
//            fis.close();
//        } catch (FileNotFoundException ex) {
//
//        } catch (IOException | ClassNotFoundException ex) {
//
//        }
//    }
}
