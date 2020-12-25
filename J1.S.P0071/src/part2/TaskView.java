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
public class TaskView {

    public Task createAnTask() {
        
        DataInput in = new DataInput();
        Task task = new Task();
        
        System.out.println("---------- Add Task ----------");

        String requirementName = in.checkInputString("Enter name: ", "Not empty");
        task.setRequirementName(requirementName);

        int taskTypeID = in.checkInputInt("Task type: ", 1, 4);
        String taskType = task.changeTaskTypeId(taskTypeID);
        task.setTaskTypeId(taskType);

        String date = in.checkInputDate("Date: ", "Please follow the format dd-MM-yyyy");
        task.setDate(date);

        double fromPlan = in.checkInputTimeDouble("From: ", "Please input 8.0, 8.5, ... 17.0 ", 8, 17);
        task.setPlanFrom(fromPlan);

        double toPlan = in.checkInputTimeDouble("To: ", "Please input " + (fromPlan + 0.5) + ", ... 17.5", (fromPlan + 0.5), 17.5);
        task.setPlanTo(toPlan);

        String assignee = in.checkInputString("Assignee: ", "Not empty!");
        task.setAssignee(assignee);

        String reviewer = in.checkInputString("Reviewer: ", "Not empty!");
        task.setReviewer(reviewer);

        return task;
    }

    public void displayAllTask(List<Task> listTask) {
        
        System.out.println("------------------------Task-----------------------");
        if (listTask.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
            for (Task task : listTask) {
                System.out.print(task.toString());
            }
        }

    }

    public void displayResultDelete(boolean isDelete) {
        if (isDelete) {
            System.out.println("Delete task sucessfull");
        } else {
            System.out.println("Delete fail");
        }
    }
}
