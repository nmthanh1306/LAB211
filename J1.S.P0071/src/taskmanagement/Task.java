/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmanagement;

import java.io.Serializable;

/**
 *
 * @author Minh Thanh
 */
public class Task implements Serializable{

    private int id;
    private int taskTypeId;
    private String name;
    private String date;
    private double plan_From;
    private double plan_To;
    private String assignee;
    private String reviewer;

    public Task() {
    }

    public Task(int id, String name, int taskTypeId, String date, double fromPlan, double toPlan, String assignee, String reviewer) {
        this.id = id;
        this.taskTypeId = taskTypeId;
        this.name = name;
        this.date = date;
        this.plan_From = fromPlan;
        this.plan_To = toPlan;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFromPlan() {
        return plan_From;
    }

    public void setFromPlan(double fromPlan) {
        this.plan_From = fromPlan;
    }

    public double getPlan_To() {
        return plan_To;
    }

    public void setPlan_To(double plan_To) {
        this.plan_To = plan_To;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return id + ";" + name + ";" + taskTypeId + ";" + date + ";" + (plan_To - plan_From)
                + ";" + assignee + ";" + reviewer;
    }

}
