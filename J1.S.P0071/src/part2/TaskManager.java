/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Thanh
 */
public class TaskManager {

    private static int id = 0;
    static List<Task> list = new ArrayList<>();

    public List getListData() {
        return list;
    }

    public boolean deleteTask(int id) {

        for (Task task : list) {
            if (task.getId() == id) {
                list.remove(task);
                return true;
            }
        }
        return false;
    }

    public void addTask(Task task) {
        task.setId(++id);
        list.add(task);
    }

}
