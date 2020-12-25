/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Minh Thanh
 */
public class Task {

    private int id;
    private String taskTypeId;
    private String requirementName;
    private String date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String Reviewer;

    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPlanTo() {
        return planTo;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return Reviewer;
    }

    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String changeTaskTypeId(int taskTypeId) {
        String type = "";
        switch (taskTypeId) {
            case 1:
                type = "code";
                break;
            case 2:
                type = "test";
                break;
            case 3:
                type = "manager";
                break;
            case 4:
                type = "learn";
        }
        return type;
    }

    @Override
    public String toString() {
        return String.format("%-10d%-20s%-20s%-20s%-20.1f%-20s%-20s\n",
                id, requirementName, taskTypeId, date, (planTo - planFrom), assignee, Reviewer);
    }
}
